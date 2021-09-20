import contacts.ContactList;
import contacts.PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    PhoneBook phoneBook = new PhoneBook();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.phoneBookMenu();

    }

    void phoneBookMenu() {
        String usersInput = "";

        do {
            System.out.println("\nI am your Phonebook. What would you like to do?");
            System.out.println("1. Add contact");
            System.out.println("2. See all contacts");
            System.out.println("3. Find contact by name");
            System.out.println("4. Find contact by phone number");
            System.out.println("5. Find contact by email");
            System.out.println("6. Update contact by name");
            System.out.println("7. Update contact by phone number");
            System.out.println("8. Update contact by email");
            System.out.println("9. Remove contact");
            System.out.println("10. Find contact by part of the name");
            System.out.println("\nEnter Quit to finish...");

            System.out.println("Choose a number: ");
            usersInput = scanner.nextLine();

            switch (usersInput) {

                case "Quit", "quit", "QUIT":
                    System.out.println("You Quit the phonebook");
                    break;

                case "1":
                    addContact();
                    break;

                case "2":
                    viewAllContacts();
                    break;

                case "3":
                    findByName();
                    break;
                case "4":
                    findByPhone();
                    break;
                case  "5":
                    findByEmail();
                    break;

                case "6":
                    updateByName();
                    break;
                case "7":
                    updateByPhone();
                    break;
                case "8":
                    updateByEmail();
                    break;

                case "9":
                    removeContact();
                    break;
                case "10":
                    findByPartName();
                    break;
                default:
                    break;
            }

        } while (!usersInput.equalsIgnoreCase("Quit"));
        return;

    }


    void addContact() {

        System.out.println("Add contact");

        ContactList contact = new ContactList();
        System.out.println("Enter contacts name: ");
        contact.name = scanner.nextLine();

        System.out.println("Enter phone number: ");
        contact.phoneNumber = scanner.nextLine();


        System.out.println("Enter email: ");
        contact.email = scanner.nextLine();

        String massage = phoneBook.addContact(contact);
        System.out.println(massage);


    }
    void viewAllContacts(){
        ArrayList<ContactList> allContacts = phoneBook.getAllContacts();

        System.out.println("All  your contacts:");
        System.out.println("Name,\tPhone number,\tEmail");

        for (ContactList contact : allContacts){
            System.out.println(contact.name + "\t" + contact.phoneNumber + "\t\t\t" + contact.email);
        }

    }




    void findByName() {
        System.out.println("Find contact by name.");
        System.out.println("Enter contact name:");

        String contactName = scanner.nextLine();
        ContactList contact = phoneBook.findByName(contactName);

        System.out.println("Contact name: " + contact.name);
        System.out.println("Contact phone number: " + contact.phoneNumber);
        System.out.println("Contact email: " + contact.email);

    }

    void findByPhone() {
        System.out.println("Find contact by phone number.");
        System.out.println("Enter contact phone number:");

        String contactPhoneNumber = scanner.nextLine();
        ContactList contact = phoneBook.findByPhone(contactPhoneNumber);

        System.out.println("Contact name: " + contact.name);
        System.out.println("Contact phone number: " + contact.phoneNumber);
        System.out.println("Contact email: " + contact.email);

    }

    void findByEmail() {
        System.out.println("Find contact by email.");
        System.out.println("Enter contact email:");

        String contactEmail = scanner.nextLine();
        ContactList contact = phoneBook.findByEmail(contactEmail);

        System.out.println("Contact name: " + contact.name);
        System.out.println("Contact phone number: " + contact.phoneNumber);
        System.out.println("Contact email: " + contact.email);

    }

    void removeContact(){
        System.out.println("Remove contact.");
        System.out.println("Enter contact name to remove it: ");
        String contactName = scanner.nextLine();

        ContactList contact = phoneBook.findByName(contactName);


        int contactIndex = phoneBook.getAllContacts().indexOf(contact);
        phoneBook.removeContact(contactIndex);
        System.out.println(contactName + " removed successfully");

    }

    void updateByName(){
        System.out.println("Update contact...");
        System.out.println("Enter contact name:");
        String contactName = scanner.nextLine();

        ContactList contact =phoneBook.findByName(contactName);

        int contactIndex = phoneBook.getAllContacts().indexOf(contact);
        System.out.println("Enter the property you would like to change:");
        String property = scanner.nextLine();

        System.out.println("Enter the new value of: " + property);
        String value = scanner.nextLine();

        switch (property){
            case "name":
                contact.name = value;
                break;
            case "phone number":
                contact.phoneNumber = value;
                break;
            case "email":
                contact.email = value;
                break;
            default:
                System.out.println("Please provide a valid property");
                break;
        }

        phoneBook.updateByName(contactIndex, contact);
        System.out.println(property + " updated successfully");
    }

    void updateByPhone(){
        System.out.println("Update contact...");
        System.out.println("Enter contact phone number:");
        String contactPhoneNumber = scanner.nextLine();

        ContactList contact =phoneBook.findByPhone(contactPhoneNumber);

        int contactIndex = phoneBook.getAllContacts().indexOf(contact);
        System.out.println("Enter the property you would like to change:");
        String property = scanner.nextLine();

        System.out.println("Enter the new value of: " + property);
        String value = scanner.nextLine();

        switch (property){
            case "name":
                contact.name = value;
                break;
            case "phone number":
                contact.phoneNumber = value;
                break;
            case "email":
                contact.email = value;
                break;
            default:
                System.out.println("Please provide a valid property");
                break;
        }

        phoneBook.updateByPhone(contactIndex, contact);
        System.out.println(property + " updated successfully");
    }


    void updateByEmail(){
        System.out.println("Update contact...");
        System.out.println("Enter contact email:");
        String contactEmail = scanner.nextLine();

        ContactList contact =phoneBook.findByEmail(contactEmail);

        int contactIndex = phoneBook.getAllContacts().indexOf(contact);
        System.out.println("Enter the property you would like to change:");
        String property = scanner.nextLine();

        System.out.println("Enter the new value of: " + property);
        String value = scanner.nextLine();

        switch (property){
            case "name":
                contact.name = value;
                break;
            case "phone number":
                contact.phoneNumber = value;
                break;
            case "email":
                contact.email = value;
                break;
            default:
                System.out.println("Please provide a valid property");
                break;
        }

        phoneBook.updateByEmail(contactIndex, contact);
        System.out.println(property + " updated successfully");
    }

    void findByPartName() {
        System.out.println("Find contact by part of the name.");
        System.out.println("Enter part of the contact name:");

        String contactName = scanner.nextLine();
        ArrayList<ContactList> newContact = phoneBook.findByPartName(contactName);

        for (ContactList contact : newContact){
            System.out.println(contact.name + "\t" + contact.phoneNumber + "\t\t\t" + contact.email);
        }


    }





}
