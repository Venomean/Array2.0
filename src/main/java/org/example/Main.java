package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 10, 7, 8, 9, };

        int sum = 0;
        for (int number : numbers) {
            System.out.println(number);

            sum += number;


        }
        System.out.println(sum);
        int maxNumber = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Die höchste Zahl ist: " + maxNumber);


        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, };

        int [] sumArray = new int [numbers.length];

        for (int i = 0; i < sumArray.length; i++ ) {
            sumArray[i]=numbers[i]+numbers2[i];
        }
        System.out.println(Arrays.toString(sumArray));


    }


};