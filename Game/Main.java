package Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Guess four digits of number");
        Input insert =new Input();
        Scanner console=new Scanner(System.in);
        int usernumber= console.nextInt();
        insert.compare(usernumber);
    }
}
