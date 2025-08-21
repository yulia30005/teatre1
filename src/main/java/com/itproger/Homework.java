package com.itproger;

import java.util.Scanner;

public class Homework {
    //        System.out.println("Введіть милі для перетворення");
//        double killometers = 1.6;
//        Scanner sc1 = new Scanner(System.in);
//        final double miles = sc1.nextDouble();
//        System.out.println(miles * killometers + " кілометрів");
//
//        System.out.println("Введіть метри для перетворення");
//        double feets = 3.2786;
//        Scanner sc2 = new Scanner(System.in);
//        final double meter = sc2.nextDouble();
//        System.out.println(meter * feets + " футів");
//
//        double pings = 0.3025;
//        System.out.println("Введіть квадратні метри для перетворення");
//        Scanner sc3 = new Scanner(System.in);
//        final double squareMeters = sc3.nextDouble();
//        System.out.println(squareMeters * pings + " пінгу");

        /* Посилальні String
        Примітиви : Цілочислові: byte,short, int, long
                    З плаваючою крапкою: float, double
                    boolean:true, false
                    char;


                             */


//        String str = "a";
//        String str2 = str + 1;
//        System.out.println(str2);
//        char ch = 'a';
//        char ch1 = 262;
//        char ch3 = 262 + 1;
//        System.out.println(ch);
//        System.out.println(ch1);
//        System.out.println(ch3);
//        double result = Math.pow(10, 2);
//        System.out.println(result);
//        int a = 1;
//        int b = 0b1111;
//        int c = 0156;
//        int d = 0x16a;
//        long lg = 1_200_000;
//        System.out.println(b);
//        System.out.println(c);
//       long time= System.currentTimeMillis();
//       System.out.println(time);
//        firstTask();
//        secondTask();
//        thirdTask();
//        fourthTask();
//        fifthTask();
//        sixthTask();
    //25.07
//        int x = 4;
//        x = x + 5;
//        x += 5;
//        x *= 10 + 15 + (15 + 54);
//        x = x * 94;
//        System.out.println(x -= 5);
//        x = x + 1;
//        x += 1;
//        x++;//інкремент постфіксна форма
//        ++x;//префіксний
//        x--; //декремент
//        --x;
//        x = x - 1;
//        x = 4;
//        int y = x++;
//        // y=x y=4
//        //x+1 x=5
//        x = 4;
//        int z = ++x;
//        //x+1 x=5
//        //y=x y=5
//        System.out.println("y = " +y+ " z = " + z);
//        double x = 1.0;
//        double y = 5.0;
//        double z = x-- + (++y);
//        System.out.println(z);
//        System.out.println(x);
//        System.out.println(y);
//        int f;
//        byte g=5;
//        f=g;
//        double h =g;
//        long l = g;
//        int i = 300;

    //        short o = (short) i;
    //  System.out.println(o);
//        double d = 4.4;
//        double db =4.9999999999;
//        System.out.println((int)d);
//        int im =(int)d;
//        int in = (int)db;
//        System.out.println(im);
//        System.out.println(in);
//       int res = (int) Math.round(db);
//       System.out.println(res);
    int start = 0;
    int end = start+1;
    byte bt =(byte)(127+1);
    // int ig =2147483647+10;
    // byte br = (byte)ig;
    // System.out.println(br);
    //закінчили на ст 52;
  //  task14();



public static void currentTime() {
    int utc = 3;
    long time = System.currentTimeMillis();
    long second = time / 1000;
    long currentSecond = second % 60;
    long minute = second / 60;
    long currentMinute = minute % 60;
    long hour = minute / 60;
    long currentHour = hour % 24 + utc;
    System.out.println("Поточний час: " + currentHour + ":" + currentMinute + ":" + currentSecond);

}

public static void firstTask() {
    Scanner sc = new Scanner(System.in);
    double length = sc.nextDouble();
    double area = Math.sqrt(3) / 4 * length * length;
    double volume = length * area;
    System.out.println("площа: " + area);
    System.out.println("об'єм: " + volume);

}

public static void secondTask() {
    Scanner sc = new Scanner(System.in);
    double subtotal = sc.nextDouble();
    double gratuityRate = sc.nextDouble();
    double gratuity = subtotal * gratuityRate / 100;
    double sum = subtotal + gratuity;
    System.out.println("Чайові: " + gratuity);
    System.out.println("Сума: " + sum);
}

public static void thirdTask() {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int result = 1;

    while (number > 0) {
        int end = number % 10;
        result = result * end;
        number = number / 10;


    }
    System.out.println(result);
}

public static void fourthTask() {
    Scanner sc = new Scanner(System.in);
    int minutes = sc.nextInt();
    int days = minutes / 60 / 24;
    int years = days / 365;
    int end = days - years * 365;

    System.out.println("Кількість років: " + years + " Залишок днів: " + end);

}

public static void fifthTask() {
    Scanner sc = new Scanner(System.in);
    int utc = sc.nextInt();
    long time = System.currentTimeMillis();
    long second = time / 1000;
    long currentSecond = second % 60;
    long minute = second / 60;
    long currentMinute = minute % 60;
    long hour = minute / 60;
    long currentHour = hour % 24 + utc;
    System.out.println("Поточний час: " + currentHour + ":" + currentMinute + ":" + currentSecond);
}

public static void sixthTask() {
    Scanner sc = new Scanner(System.in);
    double v0 = sc.nextDouble();
    double v1 = sc.nextDouble();
    double t = sc.nextDouble();
    double a = (v1 - v0) / t;
    System.out.println("Середнє прискорення: " + a);
}

public static void seventhTask() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть масу води в кілограмах: ");
    double kilograms = sc.nextDouble();
    System.out.println("Введіть початкову температуру води: ");
    double initialTemperature = sc.nextDouble();
    System.out.println("Введіть кінцеву температуру води: ");
    double finalTemperature = sc.nextDouble();
    double energy = kilograms * (finalTemperature - initialTemperature) * 4184;
    System.out.println("Потрібно енергії: " + energy);

} // тут

