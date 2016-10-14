package com.company;
import java.util.Random;
/**
 * Created by Same on 10/12/2016.
 */
public class perfectRandom {
    Random rand = new Random();
    private int randInt;
    public int randomInteger(){
        randInt = rand.nextInt(1000);
        randInt = randInt * randInt;
        return randInt;
    }
}