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
            if(employee != null)
            sum += employee.getSalary();
        }
        return sum;
    }
    private int getSumSalary(Employee[] emp){
        int sum = 0;
        for (Employee employee : emp) {
            if(employee != null)
            sum += employee.getSalary();
        }
        return sum;
    }
    public int getIdEmpMinSalary(){
        int temp = Integer.MAX_VALUE;
        Employee temp1 = null;
        for (Employee employee : this.employees) {
            if (employee != null && temp > employee.getSalary()) {
                temp = employee.getSalary();
                temp1 = employee;
            }
        }
        return searchByID(temp1.getId(),this.employees);
    }
    private int getIdEmpMinSalary(Employee[] emp){
        int temp = Integer.MAX_VALUE;
        Employee temp1 = null;
        for (Employee employee : emp) {
            if (employee != null && temp > employee.getSalary()) {
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
            if (employee != null && temp < employee.getSalary()) {
                temp = employee.getSalary();
                temp1 = employee;
            }
        }
        return searchByID(temp1.getId(),this.employees);
    }
    private int getIdEmpMaxSalary(Employee[] emp){
        int temp = Integer.MIN_VALUE;
        Employee temp1 = null;
        for (Employee employee : emp) {
            if (employee != null && temp < employee.getSalary()) {
                temp = employee.getSalary();
                temp1 = employee;
            }
        }
        return temp1.getId();
    }

    public int getMiddleSalary(){
        return getSumSalary()/this.employees.length;
    }
    private int getMiddleSalary(Employee[] emp){
        return getSumSalary(emp)/emp.length;
    }
    public void getNameListEmp(){
        for (Employee employee : this.employees) {
            if(employee != null)
            System.out.println(employee.getId() + ". Фамилия: " + employee.getLastName() + " Имя: " + employee.getFirstName() + " Отчетсво: " + employee.getSurName());
            else System.out.println("Сотрудник отсутсвует");
        }
    }
    //Повышенная сложность
    public void indexingSalary(int rate){
        float temp = (float)rate/100;
        for(Employee employee : this.employees){
            if(employee != null)
            employee.setSalary((int)(employee.getSalary()+employee.getSalary()*temp));
        }
    }
    private void indexingSalary(int rate, Employee[] emp){
        float temp = (float)rate/100;
        for(Employee employee : emp){
            if (employee != null)
            employee.setSalary((int)(employee.getSalary()+employee.getSalary()*temp));
        }
    }
    public int searchByID(int id, Employee[] emp){
        for(int i = 0; i < emp.length;i++){
            if(emp[i].getId() == id) return i;
        }
        throw new IllegalArgumentException("ID не найден");
    }
    private int searchByName(String lastName, String firstName, String surName, Employee[] emp){
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
            if(employee != null && employee.getDepart() == depart){
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
        for(int i = 1; i < 6; i++) printDepart(i);
    }
    private void printDepart(int depart){
        System.out.println("Отдел "+ depart);
        for (Employee employee : this.employees)
            if(employee.getDepart() == depart)
                System.out.println("Сотрудник: "+employee.getLastName()+" "+employee.getFirstName()+" "+employee.getSurName());
    }
}
