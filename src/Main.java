//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //homework1
        //task 1.1
        System.out.println("Task 1.1:");
        System.out.println("Привет Мир!");
        System.out.println("Hello World!");
        System.out.println("Guten Tag!");
        System.out.printf("printf - не добавляет после себя перенос на новую строку");
        System.out.println(", println - добавляет после себя перенос строки");

            //homework2
        // Java and VAR - https://www.tune-it.ru/web/vnik/home/-/blogs/java-i-var
        //task 2.1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Task 2.1:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //task 2.2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Task 2.2:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //task 2.3
        dog = dog - 3.2;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Task 2.3:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //task 2.4
        var friend = 19;
        System.out.println("Task 2.4:");
        System.out.println("friend = " + friend);
        friend = friend * 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        //task 2.5
        var frog = 3.5;
        frog = frog * 10;
        System.out.println("Task 2.5:");
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        //task 2.6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersWeight = boxer1 + boxer2;
        var boxersWeightDiff = boxer2 - boxer1;
        System.out.println("Task 2.6:");
        System.out.println("Масса двух боксёров = " + boxersWeight);
        System.out.println("Разница между массами боксёров = " + boxersWeightDiff);

        //task 2.7
        var boxersWeightDiffRem = boxer2 % boxer1;
        System.out.println("Task 2.7:");
        System.out.println("Разница между массами боксёров (остаток) = " + boxersWeightDiffRem);

        //task 2.8
        var allTime = 640;
        var timePerEmployee = 8;
        var totalEmployee = allTime / timePerEmployee;
        System.out.println("Task 2.8.1:");
        System.out.println("Всего работников в компании — " + totalEmployee + " человек");
        var totalEmployee94 = totalEmployee + 94;
        var allTime94 = totalEmployee94 * timePerEmployee;
        System.out.println("Task 2.8.2:");
        System.out.println("Если в компании работает " + totalEmployee94 + " человек, то всего " + allTime94 + " часов работы может быть поделено между сотрудниками");

            //homework3
        // Примитивные типы
        // byte {-128, 128} - 1 byte
        // short {-32 768, 32 767} - 2 byte
        // int {-2 147 483 648, 2 147 483 647} - 4 byte
        // long - more 2 000 000 000 - 8 byte

        // float - 7 decimal places - 4 byte
        // double - 16 decimal places - 8 byte

        // byte -> long -> float - > double

        // char {0, 65 536} - 2 byte
        // boolean {0, 1} - 1 bit

        // в Java округление до меньшего числа в операциях с целочисленными переменными 0.75 = 0
        // Представление чисел с плавающей точкой - https://my.sky.pro/student-cabinet/stream-lesson/69378/materials

        //task 3.1
        byte basketCucumbers = 127;
        short boxesCucumbers = 200;
        int kgCucumbers = 40000;
        long cucumbersInOurPlanet = 12345678999L;
        float greenCucumberWeightKg = 0.3f;
        double redCucumberWeightKg = 0.3333333333;
        System.out.println("Task 3.1:");
        System.out.println("Значение переменной basketCucumbers с типом byte равно " + basketCucumbers);
        System.out.println("Значение переменной boxesCucumbers с типом short равно " + boxesCucumbers);
        System.out.println("Значение переменной kgCucumbers с типом int равно " + kgCucumbers);
        System.out.println("Значение переменной cucumbersInOurPlanet с типом long равно " + cucumbersInOurPlanet);
        System.out.println("Значение переменной greenCucumberWeightKg с типом float равно " + greenCucumberWeightKg);
        System.out.println("Значение переменной redCucumberWeightKg с типом double равно " + redCucumberWeightKg);

        //task 3.2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        //task 3.3
        byte lydmilaPavlovnaStudents = 23;
        byte annaSergeevnaStudents = 27;
        byte ekaterinaAndreevnaStudents = 30;
        int totalStudents = lydmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents;
        short totalPiecePaper = 480;
        int piecePaperPerStudent = totalPiecePaper / totalStudents;
        float piecePaperPerStudentFloat = totalPiecePaper / totalStudents;
        System.out.println("Task 3.3:");
        System.out.println("На каждого ученика рассчитано " + piecePaperPerStudent + " листов бумаги");
        System.out.println("На каждого ученика рассчитано " + piecePaperPerStudentFloat + " листов бумаги");

        //task 3.4
        byte defaultTimeMinute = 2;
        byte bottlePerDefaultTimeMinute = 16;
        int bottlePer1Minute = bottlePerDefaultTimeMinute / defaultTimeMinute;
        int bottlePer20Minute = bottlePer1Minute * 20;
        System.out.println("Task 3.4:");
        System.out.println("За 20 минут машина произвела " + bottlePer20Minute + " штук бутылок");
        int bottlePer24Hour = bottlePer1Minute * 60 * 24;
        System.out.println("За сутки машина произвела " + bottlePer24Hour + " штук бутылок");
        int bottlePer3Day = bottlePer1Minute * 60 * 24 * 3;
        System.out.println("За 3 дня машина произвела " + bottlePer3Day + " штук бутылок");
        int bottlePer1Month = bottlePer1Minute * 60 * 24 * 3 * 10;
        System.out.println("За месяц (30 дней!) машина произвела " + bottlePer20Minute + " штук бутылок");

        //task 3.5
        byte cansPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int totalPaintPerClass = whitePaintPerClass + brownPaintPerClass;
        int totalClass = cansPaint / totalPaintPerClass;
        int totalWhitePaint = totalClass * whitePaintPerClass;
        int totalBrownPaint = totalClass * brownPaintPerClass;
        System.out.println("Task 3.5:");
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        //task 3.6
        byte banana = 5;
        byte grammPerBanana = 80;
        int weightBanana = banana * grammPerBanana;
        short milk = 200;
        byte grammPer100Milk = 105;
        int weightMilk = grammPer100Milk * 2;
        byte iceСream = 2;
        byte grammPerIceCream = 100;
        int weightIceCream = iceСream * grammPerIceCream;
        byte egg = 4;
        byte grammPerEgg = 70;
        int weightEgg = egg * grammPerEgg;
        int totalWeight = weightBanana + weightMilk + weightIceCream + weightEgg;
        float totalWeightKg = totalWeight / 1000;
        float totalWeightKgFloat = totalWeight / 1000f;
        System.out.println("Task 3.6:");
        System.out.println("Масса коктейля - " + totalWeight + " грамм");
        System.out.println("Масса коктейля - " + totalWeightKg + " килограмм");
        System.out.println("Масса коктейля - " + totalWeightKgFloat + " килограмм");

        //task 3.7
        byte weightLossKg = 7;
        short weightLossMinPerDayGramm = 250;
        float weightLossMinPerDayKg = weightLossMinPerDayGramm / 1000f;
        System.out.println("Task 3.7:");
        System.out.println("Спортсмен может потерять в день минимум " + weightLossMinPerDayKg + " килограммов");
        short weightLossMaxPerDayGramm = 500;
        float weightLossMaxPerDayKg = weightLossMaxPerDayGramm / 1000f;
        System.out.println("Спортсмен может потерять в день максимум " + weightLossMaxPerDayKg + " килограммов");
        float dayMin = weightLossKg / weightLossMinPerDayKg;
        System.out.println("Спортсмену нужно минимум " + dayMin + " дней для сброса веса");
        float dayMax = weightLossKg / weightLossMaxPerDayKg;
        System.out.println("Спортсмену нужно максимум " + dayMax + " дней для сброса веса");
        float dayAverage = (dayMin + dayMax) / 2;
        System.out.println("Спортсмену нужно в среднем " + dayAverage + " дней для сброса веса");

        //task 3.8
        float raiseSalary = 0.1f;
        int mashaSalaryOld = 67760;
        int mashaSalaryYearOld = mashaSalaryOld * 12;
        float mashaSalary = (mashaSalaryOld * raiseSalary) + mashaSalaryOld;
        float mashaSalaryYear = mashaSalary * 12f;
        float mashaSalaryYearDiff = mashaSalaryYear - mashaSalaryYearOld;
        System.out.println("Task 3.8:");
        System.out.println("Маша теперь получает " + mashaSalary + " рублей. Годовой доход вырос на " + mashaSalaryYearDiff + " рублей");
        int denisSalaryOld = 83690;
        int denisSalaryYearOld = denisSalaryOld * 12;
        float denisSalary = (denisSalaryOld * raiseSalary) + denisSalaryOld;
        float denisSalaryYear = denisSalary * 12f;
        float denisSalaryYearDiff = denisSalaryYear - denisSalaryYearOld;
        System.out.println("Денис теперь получает " + denisSalary + " рублей. Годовой доход вырос на " + denisSalaryYearDiff + " рублей");
        int kristinaSalaryOld = 76230;
        int kristinaSalaryYearOld = kristinaSalaryOld * 12;
        float kristinaSalary = (kristinaSalaryOld * raiseSalary) + kristinaSalaryOld;
        float kristinaSalaryYear = kristinaSalary * 12f;
        float kristinaSalaryYearDiff = kristinaSalaryYear - kristinaSalaryYearOld;
        System.out.println("Кристина теперь получает " + kristinaSalary + " рублей. Годовой доход вырос на " + kristinaSalaryYearDiff + " рублей");

        }
    }