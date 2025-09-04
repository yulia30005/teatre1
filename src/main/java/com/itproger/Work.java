package com.itproger;

import java.util.Random;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 6;
//        boolean c = true;
//        if (a > b) {
//            a++;
//            b++;
//        }
//        if (a <= b) {
//            System.out.println("a<=b");
//        } else {
//            System.out.println("a>=b");
//        }
//        int mark = 75;
//        if (mark >= 90) {
//            System.out.println("A");
//        } else if (mark >= 80) {
//            System.out.println("B");
//
//        } else if (mark >= 70) {
//            System.out.println("C");
//
//        } else if (mark >= 60) {
//            System.out.println("D");
////        } else System.out.println("failure");
//        int mark1 =70;
//        switch(mark1){
//            case 60:
//                System.out.println("D"); break;
//            case 70:
//                System.out.println("c");break;
//            case 80:
//                System.out.println("b");break;
//            default:
//                System.out.println("failure");
//        }
//        int x=3;
//        int y=3;
//        switch (x+3){
//            case 6:y=1;
//            default:y+=1;
//        }
//        if(x+3 == 6) {
//            y=1;
//            y+=1;
//        }else{
//            y+=1;
//        }
        boolean i = true;
        int y;
        if (i) y = 1;
        else y = 0;
        y = (i) ? 1 : 0; //тернарний оператор
        Random rdm = new Random();
        rdm.nextInt(3);
    }


    public static void divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число ділиться на 2");

        }
        if (a % 5 == 0) {
            System.out.println("Число ділиться на 5");
        }

    }

    public static void ChineseZodiac() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть рік народження");
        int year = sc.nextInt();
        switch (year % 12) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
        }
    }
}
