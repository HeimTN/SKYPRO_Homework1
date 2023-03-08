import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Здарова, отец!");
        checkYear(2023);
        checkOSInPhone(1, LocalDate.now().getYear());
        System.out.println("Дней для доставки: "+checkTimeToDelivery(23));
    }

    public static void checkYear(int year){
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

    public static void checkOSInPhone(int clientOS, int clientDeviceYear){
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

    public static int checkTimeToDelivery(int deliveryDistance){
        if (deliveryDistance < 20){
            return 1;
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60){
            return 2;
        }
        else if (deliveryDistance >= 60 && deliveryDistance < 100){
            return 3;
        }
        else {
            System.out.println("Доставки нет");
            return 0;
        }
    }


}