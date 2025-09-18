package basic;

import java.util.Arrays;
import java.util.Scanner;

public class functionPassing {
    public static void main(String[] args) {
        int arr[]=new int [5];
        Scanner in =new Scanner(System.in);
        System.out.println("old array"+Arrays.toString(arr));
        System.out.println("enter the 5 arrys ");

        for(int i=0;i< arr.length;i++){
            arr[i]= in.nextInt();
        }
        change(arr);
        System.out.println("modifird arry"+Arrays.toString(arr));
    }
    static void change(int arr[]){
        arr[1]=99;
    }
}
