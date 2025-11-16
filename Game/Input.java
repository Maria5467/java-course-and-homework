package Game;

import java.util.Scanner;

import static Game.Random.integer;

public class Input {
    public void compare(int number) {
        Scanner new_number = new Scanner(System.in);
        Calculate message=new Calculate();
        if ((number / 1000 > 0) && (number / 1000 < 10)) {
            if (number != integer) {
                message.result(number);
                compare(new_number.nextInt());
            }
            else {
                System.out.println("This is correct");
            }
        }
        else {
            System.out.println("It must be four digits");
            compare(new_number.nextInt());
        }
    }
    }
