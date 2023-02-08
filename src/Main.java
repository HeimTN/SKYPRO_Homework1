public class Main {
    public static void main(String[] args) {
        System.out.println("Здарова, отец!");
        toRun1();
        toRun2();
        toRun3();
        toRun4();
        toRun5();
        toRun6();
        toRun7();
        toRun8();
        //run1();
        //run2();
        //run3();
        //run4();
        //run5();
    }

    public static void toRun1(){
        System.out.println("Задача 1");
        int apple = 10;
        byte orange = 5;
        short lemon = 7;
        float cucumber = 5f;
        double potato = 9f;
        System.out.println("Значение переменной apple с типом int равно "+apple);
        System.out.println("Значение переменной orange с типом byte равно "+ orange);
        System.out.println("Значение переменной lemon с типом short равно "+ lemon);
        System.out.println("Значение переменной cucumber с типом float равно "+ cucumber);
        System.out.println("Значение переменной potato с типом double равно "+ potato);
    }
    public static void toRun2(){
        System.out.println("Задача 2");
        float test1 = 27.12f;
        long test2 = 987678965549L;
        double test3 = 2.786;
        int test4 = 569;
        short test5 = -159;
        int test6 = 27897;
        byte test7 = 67;
        System.out.println(test1+" "+test2+" "+test3+" "+test4+" "+test5+" "+test6+" "+test7);
    }

    public static void toRun3(){
        System.out.println("Задача 3");
        byte studentLudmila = 23;
        byte studentAnna = 27;
        byte studentEkaterina = 30;
        int allStudent = studentEkaterina+studentAnna+studentLudmila;
        short allPaper = 480;
        int paperOneStudent = allPaper/allStudent;
        System.out.println("На каждого ученика рассчитано "+paperOneStudent+" листов бумаги");
    }
    public static void toRun4(){
        System.out.println("Задача 4");
        byte standardCapacity = 16/2;
        byte twentyMin = 20;
        short oneDayInMin = 1*24*60;
        int threeDayInMin = 3*24*60;
        int monthIntMin = 30*24*60;
        int capacityPer20Min = standardCapacity*twentyMin;
        int capacityPerOneDay = standardCapacity*oneDayInMin;
        int capacityPerThreeDay = standardCapacity*threeDayInMin;
        int capacityPerMonth = standardCapacity*monthIntMin;
        System.out.println("За "+twentyMin+" минут машина произвела "+capacityPer20Min+" штук бутылок");
        System.out.println("За "+oneDayInMin+" минут("+(oneDayInMin/60/24)+" день) машина произвела "+capacityPerOneDay+" штук бутылок");
        System.out.println("За "+threeDayInMin+" минут("+(threeDayInMin/60/24)+" день) машина произвела "+capacityPerThreeDay+" штук бутылок");
        System.out.println("За "+monthIntMin+" минут("+(monthIntMin/60/24)+" день) машина произвела "+capacityPerMonth+" штук бутылок");
    }

    public static void toRun5(){
        System.out.println("Задача 5");
        byte allPaint = 120;
        byte whitePaintNeed = 2;
        byte brownPaintNeed = 4;
        int allClass = allPaint/(whitePaintNeed+brownPaintNeed);
        int allWhitePaint = whitePaintNeed*allClass;
        int allBrownPaint = brownPaintNeed*allClass;
        System.out.println("В школе, где "+allClass+" классов, нужно "+allWhitePaint+" банок белой краски и "+allBrownPaint+" банок коричневой краски");
    }

    public static void toRun6(){
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eagWeight = 70;
        byte needBanana = 5;
        byte needMilk = 200/100;
        byte needIceCream = 2;
        byte needEag = 4;
        int weighSportPitInGram = (bananaWeight*needBanana)+(milkWeight*needMilk)+(iceCreamWeight*needIceCream)+(eagWeight*needEag);
        double weightSportPitInKilogram = (double) weighSportPitInGram/1000;
        System.out.println("Спортпит весит "+weighSportPitInGram+" грамм или "+weightSportPitInKilogram+" киллограм");
    }

    public static void toRun7(){
        System.out.println("Задача 7");
        short needLoseW = 7*1000;
        short oneWayLose = 250;
        short thoWayLose = 500;
        double lossWeightPerDayAverage = (oneWayLose+thoWayLose)/2d;
        int dayOneWay = needLoseW/oneWayLose;
        int dayThoWay = needLoseW/thoWayLose;
        double middleNeedDay = needLoseW/lossWeightPerDayAverage;
        System.out.println("Для первого способа необходимо "+dayOneWay+" дней, для второго "+dayThoWay+" дней. ");
        System.out.printf("В среднем необходимо %.2f%n",middleNeedDay);
    }

    public static void toRun8(){
        System.out.println("Задача 8");
        int standardSalaryMasha = 67760;
        int standardSalaryDenis = 83690;
        int standardSalaryKris = 76230;
        float appPercent = 0.1f;
        float inAppSalaryMasha = appPercent*standardSalaryMasha;
        float inAppSalaryDenis = appPercent*standardSalaryDenis;
        float inAppSalaryKris = appPercent*standardSalaryKris;
        int allSalaryAfterAppMasha = standardSalaryMasha+(int)inAppSalaryMasha;
        int allSalaryAfterAppDenis = standardSalaryDenis+(int)inAppSalaryDenis;
        int allSalaryAfterAppKris = standardSalaryKris+(int)inAppSalaryKris;
        System.out.println("Маша теперь получает "+allSalaryAfterAppMasha+" рублей. Годовой доход вырос на "+inAppSalaryMasha+" рублей");
        System.out.println("Денис теперь получает "+allSalaryAfterAppDenis+" рублей. Годовой доход вырос на "+inAppSalaryDenis+" рублей");
        System.out.println("Кристина теперь получает "+allSalaryAfterAppKris+" рублей. Годовой доход вырос на "+inAppSalaryKris+" рублей");

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