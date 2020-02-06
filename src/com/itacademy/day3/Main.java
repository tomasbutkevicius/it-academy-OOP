package com.itacademy.day3;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animal someAnimal = new Bird();
        someAnimal.travel(2);
        String amount = "-63";
        try {
            stringToBigDecimal(amount);
        } catch (NumberFormatException e) {
            System.out.println("Whoops: amount was not a num");
        } catch (Exception e) {
            System.out.println("Smth bad happened");
        } finally {
            System.out.println("execution is complete");
        }
        input.close();
    }

    public static BigDecimal stringToBigDecimal(String number) throws Exception {
        return new BigDecimal(number);
    }
}
