public class Main {
    public static void main(String[] args) {
        System.out.println("Здарова, отец!");
        run1();
        run2();
        run3();
        run4();
        run5();
    }

    public static void run1(){
        System.out.println("Задачи 1-3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog+" "+cat+" "+paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog+" "+cat+" "+paper);
        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println(dog+" "+cat+" "+paper);
    }

    public static void run2(){
        System.out.println("Задача 4:");
        var friend = 19;
        System.out.println(friend);
        friend = friend+2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
    }

    public static void run3(){
        System.out.println("Задача 4:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void run4(){
        System.out.println("Задачи 6-7");
        var boxMen1 = 78.2;
        var boxMen2 = 82.7;
        var allWeightBoxMen = boxMen1 + boxMen2;
        System.out.println("Общий вес боксеров: "+allWeightBoxMen+" кг");
        var overloadBoxMen1 = allWeightBoxMen % boxMen1;
        System.out.println("Разница между боксерами составляет: "+overloadBoxMen1+" кг");
        var overloadBoxMen2 = boxMen2-boxMen1;
        System.out.println("Разница между боксерами составляет: "+overloadBoxMen2+" кг");
    }

    public static void run5(){
        System.out.println("Задача 8:");
        var allTimeWork = 360;
        var oneTimeWork = 8;
        var employees = allTimeWork/oneTimeWork;
        System.out.println("Всего работников в компании — "+employees+ " человек");
        var ifEmployees = employees + 94;
        var ifEmpTimeWork = allTimeWork / ifEmployees;
        System.out.println("Если в компании работает "+ifEmployees+" человек, то всего "+ifEmpTimeWork+" часов работы может быть поделено между сотрудниками");

    }

}