package HashMap;

import static HashMap.ContactBook.contactHashMap;
import static HashMap.ContactBook.data;

public class Search {
    public static void find(int pn) {
        Contact contact =null;
        for (int i = 0; i < contactHashMap.size(); i++) {
            contact = contactHashMap.get(data.get(i));
            if ((contact!=null) && contact.phoneNumber == pn) {
                System.out.println(data.get(i)+": " + contact.name + ", " + contact.email);
                break;
            }
        }
        if ((contact==null) || contact.phoneNumber != pn) {
            System.out.println("This phone number is not found");
        }
    }
}
