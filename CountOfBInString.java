package dz_lesson12;

import java.util.Scanner;

public class CountOfBInString {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.print("Please, input the string: ");
        String stringForCountB = string.nextLine();
        int k = 0;
        for (char str : stringForCountB.toCharArray()){
            if(str == 'b' || str == 'B'){
                k++;
            }
        }
        if (k>0){
            System.out.println("The number of the symbol \"b\": " + k);
        }
        else{
            System.out.println("There is no symbol \"b\"");
        }

    }
}
