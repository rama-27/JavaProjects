package dev.rama27.filesync;

import dev.rama27.filesync.config.ConfigLoader;
import dev.rama27.filesync.logger.Logger;
import dev.rama27.filesync.monitor.DirectoryMonitor;
import dev.rama27.filesync.sync.FileSynchronizer;


public class Main {
    public static void main(String[] args) {
        ConfigLoader configLoader=new ConfigLoader("file-sync-tool/src/main/resources/config.properties");
        String sourceDir = configLoader.getProperty("src.dir");
        String destDir = configLoader.getProperty("dest.dir");
        String logFile =configLoader.getProperty("log.file");

        Logger logger = new Logger(logFile);
        FileSynchronizer fileSynchronizer=new FileSynchronizer();
        DirectoryMonitor directoryMonitor=new DirectoryMonitor(sourceDir,destDir,logger);

        logger.log("Starting directory monitorring .....");
        directoryMonitor.monitorDirectory();
        logger.log("Direcotry monitoring stopper");
        logger.close();

    }
}