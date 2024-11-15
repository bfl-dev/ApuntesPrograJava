/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.util.Arrays;

public class Main_Kaprekar {

    public static void main(String[] args){

    }
    public static int kaprekarOp (int num) {
        return Integer.parseInt(sortAsc(num)) - Integer.parseInt(sortDesc(num));
    }
    public static String sortDesc(int num){
        String stringNum = Integer.toString(num);
        char[] numArray = stringNum.toCharArray();
        Arrays.sort(numArray);
        return String.valueOf(numArray);
    }
    public static String sortAsc(int num){
        return new StringBuilder(sortDesc(num)).reverse().toString();
    }


    public static int itKaprekar(int num){
        return 0;
    }
}
