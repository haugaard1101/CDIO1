package com.company;
import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int faceValue1 = random.nextInt(6)+1;
        int faceValue2 = random.nextInt(6)+1;
        int sum = faceValue1 + faceValue2;


        System.out.println(faceValue1);
        System.out.println(faceValue2);
        System.out.println(sum);













    }
}
