package Game;

import java.util.random.RandomGenerator;

public class Random {
    static final int integer=RandomGenerator.getDefault().nextInt(1000, 9999);
    int digit=integer/1000;
    int sdigit=(integer%1000)/100;
    int tdigit=(integer%100)/10;
    int fdigit=integer%10;
}
