package dev.rama27.service;

import dev.rama27.enums.Category;
import dev.rama27.enums.TransactionType;
import dev.rama27.record.Transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TransactionManager {
    public static List<Transaction> DB;

    // initialize the DB
    static {
        DB = new ArrayList<>(List.of(
                new Transaction(UUID.randomUUID(), new Date(), 100, TransactionType.EXPENSE, Category.FOOD, "Bought Groceries"),
                new Transaction(UUID.randomUUID(), new Date(), 200, TransactionType.EXPENSE, Category.SHOPPING, "Bought Clothes")
        ));
    }

    public static List<Transaction> getAllTransactions() {
        return DB;
    }

    public List<Transaction> getTransactionsByType(TransactionType type) {
        return DB.stream().filter(x -> x.type() == type).toList();
    }

    public List<Transaction> getTransactionByCategory(Category category) {
        return DB.stream().filter(x -> x.category() == category).toList();
    }

    public long getBal() {
        var bal = new Object() {
            long sum = 0;
        };
        DB.stream().forEach(x -> {

            if (x.type() == TransactionType.INCOME) {
                bal.sum += x.amount();
            }
        });
        return bal.sum;
    }

    public void summary(Category category) {
        var sum = new Object() {
            double s;
        };
        DB.stream().forEach(x -> {
            if (x.category() == category) {
                sum.s += x.amount();
            }
        });
        if (category == Category.FOOD || category == Category.RENT || category == Category.SHOPPING) {
            System.out.println("YOU HAVE SPENT " + sum.s + " on " + category);
        } else {
            System.out.println("You earned " + sum.s + " on " + category);
        }

    }

    public void addTransaction(Transaction transaction){
        DB.add(transaction);
    }
}
