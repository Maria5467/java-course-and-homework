package HashMap;

public class Main {
    public static void main(String[] args) {
        Plus.add("Student-1",123313,"Igor","igor@email.com");
        Plus.add("Person-1",453343,"Vasya","vasiliy@email.com");
        Plus.add("Person-2",556764,"Vera","vera@email.com");
        Plus.add("Student-1",546374,"Vita","vita@email.com");
        Minus.delete("Student-1");
        Search.find(556764);
        allContacts.print();
    }
}
