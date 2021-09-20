package contacts;

import java.util.ArrayList;

    public class PhoneBook {
    private ArrayList<ContactList> contacts = new ArrayList<>();

    public String addContact (ContactList contact){
        this.contacts.add(contact);
        return contact.name + "Contact added";

    }


    public ArrayList<ContactList> getAllContacts(){

        return contacts;
    }



    public ContactList findByName(String name){
        for (ContactList contact : contacts){
            if (contact.name.equals(name)){
                return contact;
            }
        }
        return null;
    }

    public ContactList findByPhone(String phoneNumber){
        for (ContactList contact : contacts){
            if (contact.phoneNumber.equals(phoneNumber)){
                return contact;
            }
        }
        return null;
    }

        public ContactList findByEmail(String email){
            for (ContactList contact : contacts){
                if (contact.email.equals(email)) {
                    return contact;
                }
            }
            return null;

    }

        public ContactList removeContact(int contactIndex){
        return contacts.remove(contactIndex);

        }


        public ContactList updateByName(int contactIndex, ContactList contact){
        return contacts.set(contactIndex, contact);
        }

        public ContactList updateByPhone(int contactIndex, ContactList contact){
            return contacts.set(contactIndex, contact);
        }

        public ContactList updateByEmail(int contactIndex, ContactList contact){
            return contacts.set(contactIndex, contact);
        }

        public ArrayList<ContactList> findByPartName(String partName){
        ArrayList<ContactList> newContact = new ArrayList<ContactList>();
            for (ContactList contact : newContact){
                if (contact.name.contains(partName)){
                    newContact.add(contact);
                }
            }
            return contacts;
        }














}