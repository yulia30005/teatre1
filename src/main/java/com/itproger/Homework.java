package com.itproger;

import java.sql.SQLOutput;
import java.time.Month;
import java.time.YearMonth;
import java.util.Random;
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
    int end = start + 1;
    byte bt = (byte) (127 + 1);
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
        double length = Math.pow(v, 2) / (2 * a);
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
        double x = x2 - x1;
        double y = y2 - y1;
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

    public static void task15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть а,b та c");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double sqrt = Math.pow(b, 2);
        double discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        short dis = (short) Math.sqrt(4);
        if (discriminant > 0) {
            System.out.println((-b - discriminant) / (2 * a) + " перший корінь");
            System.out.println((-b + discriminant) / (2 * a) + " другий корінь");
        } else {
            if (discriminant == 0) {
                System.out.println("Тільки один корінь: " + -b / (2 * a));
            } else {
                System.out.println("Коренів немає");
            }
        }
    }

    public static void task16() {
        Random rdm = new Random();
        rdm.nextInt(12);
        switch (rdm.nextInt(12)) {
            case 1:
                System.out.println("Січень");
                break;
            case 2:
                System.out.println("Лютий");
                break;
            case 3:
                System.out.println("Березень");
                break;
            case 4:
                System.out.println("Квітень");
                break;
            case 5:
                System.out.println("Травень");
                break;
            case 6:
                System.out.println("Червень");
                break;
            case 7:
                System.out.println("Липень");
                break;
            case 8:
                System.out.println("Серпень");
                break;
            case 9:
                System.out.println("Вересень");
                break;
            case 10:
                System.out.println("Жовтень");
                break;
            case 11:
                System.out.println("Листопад");
                break;
            case 12:
                System.out.println("Грудень");
                break;
        }

    }

    public static void task17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть поточний день тижня");
        int i = sc.nextInt();
        System.out.println("Введіть кількість днів після сьогодні");
        int j = sc.nextInt();
        switch ((i + j) % 7) {
            case 0:
                System.out.println("Неділя");
                break;
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("Пятниця");
                break;
            case 6:
                System.out.println("Неділя");
                break;
        }
    }

    public static void task18() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть вагу  кілограмах: ");
        double weight = sc.nextDouble();
        System.out.println("Введіть ріст у метрах: ");
        double height = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.println("Індекс маси тіла:: " + bmi);

    }

    public static void triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть першу сторону трикутника: ");
        int first = sc.nextInt();
        System.out.println("Введіть другу сторону трикутника: ");
        int second = sc.nextInt();
        System.out.println("Введіть третю сторону трикутника: ");
        int third = sc.nextInt();
        if (first + second > third && first + third > second && second + third > first) {
            int perimeter = first + second + third;
            System.out.println("Периметр трикутника = " + perimeter);
        } else {
            System.out.println("Введення недійсне");
        }
    }

    public static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int number = sc.nextInt();
