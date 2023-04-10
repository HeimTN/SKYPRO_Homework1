package Cursework1;

import java.util.Scanner;

public class Cursework1 {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        book.addNewEmployee("Иванов","Иван","Иванович",2,10200);
        book.addNewEmployee("Васнецов","Василий","Васильевич",3,29300);
        book.addNewEmployee("Петров","Пётр","Петрович",1,89200);
        book.addNewEmployee("Девинцина","Диана","Петрова",4,800);
        book.addNewEmployee("Рылов","Антон","Валерьевич",5,190990);
        book.addNewEmployee("Кудрявцева","Анна","Иванова",5,74000);
        book.addNewEmployee("Быков","Елисей","Инокентевич",2,32000);
        book.addNewEmployee("Синицина","Екатерина","Дмитриевна",1,12000);
        book.addNewEmployee("Кудряшов","Леонид","Антонович",3,7800);
        book.addNewEmployee("Антонов","Денис","Валерьевич",4,43900);
        System.out.println("Введите номер необходимой операции.");
        System.out.println("1 - Список всех сотрудников;");
        System.out.println("2 - Общая сумма зарплат;");
        System.out.println("3 - Сотрудник с мининальной зарплатой;");
        System.out.println("4 - Сотрудник с максимальной зарплатой;");
        System.out.println("5 - Средняя зарплата;");
        System.out.println("6 - Список ФИО всех сотрудников;");
        System.out.println("7 - Проиндексировать зарплату всех сотрудников;");
        System.out.println("8 - Работа с определенным отделом;");
        System.out.println("9 - Выявить зарплату выше или ниже определенного значение;");
        System.out.println("10 - Добавить нового сотрудника в БД;");
        System.out.println("11 - Удалить сотрудника из БД;");
        System.out.println("12 - Изменить данные о сотруднике;");
        System.out.println("13 - Получить список сотрудников по отделам;");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        switch (temp) {
            case 1 -> book.getListEmp();
            case 2 -> System.out.println("Общая сумма зарплат: " + book.getSumSalary());
            case 3 ->
                    System.out.println("Сотрудник с минимальной зарплатой" + book.getEmpFromList(book.getIdEmpMinSalary()));
            case 4 ->
                    System.out.println("Сотрудник с максимальной зарплатой" + book.getEmpFromList(book.getIdEmpMaxSalary()));
            case 5 -> System.out.println("Средняя зарплата всех сотрудников" + book.getMiddleSalary());
            case 6 -> book.getNameListEmp();
            case 7 -> {
                System.out.println("Введите процент индексации");
                int temp1 = scanner.nextInt();
                book.indexingSalary(temp1);
                System.out.println("Зарплата всех сотрудников проиндексированна на " + temp1 + "%");
            }
            case 8 -> {
                System.out.println("Введите номер отдела");
                int temp2 = scanner.nextInt();
                System.out.println("Введите процент индексации отдела");
                int temp3 = scanner.nextInt();
                book.infoDepart(temp2, temp3);
            }
            case 9 -> {
                System.out.println("1 - зарплата ниже числа, 2 - зарплата выше числа");
                int temp4 = scanner.nextInt();
                System.out.println("Введите необходимое число");
                int temp5 = scanner.nextInt();
                if (temp4 == 1) book.selectMinSalary(temp5);
                else if (temp4 == 2) book.selectMaxSalary(temp5);
                else throw new IllegalArgumentException("Введены неверные данные");
            }
            case 10 -> {
                System.out.println("Введите данные нового сотрудника");
                System.out.println("Фамилия");
                String tempLN = scanner.next();
                System.out.println("Имя");
                String tempFN = scanner.next();
                System.out.println("Отчество");
                String tempSN = scanner.next();
                System.out.println("Отдел");
                int tempDep = scanner.nextInt();
                System.out.println("Зарплата");
                int tempSal = scanner.nextInt();
                book.addNewEmployee(tempLN, tempFN, tempSN, tempDep, tempSal);
            }
            case 11 -> {
                System.out.println("Введите данные сотрудника для удаления");
                System.out.println("Фамилия");
                String tempLN1 = scanner.next();
                System.out.println("Имя");
                String tempFN1 = scanner.next();
                System.out.println("Отчество");
                String tempSN1 = scanner.next();
                book.deleteEmployee(tempLN1, tempFN1, tempSN1);
            }
            case 12 -> {
                System.out.println("Введите данные сотрудника для изменения");
                System.out.println("Фамилия");
                String tempLN2 = scanner.next();
                System.out.println("Имя");
                String tempFN2 = scanner.next();
                System.out.println("Отчество");
                String tempSN2 = scanner.next();
                System.out.println("Введите зарплату или департамент");
                int tempVal = scanner.nextInt();
                book.changeEmployee(tempLN2, tempFN2, tempSN2, tempVal);
                System.out.println(book.getEmpFromList(book.searchByName(tempLN2,tempFN2,tempSN2)));
            }
            case 13 -> book.getListDepart();
            default -> throw new IllegalArgumentException("Введены неверные данные");
        }


    }
}
