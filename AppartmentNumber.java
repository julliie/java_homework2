package dz_lesson12;

import java.util.Scanner;

public class AppartmentNumber {
    public static void main(String[] args) {
        Scanner appartNumber = new Scanner(System.in);
        System.out.print("Введите номер квартиры: ");
        int n = appartNumber.nextInt();
        if (n<145 && n>0){
            int porch = (n-1)/36+1;
            int floor = (n-1)%36/4+1;
            System.out.println("Квартира " + n + " находится на " + floor + " этаже в " + porch + " подъезде");
        }
        else {
            System.out.println("Такой квартиры в этом доме не существует");
        }

    }
}
