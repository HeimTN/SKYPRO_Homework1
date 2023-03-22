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
        indexingSalary(10,employees);
        getListEmp(employees);
        infoDepart(1,employees);
        selectMinSalary(10000, employees);
        selectMaxSalary(40000, employees);
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
    public static void indexingSalary(int rate, Employee[] emp){
        float temp = (float)rate/100;
        for(Employee employee : emp){
            employee.setSalary((int)(employee.getSalary()+employee.getSalary()*temp));
        }
    }
    public static int searchByID(int id, Employee[] emp){
        for(int i = 0; i < emp.length;i++){
            if(emp[i].getId() == id) return i;
        }
        throw new IllegalArgumentException("ID не найден");
    }
    public static void infoDepart(int depart, Employee[] emp){
        int maxIndex = 0;
        for(Employee employee : emp){
            if(employee.getDepart() == depart){
                maxIndex++;
            }
        }
        Employee[] temp = new Employee[maxIndex];
        for(Employee employee:emp){
            if(employee.getDepart() == depart){
                for(int i = 0; i < temp.length; i++){
                    if(temp[i] == null){
                        temp[i] = employee;
                        break;
                    }
                }
            }
        }
        System.out.println("Минимальная зарплата по отделу: "+temp[searchByID(getIdEmpMinSalary(temp),temp)].toString());
        System.out.println("Максимальная зарплата по отделу: "+temp[searchByID(getIdEmpMaxSalary(temp),temp)].toString());
        System.out.println("Сумма затрат на зарплату по отделу: "+getSumSalary(temp));
        System.out.println("Средняя зарплата по отделу: "+getMiddleSalary(temp));
        indexingSalary(10,temp);
        for(Employee employee:temp){
            System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName()+
                    "; Зарплата: "+employee.getSalary()+" руб. ID в общей БД: "+employee.getId());
        }
    }

    public static void selectMinSalary(int salary, Employee[] emp){
        for(Employee employee : emp){
            if(employee.getSalary() < salary){
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName()+
                        "; Зарплата: "+employee.getSalary()+" руб. ID в общей БД: "+employee.getId());
            }
        }
    }
    public static void selectMaxSalary(int salary, Employee[] emp){
        for(Employee employee : emp){
            if(employee.getSalary() > salary){
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName()+
                        "; Зарплата: "+employee.getSalary()+" руб. ID в общей БД: "+employee.getId());
            }
        }
    }
}
