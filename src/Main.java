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

        }
    }