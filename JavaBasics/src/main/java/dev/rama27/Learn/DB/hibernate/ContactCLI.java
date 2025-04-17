package dev.rama27.Learn.DB.hibernate;

import java.util.List;
import java.util.Scanner;

public class ContactCLI {
    private final ContactDAO contactDAO;
    private final Scanner scanner;
    
    public ContactCLI(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        boolean running = true;
        
        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    createContact();
                    break;
                case 2:
                    viewAllContacts();
                    break;
                case 3:
                    viewContactById();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    deleteContact();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private void displayMenu() {
        System.out.println("\n===== Contact Management System =====");
        System.out.println("1. Create a new contact");
        System.out.println("2. View all contacts");
        System.out.println("3. Find contact by ID");
        System.out.println("4. Update a contact");
        System.out.println("5. Delete a contact");
        System.out.println("0. Exit");
        System.out.println("=====================================");
    }
    
    private void createContact() {
        System.out.println("\n--- Create New Contact ---");
        String name = getStringInput("Enter name: ");
        String email = getStringInput("Enter email: ");
        String phone = getStringInput("Enter phone: ");
        
        Contact contact = new Contact(name, email, phone);
        contactDAO.save(contact);
        
        System.out.println("Contact created successfully!");
    }
    
    private void viewAllContacts() {
        System.out.println("\n--- All Contacts ---");
        List<Contact> contacts = contactDAO.findAll();
        
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
    
    private void viewContactById() {
        System.out.println("\n--- Find Contact by ID ---");
        Long id = getLongInput("Enter contact ID: ");
        
        Contact contact = contactDAO.findById(id);
        if (contact == null) {
            System.out.println("Contact not found with ID: " + id);
        } else {
            System.out.println(contact);
        }
    }
    
    private void updateContact() {
        System.out.println("\n--- Update Contact ---");
        Long id = getLongInput("Enter contact ID to update: ");
        
        Contact contact = contactDAO.findById(id);
        if (contact == null) {
            System.out.println("Contact not found with ID: " + id);
            return;
        }
        
        System.out.println("Current contact: " + contact);
        
        String name = getStringInput("Enter new name (or leave empty to keep current): ");
        if (!name.isEmpty()) {
            contact.setName(name);
        }
        
        String email = getStringInput("Enter new email (or leave empty to keep current): ");
        if (!email.isEmpty()) {
            contact.setEmail(email);
        }
        
        String phone = getStringInput("Enter new phone (or leave empty to keep current): ");
        if (!phone.isEmpty()) {
            contact.setPhone(phone);
        }
        contactDAO.update(contact);
        System.out.println("Contact updated successfully!");
    }
    
    private void deleteContact() {
        System.out.println("\n--- Delete Contact ---");
        Long id = getLongInput("Enter contact ID to delete: ");
        
        Contact contact = contactDAO.findById(id);
        if (contact == null) {
            System.out.println("Contact not found with ID: " + id);
            return;
        }
        
        System.out.println("Contact to delete: " + contact);
        String confirm = getStringInput("Are you sure you want to delete this contact? (y/n): ");
        
        if (confirm.equalsIgnoreCase("y")) {
            contactDAO.delete(id);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Delete operation cancelled.");
        }
    }
    
    private String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    private int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private Long getLongInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Long.parseLong(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

}
