package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int suma=0;
        do {
            System.out.println("Iveskite skaiciu: ");
            a = sc.nextInt();
            suma=suma+a;
        } while (a!=0);

        System.out.println("Suma: " + suma);
    }
}