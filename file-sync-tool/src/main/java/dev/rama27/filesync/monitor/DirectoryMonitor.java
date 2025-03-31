package dev.rama27.filesync.monitor;

import dev.rama27.filesync.logger.Logger;
import dev.rama27.filesync.sync.FileSynchronizer;

import java.io.IOException;
import java.nio.file.*;

public class DirectoryMonitor {
    private WatchService watchService;
    private Path path;
    private Path dPath;
    private FileSynchronizer fileSynchronizer;
    private Logger logger;
    public DirectoryMonitor(String dirPath,String destPath,Logger logger){
        try{
            this.path= Paths.get(dirPath);
            this.dPath=Paths.get(destPath);
            this.logger=logger;
            this.watchService= FileSystems.getDefault().newWatchService();
            path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_MODIFY,StandardWatchEventKinds.ENTRY_DELETE);
            this.fileSynchronizer=new FileSynchronizer();
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
    }
    public void monitorDirectory(){
        WatchKey key;
        while(true){
            try{
                key=watchService.take();
                for(WatchEvent<?> event: key.pollEvents()){
                    WatchEvent.Kind<?> kind= event.kind();
                    Path filePath=(Path) event.context();
                    Path sourcePath=path.resolve(filePath);
                    Path destPath=dPath.resolve(filePath);

                    if(kind== StandardWatchEventKinds.ENTRY_CREATE || kind== StandardWatchEventKinds.ENTRY_MODIFY){
                        fileSynchronizer.copyFile(sourcePath,destPath);
                        logger.log(kind.name()+": "+ filePath.toString());
                    }else if(kind== StandardWatchEventKinds.ENTRY_DELETE){
                        fileSynchronizer.deleteFile(destPath);
                        logger.log(kind.name()+": "+ filePath.toString());
                    }

                    System.out.println(kind.name()+": " + filePath);
                }
                key.reset();
            }
            catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
