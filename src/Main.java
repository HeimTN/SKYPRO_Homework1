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
        run8();
        run9();
        run10();
    }

    public static void run1(){
        System.out.println("Задача 1");
        for(int i = 1; i <= 10; i++){
            System.out.println("Иттерация " + i);
        }
    }

    public static void run2(){
        System.out.println("Задача 2");
        for(int i = 10; i > 0; i--){
            System.out.println("Реверсивный номер иттерации " + i);
        }
    }

    public static void run3(){
        System.out.println("Задача 3");
        for(int i = 1; i < 17; i++){
            if(i % 2 == 0){
                System.out.println("Число "+i);
            }
        }
    }

    public static void run4(){
        System.out.println("Задача 4");
        for(int i = 10; i >= -10; i--){
            System.out.println(i);
        }
    }

    public static void run5(){
        System.out.println("Задача 5");
        for(int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }
    }

    public static void run6(){
        System.out.println("Задача 6");
        for(int i = 7; i <= 98; i = i + 7){
            System.out.print(i+ " ");
        }
        System.out.println("");
    }

    public static void run7(){
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void run8(){
        System.out.println("Задача 8");
        int total = 0;
        int addSum = 29000;
        for (int i = 1; i < 13; i++){
            total = total + addSum;
            System.out.println("Месяц " + i +" , сумма накоплений равна "+total+" рублей");
        }
    }

    public static void run9(){
        System.out.println("Задача 9");
        int total = 0;
        int addSum = 29000;
        for (int i = 1; i < 13; i++){
            total = total + total/100;
            total = total + addSum;
            System.out.println("Месяц " + i +" , сумма накоплений равна "+total+" рублей");
        }
    }

    public static void run10(){
        System.out.println("Задача 10");
        for(int i = 1; i < 11; i++){
            System.out.println("2 * "+ i +" = "+ 2*i);
        }
    }

}