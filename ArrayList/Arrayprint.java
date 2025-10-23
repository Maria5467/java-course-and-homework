package ArrayList;

import java.util.ArrayList;

public class Arrayprint {
    public static void list_print(ArrayList<String> list) {
        for (int i=0;i<list.size();i++) {
            String s= list.get(i);
            System.out.println(s);
        }
    }
}
