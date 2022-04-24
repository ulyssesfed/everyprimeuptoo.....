package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max = GetInput("Enter the maximum number of the range");//prompts user for max number
        for (int i = 0; i < max; i++) {//i is the number to check
            if (isPrime(i)) { //if the number is prime
                System.out.println(i); //print it
            }

        }


    }
    public static int GetInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static boolean isPrime(int num){
        if (num == 1){
            return false; // 1 is not prime
        }
        for (int i = 2; i < num; i++){ //i is the divisor
            if (num % i == 0){ //if the number is divisible by i
                return false; //it is not prime
            }
        }
        return true;
    }
    System.out.println("")
}
