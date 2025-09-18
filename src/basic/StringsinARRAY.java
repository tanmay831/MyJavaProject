package basic;

import kotlin.jvm.internal.MagicApiIntrinsics;

import java.util.Arrays;
import java.util.Scanner;

public class StringsinARRAY {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str[]=new String[5];
        for (int i=0;i< str.length;i++){
            str[i]= in.next();
            str[1]="tanmay";
        }
        System.out.println(Arrays.toString(str));

    }

}
