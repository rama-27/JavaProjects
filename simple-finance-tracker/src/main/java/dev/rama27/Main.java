package dev.rama27;

import dev.rama27.console.ConsoleReader;
import dev.rama27.record.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConsoleReader.run();
    }
    public static void printt(List<Transaction> t){
        System.out.println(t);
    }
}



