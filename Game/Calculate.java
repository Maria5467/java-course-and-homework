package Game;

public class Calculate {
    public void result(int number) {
        Random this_number=new Random();
        int green=0;
        int yellow=0;
        if (number/1000==this_number.digit) {
            green++;
        }
        else {
            if ((number / 1000 == this_number.sdigit) && ((number % 1000) / 100 != this_number.sdigit)) {
                yellow++;
            } else if ((number / 1000 == this_number.tdigit) && ((number % 100) / 10 != this_number.tdigit)) {
                yellow++;
            } else if ((number / 1000 == this_number.fdigit)&&(number%10!=this_number.fdigit)) {
                yellow++;
            }
        }
        if ((number%1000)/100==this_number.sdigit) {
            green++;
        }
        else {
            if (((number%1000)/100 == this_number.digit) && (number/ 1000 != this_number.digit)) {
                yellow++;
            } else if (((number%1000)/100== this_number.tdigit) && ((number % 100) / 10 != this_number.tdigit)) {
                yellow++;
            } else if (((number%1000)/100== this_number.fdigit)&&(number%10!=this_number.fdigit)) {
                yellow++;
            }
        }
        if ((number%100)/10==this_number.tdigit) {
            green++;
        }
        else {
            if (((number%100)/10 == this_number.digit) && (number/ 1000 != this_number.digit)) {
                yellow++;
            } else if (((number%100)/10== this_number.sdigit) && ((number % 1000) / 100 != this_number.sdigit)) {
                yellow++;
            } else if (((number%100)/10== this_number.fdigit)&&(number%10!=this_number.fdigit)) {
                yellow++;
            }
        }
        if (number%10==this_number.fdigit) {
            green++;
        }
        else {
            if ((number%10 == this_number.digit) && (number/ 1000 != this_number.digit)) {
                yellow++;
            } else if ((number%10== this_number.sdigit) && ((number % 1000) / 100 != this_number.sdigit)) {
                yellow++;
            } else if ((number%10== this_number.tdigit)&&((number%100)/10!=this_number.tdigit)) {
                yellow++;
            }
        }
        System.out.println(green+" correct in right place; "+yellow+" correct, but in wrong place");
    }
}
