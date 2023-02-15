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
        System.out.println("Задача 1");
        byte clientOS = 1;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Данная операционная система не поддерживается");
        }
    }

    public static void run2(){
        System.out.println("Задача 2");
        byte clientOS = 1;
        int clientDeviceYear = 2015;
        if(clientOS == 0){
            if(clientDeviceYear <= 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылк");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else if (clientOS == 1){
            if(clientDeviceYear <= 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }
        else {
            System.out.println("Данная операционная система не поддерживается");
        }
    }

    public static void run3(){
        System.out.println("Задача 3");
        int year = 2021;
        if(year % 400 == 0){
            System.out.println(year+" год является високосным");
        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year+" год является високосным");
        }
        else {
            System.out.println(year+" год не является високосным");
        }
    }
    public static void run4(){
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставки нет");
        }
    }
    public static void run5(){
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нетю");
        }
    }

}