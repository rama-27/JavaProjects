package dev.rama27.console;

import dev.rama27.enums.Category;
import dev.rama27.enums.TransactionType;
import dev.rama27.record.Transaction;
import dev.rama27.service.TransactionManager;

import java.util.*;

import static dev.rama27.enums.TransactionType.EXPENSE;
import static dev.rama27.enums.TransactionType.INCOME;

public class ConsoleReader {
    TransactionManager tm = new TransactionManager();

    public static void run() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean loop=true;
        int choice=0;
        System.out.println("Welcome to Finance Tracker:");
        System.out.println("1: check balance");
        System.out.println("2: Add Transaction");
        System.out.println("3: View Transactions");
        System.out.println("4: View Report");
        while(loop){
            Thread.sleep(1000);
            System.out.println("pick a choice");
            choice=scanner.nextInt();
            TransactionManager tm = new TransactionManager();

            switch (choice){
                case 1:
                    System.out.println(tm.getBal());
                    break;
                case 2:
                    UUID id=  UUID.randomUUID();
                    Date date= new Date();
                    System.out.println("is it and expense or income");
                    System.out.println("Enter 0 for expense and 1 for income");
                    int temp=scanner.nextInt();
                    TransactionType type;
                    if(temp==0){
                         type= EXPENSE;
                    } else if (temp==1) {
                        type= INCOME;
                    }
                    else{
                        System.out.println("wrong input");
                        break;
                    }
                    Category category = null;
                    System.out.println("Enter category \n 1. Food \n 2. Rent \n " +
                            "3. Shopping \n 4. Salary");
                    temp=scanner.nextInt();
                    if(temp==1){
                        category=Category.FOOD;
                    } else if (temp==2) {
                        category=Category.RENT;
                    } else if (temp==3) {
                        category=Category.SHOPPING;
                    } else if (temp==4) {
                        category=Category.SALARY;
                    }
                    System.out.println("Enter amount");
                    double amount= scanner.nextInt();
                    System.out.println("Enter Description");
                    String description=scanner.nextLine();
                    Transaction t= new Transaction(id, date,amount,type,category,description);
                    tm.addTransaction(t);
                    System.out.println("successfull");
                    break;
                case 3:
                    System.out.println("1. Get all Transaction " +
                            "2. Get Transaction by type " +
                            "3. Get Transacitons by category");
                    choice=scanner.nextInt();
                    if(choice==1){
                        System.out.println(tm.getAllTransactions());
                    }else if(choice==2){
                        System.out.println("select Type 1. EXPENSE 2. INCOME");
                        choice= scanner.nextInt();
                        TransactionType types = null;
                        if(choice==1){
                            System.out.println(tm.getTransactionsByType(EXPENSE));
                        } else if (choice==2) {
                            System.out.println(tm.getTransactionsByType(INCOME));
                        }
                    }else if(choice==3) {
                        System.out.println("select Type 1. Food 2. SHOPPING 3. RENT 4. SALARY");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            System.out.println(tm.getTransactionByCategory(Category.FOOD));
                        } else if (choice == 2) {
                            System.out.println(tm.getTransactionByCategory(Category.SHOPPING));
                        } else if (choice == 3) {
                            System.out.println(tm.getTransactionByCategory(Category.RENT));
                        } else if (choice == 4) {
                            System.out.println(tm.getTransactionByCategory(Category.SALARY));
                        }
                    }
                    break;

                default:
                    System.out.println("INVALID OPTION TRY AGAIN");
            }


        }
//        TransactionManager tm = new TransactionManager();
//        List<Transaction> l = tm.getTransactionsByType(TransactionType.INCOME);
//
//        System.out.println(tm.getBal());
//
//        tm.summary(Category.RENT);


    }


}
