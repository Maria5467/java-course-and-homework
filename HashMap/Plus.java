package HashMap;

import static HashMap.ContactBook.data;

public class Plus {
    public static void add(String s, int pn, String nm, String em) {
        if (data.contains(s)) {
            System.out.println("There is already "+s);
        }
        else {
            Contact contact = new Contact();
            contact.phoneNumber=pn;
            contact.name=nm;
            contact.email=em;
            ContactBook.contactHashMap.put(s,contact);
            data.add(s);
        }
    }
}
