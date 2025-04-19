package dev.rama27.onlinebookstore.book;

public class BookAlreadyExist extends Throwable {
    public BookAlreadyExist(String s) {
        super(s);
        System.out.println(s);
    }
}