//        if (number % 5 == 0 && number % 4 == 0) {
//            System.out.println("Ділиться на 4 і 5");
//        } else if (number % 4 == 0 || number % 5 == 0) {
//            System.out.println("Ділиться на 4 або 5");
//        } elif (number % 4 == 0 && number % 5 != 0) {
//            System.out.println("Ділиться тільки на 4");
//        } else if (number % 5 == 0 && number % 4 != 0) {
//            System.out.println("Ділиться тільки на 5");
//        }
        if (number % 5 == 0 && number % 4 == 0) {
            System.out.println("Ділиться на 4 і 5");
        } else if (number % 4 == 0) {
            System.out.println("Ділиться на 4 або 5");
            System.out.println("Ділиться тільки на 4");
        } else if (number % 5 == 0) {
            System.out.println("Ділиться на 4 або 5");
            System.out.println("Ділиться тільки на 5");

        } else System.out.println("Не ділиться на 4 або 5");

    }

    public static void steamy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Це число парне");
        } else {
            System.out.println("Це число непарне");
        }
    }
        //4.13
    public static void letter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть літеру: ");
        char letter = sc.next().charAt(0);
        letter = Character.toLowerCase(letter);
        if (Character.isLetter(letter) == false) {
            System.out.println("Не літера");
        } else if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Літера голосна");
        }else {
            System.out.println("Літера приголосна");
        }
    }
    //4.15
    public static void phone () {//write from switch, велику букви,
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведіть літеру: ");
        char letter = sc.next().charAt(0);
        letter = Character.toLowerCase(letter);
        if (Character.isLetter(letter) == false) {
            System.out.println("Не літера");
        } else switch (letter){
            case 'a': case 'b': case 'c':
                System.out.println( "Число: 2");
                break;
            case 'd': case 'e': case 'f':
                System.out.println( "Число: 3");
               break;
            case 'g': case 'h': case 'i':
                System.out.println( "Число: 4");
                break;
            case 'j': case 'k': case 'l':
                System.out.println( "Число: 5");
                break;
            case 'm': case 'n': case 'o':
                System.out.println( "Число: 6");
                break;
            case 'p': case 'q': case 'r': case 's':
                System.out.println( "Число: 7");
                break;
            case 't': case 'u': case 'v':
                System.out.println( "Число: 8");
                break;
            case 'w': case 'x': case 'y': case 'z':
                System.out.println( "Число: 9");
                break;
        }
    }

   // 4.16
    public static void random () {
        char[] allLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        double randomValue = Math.random();
        int randomIndex = (int) (randomValue * allLetter.length);
        char randomLetter = allLetter[randomIndex];
         randomLetter = Character.toLowerCase(randomLetter);
        System.out.println("Случайная буква: " + randomLetter);

    }

    public static void days(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть рік: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Введіть місяць: ");
        String month = sc.nextLine(); // Проблемка
        if (Character.isUpperCase(month.charAt(0)) == false) {
            System.out.println("Не коректна назва");
        } else if (month == "Jan"|| month == "March" || month == "May" || month == "Jul" || month == "Aug" || month == "Oct" || month == "Dec") {
            System.out.println("31 days");;
        } else if (month == "Apr"|| month == "Sep"|| month == "Nov" || month == "Jun") {
            System.out.println("30 days");;
        } else if (month == "Feb"  || year % 4 == 0 || year % 400 == 0 && year % 100 == 0) {
            System.out.println("29 days");;
        } else {
            System.out.println("28 days");
            ;
        }

    }

    public static void line1(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введіть рядок: ");
        String lines = sc1.nextLine();
        int number = lines.length();
        char letter = lines.charAt(number -1);
        System.out.println("Довжина: " + number + "\nОстанній символ: " + letter);

    }

    public static void socialNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть номер соціального страхування у форматі DDD-DD-DDDD: ");
        String number = sc.nextLine();
        if (number.charAt(3) != '-' || number.charAt(6) != '-' ) {
            System.out.println("Вірний номер соціального страхування");
        } else {
            System.out.println("Невірний номер соціального страхування");
        }
    }

    public static void work(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ім'я працівника: ");
        String name = sc.nextLine();
        System.out.println("Введіть кількість відпрацьованих годин за тиждень: ");
        int workedHours = sc.nextInt();
        System.out.println("Введіть погодинну ставку: ");
        double hourlyRate = sc.nextDouble();
        System.out.println("Введіть ставку утримання федерального податку: ");
        double federalRate = sc.nextDouble();
        System.out.println("Введіть ставку утримання державного податку: ");
        double stateRate = sc.nextDouble();
        double grossPay = workedHours * hourlyRate;
        double federalPay = grossPay * federalRate;
        double statePay = grossPay * stateRate;
        double pay = grossPay - (federalPay + statePay);
        System.out.println("Ім'я робітника: " + name);
        System.out.println("Відпрацьованих годин: " + workedHours);
        System.out.println("Погодинна ставка: " + hourlyRate);
        System.out.println("Брутто заробітна плата: " + grossPay);
        System.out.println("Дедукція: ");
        System.out.println("\t Федеральне утримання: " + federalPay);
        System.out.println("\t Державне утримання: " + statePay);
        System.out.println("\t Всього утримано: " + statePay + federalPay);
        System.out.println("До отримання: "  + pay);

    }

    public static void auto(){
        char[] allLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        double randomValue = Math.random();
        int randomIndex = (int) (randomValue * allLetter.length);
        char randomLetter = allLetter[randomIndex];
        char randomLetter2 = allLetter[randomIndex];
        char randomLetter3 = allLetter[randomIndex];
        char[] allNumber = "1234567890".toCharArray();
        int randomIndexNumber = (int) (randomValue * allNumber.length);
        char randomNumber1 = allNumber[randomIndexNumber];
        char randomNumber2 = allNumber[randomIndexNumber];
        char randomNumber3 = allNumber[randomIndexNumber];
        char randomNumber4 = allNumber[randomIndexNumber];
        String number = String.valueOf(randomLetter) + String.valueOf(randomLetter2) + String.valueOf(randomLetter3) + String.valueOf(randomNumber1) + String.valueOf(randomNumber2) + String.valueOf(randomNumber3) + String.valueOf(randomNumber4);
        System.out.println("Номерний знак: " + number);

    }

}
