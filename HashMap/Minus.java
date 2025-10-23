package HashMap;

public class Minus {
    public static void delete(String s) {
        if (!ContactBook.contactHashMap.containsKey(s)) {
            System.out.println("There is not "+s);
        }
        ContactBook.contactHashMap.remove(s);
        ContactBook.data.remove(s);
    }
}
