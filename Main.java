package src;

import java.util.Arrays;
import java.util.Random;

//-.-. --.-     -.-. --.-     -.-. --.-
//-.. .     ...- .--. -····- ----- ----- .----
//-.. .-.     ... - . .--. .... .- .- .- -.     ..-. -...
//-.-

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int arr[] = new int[20];
        int counter = 0;
        //generate
        for (int i = 0; i < 20; i += 2) {
            arr[counter] = i;
            counter++;
        }
        for (int i = 1; i < 20; i += 2) {
            arr[counter] = i;
            counter++;
        }
        //shuffle
        int countOfShuffle = rnd.nextInt(10);
        for (int i = 0; i < countOfShuffle; i++) {
            int i1 = rnd.nextInt(10), i2 = rnd.nextInt(10);
            int temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;
        }
        for (int i = 0; i < countOfShuffle; i++) {
            int i1 = rnd.nextInt(10) + 10, i2 = rnd.nextInt(10) + 10;
            int temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;
        }
        if(arr[9]+1 == arr[10] || arr[9] -1 == arr[10]){
            int temp = arr[9];
            arr[9] = arr[8];
            arr[8] = temp;
        }
        Arrays.stream(arr).forEach(System.out::println);

    }
}