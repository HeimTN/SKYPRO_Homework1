package Cursework1;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void getListEmp(){
        for (Employee employee : this.employees) {
            System.out.println(employee.toString());
        }
    }
    public String getEmpFromList(int index){
        return this.employees[index].toString();
    }
    public int getSumSalary(){
        int sum = 0;
        for (Employee employee : this.employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public int getSumSalary(Employee[] emp){
        int sum = 0;
        for (Employee employee : emp) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public int getIdEmpMinSalary(){
        int temp = Integer.MAX_VALUE;
        Employee temp1 = null;
        for (Employee employee : this.employees) {
            if (temp > employee.getSalary()) {
                temp = employee.getSalary();
                temp1 = employee;
            }
        }
        return searchByID(temp1.getId(),this.employees);
    }
    public int getIdEmpMinSalary(Employee[] emp){
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

    public int getIdEmpMaxSalary(){
        int temp = Integer.MIN_VALUE;
        Employee temp1 = null;
        for (Employee employee : this.employees) {
            if (temp < employee.getSalary()) {
                temp = employee.getSalary();
                temp1 = employee;
            }
        }
        return searchByID(temp1.getId(),this.employees);
    }
    public int getIdEmpMaxSalary(Employee[] emp){
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

    public int getMiddleSalary(){
        return getSumSalary()/this.employees.length;
    }
    public int getMiddleSalary(Employee[] emp){
        return getSumSalary(emp)/emp.length;
    }
    public void getNameListEmp(){
        for (Employee employee : this.employees) {
            System.out.println(employee.getId() + ". Фамилия: " + employee.getLastName() + " Имя: " + employee.getFirstName() + " Отчетсво: " + employee.getSurName());
        }
    }
    //Повышенная сложность
    public void indexingSalary(int rate){
        float temp = (float)rate/100;
        for(Employee employee : this.employees){
            employee.setSalary((int)(employee.getSalary()+employee.getSalary()*temp));
        }
    }
    public void indexingSalary(int rate, Employee[] emp){
        float temp = (float)rate/100;
        for(Employee employee : emp){
            employee.setSalary((int)(employee.getSalary()+employee.getSalary()*temp));
        }
    }
    public int searchByID(int id, Employee[] emp){
        for(int i = 0; i < emp.length;i++){
            if(emp[i].getId() == id) return i;
        }
        throw new IllegalArgumentException("ID не найден");
    }
    public int searchByName(String lastName, String firstName, String surName, Employee[] emp){
        for(int i = 0; i < emp.length;i++){
            if(emp[i].getLastName().equals(lastName) && emp[i].getFirstName().equals(firstName) && emp[i].getSurName().equals(surName))
                return i;
        }
        throw new IllegalArgumentException("Сотрудник не найден");
    }
    public int searchByName(String lastName, String firstName, String surName){
        for(int i = 0; i < this.employees.length;i++){
            if(this.employees[i].getLastName().equals(lastName) && this.employees[i].getFirstName().equals(firstName) && this.employees[i].getSurName().equals(surName))
                return i;
        }
        throw new IllegalArgumentException("Сотрудник не найден");
    }
    public void infoDepart(int depart, int indexation){
        int maxIndex = 0;
        for(Employee employee : this.employees){
            if(employee.getDepart() == depart){
                maxIndex++;
            }
        }
        Employee[] temp = new Employee[maxIndex];
        for(Employee employee:this.employees){
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
        indexingSalary(indexation,temp);
        for(Employee employee:temp){
            System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName()+
                    "; Зарплата: "+employee.getSalary()+" руб. ID в общей БД: "+employee.getId());
        }
    }

    public void selectMinSalary(int salary){
        for(Employee employee : this.employees){
            if(employee.getSalary() < salary){
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName()+
                        "; Зарплата: "+employee.getSalary()+" руб. ID в общей БД: "+employee.getId());
            }
        }
    }
    public void selectMaxSalary(int salary){
        for(Employee employee : this.employees){
            if(employee.getSalary() > salary){
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName()+
                        "; Зарплата: "+employee.getSalary()+" руб. ID в общей БД: "+employee.getId());
            }
        }
    }
    public void addNewEmployee(String lastName, String firstName, String surName, int depart, int salary){
        Employee newEmp = new Employee(firstName,lastName,surName,depart,salary);
        for(int i = 0; i < this.employees.length; i++){
            if(this.employees[i] == null) {
                this.employees[i] = newEmp;
                break;
            }
        }
    }
    public void deleteEmployee(String lastName, String firstName, String surName){
        for(int i = 0; i < this.employees.length; i++){
            if(this.employees[i].getLastName().equals(lastName) && this.employees[i].getFirstName().equals(firstName) && this.employees[i].getSurName().equals(surName))
                this.employees[i] = null;
        }
    }
    public void deleteEmployee(String lastName, String firstName, String surName, int id){
        for(int i = 0; i < this.employees.length; i++){
            if(this.employees[i].getLastName().equals(lastName) && this.employees[i].getFirstName().equals(firstName) && this.employees[i].getSurName().equals(surName)
                    && this.employees[i].getId() == id)
                this.employees[i] = null;
        }
    }
    public void changeEmployee(String lastName, String firstName, String surName, int value){
        if(value > 5){
            this.employees[searchByName(lastName,firstName,surName,this.employees)].setSalary(value);
        }
        else if(value > 0){
            this.employees[searchByName(lastName,firstName,surName,this.employees)].setDepart(value);
        }
        else throw new IllegalArgumentException("Неверные входные данные для изменения сотрудника");
    }
    public void getListDepart(){
        System.out.println("Отдел 1");
        for (Employee employee : this.employees)
            if(employee.getDepart() == 1)
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName());
        System.out.println("Отдел 2");
        for (Employee employee : this.employees)
            if(employee.getDepart() == 2)
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName());
        System.out.println("Отдел 3");
        for (Employee employee : this.employees)
            if(employee.getDepart() == 3)
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName());
        System.out.println("Отдел 4");
        for (Employee employee : this.employees)
            if(employee.getDepart() == 4)
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName());
        System.out.println("Отдел 5");
        for (Employee employee : this.employees)
            if(employee.getDepart() == 5)
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName());
    }
}
