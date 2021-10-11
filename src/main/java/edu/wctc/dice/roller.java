package edu.wctc.dice;

import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class roller {


    static int rollDie() {
        Random random = new Random();
        int dieType = random.nextInt(4) + 1;

        if (dieType == 1) {
            return random.nextInt(6) + 1;
        } else if (dieType == 2) {
            return random.nextInt(8) + 1;
        } else if (dieType == 3) {
            return random.nextInt(10) + 1;
        } else {
            return random.nextInt(20) +1;
        }
    }

}

