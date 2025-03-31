package dev.rama27.filesync.sync;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileSynchronizer {
    public void copyFile(Path source,Path dest){
        try{
            Files.copy(source,dest, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
    }

    public void deleteFile(Path path){
        try{
            Files.delete(path);
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
