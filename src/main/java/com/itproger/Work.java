package com.itproger;

import java.sql.SQLOutput;
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
//        boolean i = true;
//        int y;
//        if (i) y = 1;
//        else y = 0;
//        y = (i) ? 1 : 0; //тернарний оператор
//        Random rdm = new Random();
//        rdm.nextInt(3);
        lesson2();
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

    public static void palindrom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть трьох значне число:");
        int number = sc.nextInt();
        int first = number / 100;
        int last = number % 10;
        if (first == last) {
            System.out.println("Є паліндромом");
        } else {
            System.out.println("Не є паліндромом");
        }

    }

    //3.17
    public static void game() {
        int computer = (int) (Math.random() * 3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 1(камінь), 2(папір), 0(ножиці) ");
        int user = sc.nextInt();
        if (user == computer) {
            System.out.println("Нічья");
        } else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }
    public static void leson(){
//        char a ='a';
//        char b = 97;
//        char c = '\u0061';
//        b= (char)(b+1);
//        int d =a;
//        double db = 100.56;
//        c =(char) db;
//        System.out.println(a<b);
//        System.out.println(a + " "+ b + " " + c );
//        System.out.println("\tShe}said : \"jghvjhb\"");
//       char upper = 'A';
//        System.out.println(Character.isLetter(upper));
//    //   char lower = Character.toLowerCase(upper);// переводить в малу букву
//        char lower =(char)(upper+32);
//        System.out.println(lower);
//        String st = "        ghfuj     ";
//        String r = null;
//       st+="JVhgv    a     " + r;
//        System.out.println(st);
////       st= st.concat(r);
//        System.out.println(st);
//      st = st.toUpperCase();
//        System.out.println(st);
//        System.out.println( st.length());
//        System.out.println(st.charAt(14));
//        st= st.trim();
//        System.out.println(st);
        //ст25 порівняння рядків

    }
    public  static void lesson2(){
        String a = "Abc";
        String b = "Abc";
        String c = new String("AbC");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println("Equals");
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase("ABC"));
        System.out.println();
        System.out.println("Compare");
        System.out.println(a.compareTo(b));
        System.out.println();
        System.out.println("Compare".startsWith("Com"));
        System.out.println(a.endsWith("bc"));
        System.out.println("CompaRE".contains("omp"));
        System.out.println("Compare".substring(2,4));
        System.out.println("Comparep".lastIndexOf('p'));
        String number = "100";
        int number1 = Integer.parseInt(number);
        byte bt = Byte.parseByte(number);
        double d = Double.parseDouble(number);
        System.out.println(d);
        String newNumber = Double.toString(d);
    }
    //30ст
}
