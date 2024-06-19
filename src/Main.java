import java.util.Arrays;

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
        System.out.println("За месяц (30 дней!) машина произвела " + bottlePer1Month + " штук бутылок");

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
        short weightLossGramm = 7000;
        short weightLossMinPerDayGramm = 250;
        System.out.println("Task 3.7:");
        short weightLossMaxPerDayGramm = 500;
        int dayMin = weightLossGramm / (weightLossMinPerDayGramm);
        System.out.println("Спортсмену нужно " + dayMin + " дней для сброса веса, если каждый день он будет худеть на " + weightLossMinPerDayGramm + " грамм");
        int dayMax = weightLossGramm / (weightLossMaxPerDayGramm);
        System.out.println("Спортсмену нужно " + dayMax + " дней для сброса веса, если каждый день он будет худеть на " + weightLossMaxPerDayGramm + " грамм");
        int dayAverage = (dayMin + dayMax) / 2;
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

            //homework4
        // Условный оператор

        // a == b Операция «Равно»
        // a && b Операция «И»
        // a || b Операция «ИЛИ»

        //Побитовые операции  — https://neerc.ifmo.ru/wiki/index.php
        //Тернарный оператор Java — примеры — https://java-blog.ru/osnovy/ternarnyy-operator-java
        //Какие отличия битовых и логических операторов в Java — https://ru.stackoverflow.com/questions

        //task 4.1
        int age = 19;
        System.out.println("Task 4.1:");
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //task 4.2
        int weatherTemperature = 4;
        System.out.println("Task 4.2:");
        if (weatherTemperature < 5){
            System.out.println("На улице " + weatherTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + weatherTemperature + " градусов, можно идти без шапки");
        }

        //task 4.3
        int vihicleSpeed = 55;
        System.out.println("Task 4.3:");
        if (vihicleSpeed > 60){
            System.out.println("Если скорость " + vihicleSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + vihicleSpeed + ", то можно ездить спокойно");
        }

        //task 4.4
        int personAge = 18;
        System.out.println("Task 4.4:");
        if (personAge >= 2 && personAge <= 6){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge <= 17){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");
        } else if (personAge > 24){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу");
        }

        //task 4.5
        int childAge = 13;
        boolean adultWithChild = true;
        System.out.println("Task 4.5:");
        if (childAge < 5){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge <= 14 && !adultWithChild){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе без сопровождения взрослого");
        } else if (childAge >= 5 && childAge <= 14 && adultWithChild){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (childAge > 14){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе");
        }

        //task 4.6
        int personsVan = 59;
        int totalPersonsVan = 102;
        int totalPersonsVanSeat = 60;
        System.out.println("Task 4.6:");
        if (personsVan < totalPersonsVanSeat){
            System.out.println("В вагоне ещё есть сидячие места");
        } else if (personsVan < totalPersonsVan && personsVan > totalPersonsVanSeat){
            System.out.println("В вагоне ещё есть стоячие места");
        } else if (personsVan >= totalPersonsVan){
            System.out.println("В вагоне нет мест");
        }

        //task 4.7
        int one = 346;
        int two = 345;
        int three = 346;
        System.out.println("Task 4.7:");
        if (one > two && one > three){
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three){
            System.out.println("Самое большое число " + two);
        } else if (three > one && three > two){
            System.out.println("Самое большое число " + three);
        } else {
            System.out.println("есть равные числа");
        }

            //homework5
        // Условный оператор, урок 2

        //Основы логики. Приоритет логических операций  — http://infbu.ru/uchebniki/logika/prioritet.html
        //Is there a difference in removing the curly braces from If statements in java — https://stackoverflow.com/questions/15786949/is-there-a-difference-in-removing-the-curly-braces-from-if-statements-in-java
        //Всё ли вы знаете про if? — https://habr.com/ru/articles/61323/

        //task 5.1
        int clientOS = 1;
        System.out.println("Task 5.1:");
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task 5.2
        //int clientOS = 1;
        int clientDeviceYear = 2015;
        System.out.println("Task 5.2:");
        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task 5.3
        int year = 1984;
        int overYear = (year - 1584) ;
        System.out.println("Task 5.3:");
        if (year < 1584){
            System.out.println(year + " год не является високостным");
        } else if ((overYear%4 == 0 && overYear%100 != 0) || overYear%400 == 0) {
            System.out.println(year + " год является високостным");
        } else {
            System.out.println(year + " год не является високостным");
        }

        //task 5.4
        int deliveryDistance  = 95;
        int delivery2Time20Km = 1;
        int delivery2Time60Km = 2;
        int delivery2Time100Km = 3;
        System.out.println("Task 5.4:");
        if (deliveryDistance > 100){
            System.out.println("доставки нет");
        } else if (deliveryDistance < 20 ) {
            System.out.println("Потребуется дней: " + delivery2Time20Km);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + delivery2Time60Km);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + delivery2Time100Km);
        }

        //task 5.5
        int monthNumber = 12;
        System.out.println("Task 5.5:");
        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " - это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " - это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " - это осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " - это зима");
                break;
            default :
                System.out.println("Месяц " + monthNumber + " - не существует");
                break;
        }

            //homework6
        // Циклы for

        //Java: Инкремент и декремент — https://code-basics.com/ru/languages/java/lessons/mutators
        //Как правильно работать с преинкрементом и постинкрементом? - https://qna.habr.com/q/125631

        //task 6.1
        System.out.println("Task 6.1:");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        //task 6.2
        System.out.println("Task 6.2:");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }

        //task 6.3
        System.out.println("Task 6.3:");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //task 6.4
        System.out.println("Task 6.4:");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        //task 6.5
        System.out.println("Task 6.5:");
        int overYear6 = 0;
        for (int i = 1904; i <= 2096; i = i + 4) {
            overYear6 = i - 1584;
            if  ((overYear6%4 == 0 && overYear6%100 != 0) || overYear6%400 == 0){
                System.out.println(i + " год является високосным");
            }
        }

        //task 6.6
        System.out.println("Task 6.6:");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //task 6.7
        System.out.println("Task 6.7:");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //task 6.8
        int capital = 29000;
        int sumCapital = 0;
        System.out.println("Task 6.8:");
        for (int i = 0; i < 12; i = i + 1) {
            sumCapital = sumCapital + capital;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumCapital + " рублей.");
        }

        //task 6.9
        int capital12 = 29000;
        int sumCapital12 = 0;
        System.out.println("Task 6.9:");
        for (int i = 0; i < 12; i = i + 1) {
            sumCapital12 = sumCapital12 + sumCapital12/100;
            sumCapital12 = sumCapital12 + capital12;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumCapital12 + " рублей.");
        }

        //task 6.10
        int mathResult = 0;
        System.out.println("Task 6.10:");
        for (int i = 1; i <= 10; i = i + 1) {
            mathResult = 2 * i;
            System.out.println("2*" + i + "=" + mathResult);
        }

            //homework7
        // Циклы while

        //Разница между break и continue в программировании
        // https://sky.pro/wiki/java/raznitsa-mezhdu-break-i-continue-v-programmirovanii/

        //task 7.1
        int myCapital = 15_000;
        int sumMyCapital = 0;
        int sumMyCapitalMonth = 0;
        System.out.println("Task 7.1:");
        while (sumMyCapital < 2_459_000) {
            sumMyCapital = sumMyCapital + sumMyCapital/100;
            sumMyCapital = sumMyCapital + myCapital;
            sumMyCapitalMonth = sumMyCapitalMonth + 1;
            System.out.println("Месяц " + sumMyCapitalMonth + ", сумма накоплений равна " + sumMyCapital + " рублей.");
        }

        //task 7.2
        System.out.println("Task 7.2:");
        int digit = 0;
        while (digit <=10) {
            digit = digit + 1;
            System.out.print(digit + " ");
        }
        System.out.println();
        for (; digit > 0; digit = digit - 1) {
            System.out.print(digit + " ");
        }

        //task 7.3
        System.out.println("Task 7.3:");
        int citizenNow = 12_000_000;
        int citizenBornPer1000 = 17;
        int citizenBorn = 0;
        int citizenDiePer1000 = 8;
        int citizenDie = 0;
        for (int i = 1; i <= 10; i = i + 1) {
            citizenBorn = (citizenNow / 1000) * citizenBornPer1000;
            citizenDie = (citizenNow / 1000) * citizenDiePer1000;
            citizenNow = citizenNow + citizenBorn - citizenDie;
            System.out.println ("Год " + i + ", численность населения составляет " + citizenNow);
        }

        //task 7.4
        System.out.println("Task 7.4:");
        int capitalVasiliy = 15_000;
        int cnt_moths = 1;
        while (capitalVasiliy <= 12_000_000) {
            capitalVasiliy = capitalVasiliy + ((capitalVasiliy * 7)/ 100);
            cnt_moths = cnt_moths + 1;
            System.out.println ("Месяц " + cnt_moths + ", сумма вклада - " + capitalVasiliy);
        }
        System.out.println ("Чтобы накопить 12 000 000, Василию нужно " + cnt_moths + " месяцев");

        //task 7.5
        System.out.println("Task 7.5:");
        int capitalVasiliy5 = 15_000;
        int cnt_moths5 = 1;
        while (capitalVasiliy5 <= 12_000_000) {
            capitalVasiliy5 = ((capitalVasiliy5 * 7)/ 100) + capitalVasiliy5;
            cnt_moths5 = cnt_moths5 + 1;
            if (cnt_moths5%6 == 0) {
                System.out.println("Месяц " + cnt_moths5 + ", сумма вклада - " + capitalVasiliy5);
            }
        }
        System.out.println ("Чтобы накопить 12 000 000, Василию нужно " + cnt_moths5 + " месяцев");

        //task 7.6
        System.out.println("Task 7.6:");
        int capitalVasiliy6 = 15_000;
        int cnt_moths6 = 1;
        while (cnt_moths6 <= 9 * 12) {
            capitalVasiliy6 = ((capitalVasiliy6 * 7)/ 100) + capitalVasiliy6;
            cnt_moths6 = cnt_moths6 + 1;
            if (cnt_moths6%6 == 0) {
                System.out.println("Месяц " + cnt_moths6 + ", сумма вклада - " + capitalVasiliy6);
            }
        }
        System.out.println ("Через 9 лет Василий накопит " + capitalVasiliy6 + " рублей");

        //task 7.7
        System.out.println("Task 7.7:");
        int firstFriday = 3;
        int cntDay = 1;
        while (cntDay <= 31) {
            if ((cntDay == firstFriday) || (cntDay - firstFriday)%7 == 0) {
                System.out.println("Сегодня пятница, " + cntDay + "-е число. Необходимо подготовить отчет");
            }
            cntDay = cntDay + 1;
        }

        //task 7.8
        System.out.println("Task 7.8:");
        int cometYear = 79;
        int cntYear = 0;
        int nowYear = 2024;
        int startCntYear = 200;
        int stopCntYear = 100;
        do { if (cntYear%cometYear == 0 && cntYear >= nowYear - startCntYear && cntYear <= nowYear + stopCntYear) {
            System.out.println(cntYear);
        }
            cntYear = cntYear + 1;
        }
        while (cntYear <= nowYear + stopCntYear) ;


            //homework8
        // Массивы

        //task 8.1
        System.out.println("Task 8.1:");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println(Arrays.toString(array1));

        double[] array2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(array2));

        char[] array3 = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(array3));

        //task 8.2
        System.out.println("Task 8.2:");
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1){
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }

        for (int j = 0; j < array2.length; j++) {
            if (j == array2.length - 1){
                System.out.println(array2[j]);
                break;
            }
            System.out.print(array2[j] + ", ");
        }

        for (int k = 0; k < array3.length; k++) {
            if (k == array3.length - 1){
                System.out.println(array3[k]);
                break;
            }
            System.out.print(array3[k] + ", ");
        }

        //task 8.3
        System.out.println("Task 8.3:");
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }

        for (int j = array2.length - 1; j >= 0; j--) {
            if (j == 0){
                System.out.println(array2[j]);
                break;
            }
            System.out.print(array2[j] + ", ");
        }

        for (int k = array3.length - 1; k >= 0; k--) {
            if (k == 0){
                System.out.println(array3[k]);
                break;
            }
            System.out.print(array3[k] + ", ");
        }
        }
    }