public class Main {
    public static void main(String[] args) {
        System.out.println("Здарова, отец!");
        run1();
        run2();
        run3();
        run4();
        run5();
        run6();
        run7();
    }


    public static void run1(){
        System.out.println("Задание 1");
        int age = 19;
        if(age >= 18){
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void run2(){
        System.out.println("Задание 2");
        int temperature = 6;
        if (temperature < 5){
            System.out.println("На улице "+temperature+" градусов, нужно надеть шапку");
        }
        else if (temperature > 5){
            System.out.println("На улице "+temperature+" градусов, можно идти без шапки");
        }
        else {
            System.out.println("На улице "+temperature+" градусов, не могу решить надевать ли шапку, останусь дома");
        }
    }

    public static void run3(){
        System.out.println("Задание 3");
        int speed = 61;
        if (speed > 60){
            System.out.println("Если скорость "+speed+", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        }
    }

    public static void run4(){
        System.out.println("Задание 4");
        int age = 9;
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
        }
        else if (age > 18 && age < 24){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет");
        }
        else if (age >= 24){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить на работу");
        }
        else {
            System.out.println("Если возраст человека равен "+age+", то он еще слишком мал");
        }
    }

    public static void run5(){
        System.out.println("Задание 5");
        int age = 15;
        if (age <= 5){
            System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на аттракционе");
        }
        else if (age > 5 && age <= 14){
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе в сопровождении");
        }
        else if (age > 14){
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void run6(){
        System.out.println("Задание 6");
        int passenger = 0;
        if (passenger <= 108 && passenger >= 0){
            if (passenger < 60){
                System.out.println("В вагоне "+passenger+" пассажиров, есть сидячие и стоячие места");
            }
            else {
                System.out.println("В вагоне "+passenger+" пассажиров, есть только стоячие места");
            }
        }
        else {
            System.out.println("Мест в вагоне нет");
        }
    }

    public static void run7(){
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three){
            if (one > two && one > three){
                System.out.println("Переменная one больше остальных");
            }
            else if (one == two && one != three){
                System.out.println("Переменная one равна переменной two и они больше остальных");
            }
            else if (one == three && one !=two){
                System.out.println("Переменная one равна переменной three и они больше остальных");
            }
            else {
                System.out.println("Все переменные равны");
            }

        }
        else if (two > one && two >= three){
            if (one > two && one > three){
                System.out.println("Переменная two больше остальных");
            }
            else if (two == three){
                System.out.println("Переменная two равна переменной three и они больше остальных");
            }
        }
        else if (three > one && three > two){
            System.out.println("Переменная three больше остальных");
        }

    }

}