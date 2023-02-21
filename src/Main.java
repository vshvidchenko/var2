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

    public static void task1() {
        System.out.println("Задача 1");
        int a = 1002;
        byte b = 10;
        short c = 20000;
        long d = 250000L;
        float i = 2.5f;
        double f = 389.6;
        System.out.println("Значение переменной int c типом целочисленные равно " + a);
        System.out.println("Значение переменной byte c типом целочисленные равно " + b);
        System.out.println("Значение переменной short c типом целочисленные равно " + c);
        System.out.println("Значение переменной long c типом целочисленные равно " + d);
        System.out.println("Значение переменной float c типом плавающая точка равно " + i);
        System.out.println("Значение переменной double c типом плавающая точка равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        double f = 27.12;
        long d = 987678965549L;
        float i = 2.786f;
        short c = 569;
        short r = -159;
        int a = 27897;
        byte b = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int studentAll = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short paperAll = 480;
        int paperStudent = paperAll / studentAll;
        System.out.println("На каждого ученика расчитано " + paperStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte botleMinuteMaсhine = 8;
        int minute20 = botleMinuteMaсhine * 20;
        int day = botleMinuteMaсhine * 1440;
        int day3 = botleMinuteMaсhine * 4320;
        int month = botleMinuteMaсhine * 43200;
        System.out.println("За 20 минут машина произвела " + minute20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte jarColor = 120;
        byte classJar = 6;
        int classAll = jarColor / classJar;
        int whiteJarColor = classAll * 2;
        int brounColor = classAll * 4;
        System.out.println("В школе, где " + classAll + " классов, нужно " + whiteJarColor + " банок белой краски и " + brounColor + " банок коричневой краски" );
    }
    public static void task6() {
        System.out.println("Задача 6");
        short banana = 80 * 5;
        short milk = 105 * 2;
        short iceСream = 100 * 2;
        short egg = 70 * 4;
        int productAllGramm = banana + milk + iceСream + egg;
        float productAllKg = productAllGramm / 1000f;
        System.out.println("Общий вес спортзавтрака в граммах " + productAllGramm + " или " + productAllKg + " в килограммах");
    }

    public static void task7() {
        System.out.println("Задача 7");
        short weightLoss = 7 * 1000;
        int weightLossDay250 = weightLoss / 250;
        int weightLossDay500 = weightLoss / 500;
        System.out.println("На похудение уйдет " + weightLossDay250 + " дней, если спортсмен будет терять в день по 250 грамм и " + weightLossDay500 + " дней, если будет худеть на 500 грамм в день.");
        int averageDay = (weightLossDay250 + weightLossDay500) / 2;
        System.out.println("В среднем на похудение уйдет " + averageDay + " дней.");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;
        int periodMonths = 12;

        double newProfitYearMasha = newSalaryMasha*periodMonths;
        double newProfitYearDenis = newSalaryDenis*periodMonths;
        double newProfitYearKristina = newSalaryKristina*periodMonths;

        double profitYearMasha = salaryMasha*periodMonths;
        double profitYearDenis = salaryDenis*periodMonths;
        double profitYearKristina = salaryKristina*periodMonths;
        double diffProfitYearMasha = newProfitYearMasha-profitYearMasha;
        double diffProfitYearDenis = newProfitYearDenis-profitYearDenis;
        double diffProfitYearKristina = newProfitYearKristina-profitYearKristina;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей." + "Годовой доход вырос на " + diffProfitYearMasha + " рублей");
        System.out.println("Маша теперь получает " + newSalaryDenis + " рублей." + "Годовой доход вырос на " + diffProfitYearDenis + " рублей");
        System.out.println("Маша теперь получает " + newSalaryKristina + " рублей." + "Годовой доход вырос на " + diffProfitYearKristina + " рублей");

    }

}






