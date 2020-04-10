package dz_lesson12;

import java.util.Scanner;

public class WallPaper {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите количество полос: ");
        int n = number.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 7; j++){
                for (int k = 0; k < 3; k++){
                    if (j%2 == 0){
                        System.out.print("*");
                    }
                    else {
                        System.out.print("+");
                    }
                }
            }
            System.out.println();
        }

    }
}
