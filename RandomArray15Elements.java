package dz_lesson12;
import java.lang.*;
import java.util.Arrays;
public class RandomArray15Elements {
    public static void main(String[] args) {
        int [] randomNumbArr = new int [15];
        int [] randomNumbArr2 = new int [30];
        for (int i = 0; i < 15; i++){
            randomNumbArr [i] = Math.round((int)(Math.random()*10));
        }
        System.arraycopy(randomNumbArr, 0, randomNumbArr2, 0, 15);
        for (int i = 15; i < 30; i++){
            randomNumbArr2 [i] = randomNumbArr2 [i-15]*2;
        }
        System.out.println(Arrays.toString(randomNumbArr));
        System.out.println(Arrays.toString(randomNumbArr2));


    }
}
