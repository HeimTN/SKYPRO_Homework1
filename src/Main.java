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

    }

    public static void run1(){
        System.out.println("Задача 1");
        int total = 0;
        int sum = 15_000;
        int month = 0;
        while (total < 2_459_000){
            total = total + sum;
            month++;
            System.out.println("Месяц "+month+", сумма накоплений равна "+total+" рублей");
        }

    }

    public static void run2(){
        System.out.println("Задача 2");
        int j = 0;
        while (j < 10){
            j++;
            System.out.print(j + " ");

        }
        System.out.println("");
        for (; j > 0; j--){
            System.out.print(j + " ");
        }
        System.out.println("");
    }

    public static void run3(){
        System.out.println("Задача 3");
        int allPeopleCountryY = 12_000_000;
        int fertilityPer1000People = 17;
        int mortalityPer1000People = 8;
        int year = 1;
        while (year <= 10){
            System.out.println("Год "+year+", численность населения составляет "+allPeopleCountryY);
            allPeopleCountryY = allPeopleCountryY + (((allPeopleCountryY/1000)*fertilityPer1000People)
                    -((allPeopleCountryY/1000)*mortalityPer1000People));
            year++;
        }
    }
    public static void run4(){
        System.out.println("Задача 4");
        int total = 0;
        int needTotal = 12_000_000;
        int sumAdd = 15_000;
        int month = 0;
        while (total < needTotal){
            total = total+sumAdd+(int)(total*0.07);
            month++;
            System.out.println("Месяц: "+month+", накопления: "+total);
        }
    }

    public static void run5(){
        System.out.println("Задача 5");
        int total = 0;
        int needTotal = 12_000_000;
        int sumAdd = 15_000;
        int month = 0;
        while (total < needTotal){
            total = total+sumAdd+(int)(total*0.07);
            month++;
            if(month % 6 == 0) {
                System.out.println("Месяц: " + month + ", накопления: " + total);
            }
        }

    }

    public static void run6(){
        System.out.println("Задача 6");
        int total = 0;
        int sumAdd = 15000;
        int month = 0;
        while (month < 9*12){
            total = total+sumAdd+(int)(total*0.07);
            month++;
            if(month % 6 == 0){
                System.out.println("Месяц: " + month + ", накопления: " + total);
            }
        }
    }

    public static void run7(){
        System.out.println("Задача 7");
        int dataFriday = 5;
        int dayInMonth = 31;
        int currentDay = dataFriday;
        while (currentDay < dayInMonth){
            if(currentDay == dataFriday){
                System.out.println("Сегодня пятница, "+currentDay+"-е число. Необходимо подготовить отчет");
                dataFriday = dataFriday+7;
            }
            currentDay++;
        }
    }
    public static void run8(){
        System.out.println("Задача 8");
        int pastYears = 1823;
        int futureYears = 2123;
        int dataYears = pastYears;
        while (dataYears < futureYears){
            if(dataYears % 79 == 0){
                System.out.println(dataYears);
            }
            dataYears++;
        }
    }


}