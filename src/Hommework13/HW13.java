package Hommework13;

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args){
        Hogwarts hogwarts = new Hogwarts();
        hogwarts.fullListStudent();
        System.out.println("Выберите операцию");
        System.out.println("1. Вывести описание студента");
        System.out.println("2. Вывести результаты сравнения по факультетам");
        System.out.println("3. Сравнить учеников по их характеристикам");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        switch (temp){
            case 1 -> {
                System.out.println("Введите номер студента");
                int temp1 = scanner.nextInt();
                hogwarts.descriptionStudent(temp1);
            }
            case 2 ->{
                System.out.println("Выберите факультет");
                System.out.println("1. Гриффиндор");
                System.out.println("2. Пуффендуй");
                System.out.println("3. Когтеврат");
                System.out.println("4. Слизерин");
                int temp2 = scanner.nextInt();
                switch (temp2){
                    case 1 -> hogwarts.compareStudentGriffindor();
                    case 2 -> hogwarts.compareStudentPuffendui();
                    case 3 -> hogwarts.compareStudentKogtevran();
                    case 4 -> hogwarts.compareStudentSlizerin();
                    default -> throw new IllegalArgumentException("Выбран неверный факультет");
                }
            }
            case 3 ->{
                System.out.println("Выберите характеристики для сравнения");
                System.out.println("1. По мане");
                System.out.println("2. По таланту к трансгрессии");
                int temp3 = scanner.nextInt();
                if (temp3 == 1){
                    System.out.println("Введите номера студентов");
                    int temp4 = scanner.nextInt();
                    int temp5 = scanner.nextInt();
                    hogwarts.compareManaStudents(temp4, temp5);
                }
                else if(temp3 == 2){
                    System.out.println("Введите номера студентов");
                    int temp4 = scanner.nextInt();
                    int temp5 = scanner.nextInt();
                    hogwarts.compareTravelRangeStudents(temp4, temp5);
                }
                else throw new IllegalArgumentException("Выбрано неверное действие");

            }
            default -> throw new IllegalArgumentException("Выбрано неверное действие");
        }

    }
}
