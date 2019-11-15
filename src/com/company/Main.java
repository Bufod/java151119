package com.company;

import java.util.Scanner;

public class Main {

    public static int sumN (int a){
        int n = 1 + (int)(Math.log10(a));
        int sum = 0;
        for (int i = 0; i < n; i++){
            int tmp = a%10;
            sum += tmp;
            a /= 10;
        }
        return sum;
    }
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (sumN(arr[j]) > sumN(arr[j+1])){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
        return arr;
    }
    public static void out(int[] qaz){
        for(int i = 0; i < qaz.length; i++)
            System.out.print(qaz[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[]{70,10,45,44};
        out(arr);
        arr = sort(arr);
        out(arr);
    }
}
