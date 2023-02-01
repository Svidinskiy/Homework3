public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int a = 267002;
        System.out.println("Значение переменной a с типом int равно "+ a);
        byte b = -39;
        System.out.println("Значение переменной b с типом byte равно "+ b);
        short c = 2;
        System.out.println("Значение переменной c с типом short равно "+ c);
        long d  = 1234567890;
        System.out.println("Значение переменной d с типом long равно "+ d);
        float e = 7.5f;
        System.out.println("Значение переменной e с типом float равно "+ e);
        double f = 0.674;
        System.out.println("Значение переменной f с типом double равно "+ f);


        System.out.println("\n");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        char d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        System.out.println("\n");

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int allStudents = 23+27+30;
        int list = 480;
        System.out.println("На каждого ученика рассчитано " + (list/allStudents) + " листов бумаги");

        System.out.println("\n");

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottleMinute = 16/2;
        int minute = 20;
        int oneDaysMinute = 1440;
        int threeDaysMinute = 4320;
        int oneMonthMinute = 43200000;
        System.out.println("За 20 минут машина произвела " + minute * bottleMinute + " штук бутылок");
        System.out.println("За 1 день машина произвела " + oneDaysMinute * bottleMinute + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDaysMinute * bottleMinute + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + oneMonthMinute * bottleMinute + " штук бутылок");

        System.out.println("\n");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int allPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int totalClasses = allPaint / (whitePaint + brownPaint);
        System.out.println("В школе, где " + totalClasses + " классов, " +
                "нужно " + totalClasses * whitePaint + " банок белой краски и " + totalClasses * brownPaint + " банок коричневой краски");

        System.out.println("\n");

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int banana = 5 * 80;
        double milk = 200 * 1.05;
        int iceCream = 2*100;
        int egg = 4 * 70;
        double allWeight = banana + milk + iceCream + egg;
        System.out.println("Вес завтрака в граммах: " + allWeight);
        System.out.println("Вес завтрака в килограммах: " + allWeight/1000 );

        System.out.println("\n");

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int overweight = 7 * 1000;
        int firstMethod = overweight / 250;
        int secondMethod = overweight / 500;
        System.out.println( firstMethod +" дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 250 грамм");
        System.out.println( secondMethod +" дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 500 грамм");
        System.out.println( (firstMethod + secondMethod)/2 + " день в среднем может потребоваться, " +
                "чтобы добиться результата похудения");

        System.out.println("\n");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary =  67760;
        int denisSalary = 83690;
        int kristinSalary = 76230;
        double increasedSalaryMasha = mashaSalary + (mashaSalary * 0.1);
        double increasedSalaryDenis = denisSalary + (denisSalary * 0.1);
        double increasedSalaryKristin = kristinSalary + (kristinSalary * 0.1);
        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. " +
                "Годовой доход вырос на " + ((increasedSalaryMasha * 12) - (mashaSalary * 12)) + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. " +
                "Годовой доход вырос на " + ((increasedSalaryDenis * 12) - (denisSalary * 12)) + " рублей");
        System.out.println("Кристина теперь получает " + increasedSalaryKristin + " рублей. " +
                "Годовой доход вырос на " + ((increasedSalaryKristin * 12) - (kristinSalary * 12)) + " рублей");

        System.out.println("\n");

    }
}