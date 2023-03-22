package Cursework1;

public class Cursework1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван","Иванов","Иванович",2,10200);
        employees[1] = new Employee("Пётр","Петров","Петрович",1,89200);
        employees[2] = new Employee("Василий","Васнецов","Васильевич",3,29300);
        employees[3] = new Employee("Диана","Девинцина","Петрова",4,800);
        employees[4] = new Employee("Антон","Рылов","Валерьевич",5,190990);
        employees[5] = new Employee("Анна","Кудрявцева","Иванова",5,74000);
        employees[6] = new Employee("Елисей","Быков","Инокентевич",2,32000);
        employees[7] = new Employee("Екатерина","Синицина","Дмитриевна",1,12000);
        employees[8] = new Employee("Леонид","Кудряшов","Антонович",3,7800);
        employees[9] = new Employee("Денис","Антонов","Валерьевич",4,43900);
        getListEmp(employees);
        System.out.println("getSumSalary(employees)= "+getSumSalary(employees));
        System.out.println("getIdEmpMinSalary= "+getIdEmpMinSalary(employees));
        System.out.println("getIdEmpMaxSalary= "+getIdEmpMaxSalary(employees));
        System.out.println("getMiddleSalary="+getMiddleSalary(employees));
        getNameListEmp(employees);
    }
    //Базовая сложность
    public static void getListEmp(Employee[] emp){
        for (Employee employee : emp) {
            System.out.println(employee.toString());
        }
    }
    public static int getSumSalary(Employee[] emp){
        int sum = 0;
        for (Employee employee : emp) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static int getIdEmpMinSalary(Employee[] emp){
        int temp = Integer.MAX_VALUE;
        Employee temp1 = null;
        for (Employee employee : emp) {
            if (temp > employee.getSalary()) {
                temp = employee.getSalary();
                temp1 = employee;
            }
        }
        return temp1.getId();
    }

    public static int getIdEmpMaxSalary(Employee[] emp){
        int temp = Integer.MIN_VALUE;
        Employee temp1 = null;
        for (Employee employee : emp) {
            if (temp < employee.getSalary()) {
                temp = employee.getSalary();
                temp1 = employee;
            }
        }
        return temp1.getId();
    }

    public static int getMiddleSalary(Employee[] emp){
        return getSumSalary(emp)/emp.length;
    }
    public static void getNameListEmp(Employee[] emp){
        for (Employee employee : emp) {
            System.out.println(employee.getId() + ". Фамилия: " + employee.getLastName() + " Имя: " + employee.getFirstName() + " Отчетсво: " + employee.getSurName());
        }
    }
    //Повышенная сложность
    public static void indexingSalary(int rate){
        float temp = 100/(float)rate;

    }
}
