package dz_lesson12;

import java.util.Scanner;

public class Factorial_4_16 {
    public static void main(String[] args) {
        Scanner numbFactor = new Scanner(System.in);
        System.out.print("Введите число от 4 до 16: ");
        int number = numbFactor.nextInt();
        int factorial = 1;
        if (number > 3 && number < 17) {
            for (int i = 1; i < number+1; i++){
                factorial = factorial*i;
            }
            System.out.println("Факториал числа " + number + " равен " + factorial);
        }
        else {
            System.out.println("Эта программа не считает факториал числа " + number);
        }
    }



}
