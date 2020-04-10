package dz_lesson12;

import java.util.Scanner;

public class RandomNumberArray {
    public static void main(String[] args) {
        Scanner rowNumber = new Scanner(System.in);
        Scanner colNumber = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int nrow = rowNumber.nextInt();
        System.out.print("Введите количество столбцов: ");
        int ncol = colNumber.nextInt();
        int [][] randomNumbArr = new int [nrow][ncol];
        for (int i = 0; i < nrow; i++){
            for (int j = 0; j < ncol; j++){
                randomNumbArr[i][j] = Math.round((int)(Math.random()*10));
                System.out.print(randomNumbArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
