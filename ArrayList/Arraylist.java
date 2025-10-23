package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("yellow");
        colors.add("orange");
        System.out.println("list before:");
        Arrayprint.list_print(colors);//1
        System.out.println("iterator:");
        System.out.println(colors.iterator());//2
        colors.add(0, "green");
        System.out.println(colors.get(1));//3
        colors.remove(2);
        System.out.println(colors.indexOf("red"));//4
        Collections.sort(colors);
        System.out.println("list after:");
        Arrayprint.list_print(colors);//5
        ArrayList colors2 = (ArrayList) colors.clone();
        Collections.sort(colors, Collections.reverseOrder());
        colors.equals(colors2);
        colors2.clear();
        colors2.isEmpty();
        colors.ensureCapacity(6);
        colors.trimToSize();
    }
}
