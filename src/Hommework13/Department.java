package Hommework13;

public abstract class Department {
    private Student student;
    public Department(Student student){
        this.student = student;
    }
    public Student getStudent(){return student;}
    public String getDepartmentName(){return null;}
}
