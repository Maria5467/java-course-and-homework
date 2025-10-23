package HashMap;

import static HashMap.ContactBook.contactHashMap;
import static HashMap.ContactBook.data;

public class allContacts {
    public static void print() {
        Contact contact=null;
        for (int i=0;i<contactHashMap.size();i++) {
            contact=contactHashMap.get(data.get(i));
            System.out.println(data.get(i)+": "+contact.phoneNumber + ", " + contact.name + ", " + contact.email);
        }
        if (contact==null) {
            System.out.println("There are not contacts");
        }
    }
}
