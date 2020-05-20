package ir.aut.homework2.hw4;

public class AddressBook {
    private Contact contactKeeper[] = new Contact[100];

    private int contactCounter = 0;

    public int getContactCounter() {
        return contactCounter;
    }

    public void setContactCounter(int contactCounter) {
        this.contactCounter = contactCounter;
    }

    public Contact[] getContactKeeper() {
        return contactKeeper;
    }

    public void addToKeeper(Contact contact) {
        if (contactCounter < 100) {
            contactKeeper[contactCounter] = contact;
            contactCounter++;
        }
    }

    public void removeFromKeeper(String removal) {
        int i;
        for (i = contactCounter; i > 0; i--) {
            if (removal.equals(this.contactKeeper[i-1].getName()) || removal.equals(this.contactKeeper[i-1].getNumber())) {
                for (int j = i; j < contactCounter; j++) {
                    contactKeeper[j-1] = this.contactKeeper[j];
                }
                contactCounter--;
                i = contactCounter;

            }
        }
    }

    public void newArray() {
        for (int i = 0; i < 100; i++)
            this.contactKeeper[i] = new Contact("", "");
    }

    public void printContact(Contact[] contactArray) {
        for (int i = 0; i < contactCounter; i++) {
            System.out.println(++i + ". " + this.contactKeeper[--i].toString());
        }
    }
}
