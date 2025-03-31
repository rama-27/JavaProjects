package dev.rama27.filesync.logger;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private FileWriter fileWriter;

    public Logger(String logFilePath){
        try{
            fileWriter=new FileWriter(logFilePath,true);
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public void log(String msg){
        try{
            fileWriter.write(msg+" \n");
            fileWriter.flush();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public void close(){
        try{
            fileWriter.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