public static void eightthTask() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть швидкість зльоту літака у метрах за секунду: ");
    double v = sc.nextDouble();
    System.out.println("Введіть прискорення літака у метрах за секунду в квадраті : ");
    double a = sc.nextDouble();
    double length = Math.pow(v, 2) /(2 * a);
    float length1 = (float) Math.round(length);
    System.out.println("Мінімальна довжина злітної смуги: " + length1);
}

public static void task11() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть суму щомісячного заощадження: ");
    double saving = sc.nextDouble();
    double interestRate = 0.003125;
    double oneMonth = saving * (interestRate + 1);
    System.out.println("Після першого місяця ви отримаєте: " + oneMonth);
    double twoMonth = (saving + oneMonth) * (interestRate + 1);
    System.out.println("Після другого місяця ви отримаєте: " + twoMonth);
    double threeMonth = (saving + twoMonth) * (interestRate + 1);
    System.out.println("Після третього місяця ви отримаєте: " + threeMonth);
    double fourMonth = (saving + threeMonth) * (interestRate + 1);
    System.out.println("Після четвертого місяця ви отримаєте: " + fourMonth);
    double fiveMonth = (saving + fourMonth) * (interestRate + 1);
    System.out.println("Після п'ятого місяця ви отримаєте: " + fiveMonth);
    double sixMonth = (saving + fiveMonth) * (interestRate + 1);
    System.out.println("Після шостого місяця ви отримаєте: " + sixMonth);

}

public static void task12() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть вагу у футах: ");
    double weight = sc.nextDouble();
    System.out.println("Введіть ріст у дюймах: ");
    double height = sc.nextDouble();
    double pounds = weight * 0.45359237;
    double inches = height * 0.0254;
    double bmi = pounds / Math.pow(inches, 2);
    System.out.println("Індекс маси тіла: " + bmi);

}

public static void task13() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть точки х1,y1: ");
    double x1 = sc.nextDouble(), y1 = sc.nextDouble();
    System.out.println("Введіть точки х2,y2: ");
    double x2 = sc.nextDouble(), y2 = sc.nextDouble();
    double x = x2-x1;
    double y = y2-y1;
    double area = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
    System.out.println("Відстань між точками: " + area);
}

public static void task14() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть баланс і річну ставку: ");
    double balance = sc.nextDouble(), annualInterestRate = sc.nextDouble();
    double interestRate = balance * (annualInterestRate / 1200);
    System.out.println("Відсотки за наступний місяць: " + interestRate);
}

public static void task15(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть а,b та c");
    double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
    double discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
    if(discriminant > 0){
        System.out.println(-b - discriminant / (2 * a) + " перший корінь");
        System.out.println(-b + discriminant / (2 * a) + " другий корінь");
    }else {
        if(discriminant == 0){
            System.out.println("Тільки один корінь: " + -b / (2 * a));
        } else{
            System.out.println("Коренів немає");
        }
    }
}
}
