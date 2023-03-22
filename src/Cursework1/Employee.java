package Cursework1;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String surName;
    private int depart;
    private int salary;
    private int id;
    private static int counter = 1;

    public Employee(String firstName, String lastName, String surName, int depart, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        if(depart > 0 && depart <= 5) this.depart = depart;
        else throw new IllegalArgumentException("Неверный номер отдела");
        this.salary = salary;
        this.id = counter;
        counter++;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSurName(){
        return surName;
    }
    public int getDepart(){
        return depart;
    }
    public int getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    public void setDepart(int temp){
        this.depart = temp;
    }
    public void setSalary(int temp){
        this.salary = temp;
    }
    @Override
    public String toString(){
        return getId()+". Сотрудник: "+getLastName()+" "+getFirstName()+" "+getSurName()+"; Отдел №"+getDepart()+" Получает зарплату: "+getSalary()+" руб.";
    }
}
