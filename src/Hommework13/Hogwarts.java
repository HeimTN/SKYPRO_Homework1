package Hommework13;

public class Hogwarts {
    private final Student[] students = {
            new Student("Гарри Поттер", 10, 10),
            new Student("Гермиона Грейнджер", 15, 12),
            new Student("Рон Уизли", 8, 6),
            new Student("Драко Малфой", 9, 11),
            new Student("Грэхэм Монтегю", 14, 12),
            new Student("Грегори Гойл", 4, 10),
            new Student("Захария Смит", 7, 4),
            new Student("Седрик Диггори", 1, 3),
            new Student("Джастин Финч-Флетчли", 5, 9),
            new Student("Чжоу Чанг", 11, 12),
            new Student("Падма Патил", 14, 18),
            new Student("Маркус Белби", 8, 19)
    };
    private final Department[] hogwarts = {
            new Griffindor(5,10,15, students[0]),
            new Griffindor(8,11,12, students[1]),
            new Griffindor(6, 3,8,students[2]),
            new Slizerin(11,5,8,6,2,students[3]),
            new Slizerin(4,15,13,8,1, students[4]),
            new Slizerin(14, 3,8,1,15, students[5]),
            new Puffendui(6,13,5,students[6]),
            new Puffendui(9,1,4,students[7]),
            new Puffendui(15,12,4,students[8]),
            new Kogtevran(6,4,2,14,students[9]),
            new Kogtevran(9,13,12,2,students[10]),
            new Kogtevran(11,4,12,15,students[11])
    };
    public void fullListStudent(){
        for(Department department : hogwarts){
            System.out.println(department.getStudent().toString());
            System.out.println(department.toString());
        }
    }
    // Выводит на экран описание студента
    public void descriptionStudent(int count){ 
        Student student = searchStudent(count);
        Department department = searchDepartment(student);
        System.out.println(student.toString()+ " Факультет: " +department.getDepartmentName());
        System.out.println(department.toString());
    }
    //Лучший ученик Гриффиндора
    public void compareStudentGriffindor(){
        Student student = null;
        Griffindor temp = null;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < hogwarts.length-1; i++) {
            if(hogwarts[i].getClass().equals(Griffindor.class)){
                sum1 = ((Griffindor) hogwarts[i]).getNobleness()+ ((Griffindor) hogwarts[i]).getHonor()+ ((Griffindor) hogwarts[i]).getBravery();
                if (hogwarts[i+1].getClass().equals(Griffindor.class)){
                    sum2 = ((Griffindor) hogwarts[i + 1]).getNobleness()+ ((Griffindor) hogwarts[i + 1]).getHonor()+ ((Griffindor) hogwarts[i + 1]).getBravery();
                } 
                else {
                     if(temp != null) sum2 = temp.getNobleness()+ temp.getBravery()+ temp.getHonor();
                     else throw new IllegalArgumentException("Что то пошло не так, проверьте метод compareStudentGriffindor");
                }
                if(sum1 > sum2) {
                    student = hogwarts[i].getStudent();
                    temp = (Griffindor) hogwarts[i];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum1);
                    System.out.println("Студент: "+hogwarts[i+1].getStudent().getName()+" Очки: "+sum2);
                    System.out.println("У Студента "+ student.getName()+" очков больше");
                }
                else if (sum2 > sum1) {
                    student = hogwarts[i + 1].getStudent();
                    temp = (Griffindor) hogwarts[i + 1];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum2);
                    System.out.println("Студент: "+hogwarts[i].getStudent().getName()+" Очки: "+sum1);
                    System.out.println("У Студента "+ student.getName()+" очков больше");
                }
                else {
                    student = hogwarts[i].getStudent();
                    temp = (Griffindor) hogwarts[i];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum1);
                    System.out.println("Студент: "+hogwarts[i].getStudent().getName()+" Очки: "+sum2);
                    System.out.println("У Студентов одинаковое кол-во очков");
                }
            }
        }
        if(student != null)System.out.println("Самый лучший ученик Гриффиндора: "+student.toString());
        else throw new IllegalArgumentException("Учеников в Гриффиндоре нет");
    }
    //Лучший ученик Пуффендуя
    public void compareStudentPuffendui(){
        Student student = null;
        Puffendui temp = null;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < hogwarts.length; i++) {
            if(hogwarts[i] instanceof Puffendui){
                sum1 = ((Puffendui) hogwarts[i]).getProbity()+ ((Puffendui) hogwarts[i]).getLoyalty()+ ((Puffendui) hogwarts[i]).getIndustry();
                if (hogwarts[i+1] instanceof Puffendui){
                    sum2 = ((Puffendui) hogwarts[i + 1]).getProbity()+ ((Puffendui) hogwarts[i + 1]).getLoyalty()+ ((Puffendui) hogwarts[i + 1]).getIndustry();
                }
                else {
                    if(temp != null) sum2 = temp.getProbity()+ temp.getLoyalty()+ temp.getIndustry();
                    else throw new IllegalArgumentException("Что то пошло не так, проверьте метод compareStudentPuffendui");
                }
                if(sum1 > sum2) {
                    student = hogwarts[i].getStudent();
                    temp = (Puffendui) hogwarts[i];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum1);
                    System.out.println("Студент: "+hogwarts[i+1].getStudent().getName()+" Очки: "+sum2);
                    System.out.println("У Студента "+ student.getName()+" очков больше");
                }
                else if (sum2 > sum1) {
                    student = hogwarts[i + 1].getStudent();
                    temp = (Puffendui) hogwarts[i + 1];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum2);
                    System.out.println("Студент: "+hogwarts[i].getStudent().getName()+" Очки: "+sum1);
                    System.out.println("У Студента "+ student.getName()+" очков больше");
                }
                else {
                    student = hogwarts[i].getStudent();
                    temp = (Puffendui) hogwarts[i];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum1);
                    System.out.println("Студент: "+hogwarts[i].getStudent().getName()+" Очки: "+sum2);
                    System.out.println("У Студентов одинаковое кол-во очков");
                }
            }
        }
        if(student != null)System.out.println("Самый лучший ученик Пуфендуя: "+student.toString());
        else throw new IllegalArgumentException("Учеников в Пуфендуе нет");
    }
    //Лучший ученик Когтеврана
    public void compareStudentKogtevran(){
        Student student = null;
        Kogtevran temp = null;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < hogwarts.length; i++) {
            if(hogwarts[i] instanceof Kogtevran){
                sum1 = ((Kogtevran) hogwarts[i]).getMind()+ ((Kogtevran) hogwarts[i]).getWisdom()+ 
                        ((Kogtevran) hogwarts[i]).getWittiness()+ ((Kogtevran) hogwarts[i]).getCreativity();
                if (hogwarts[i+1] instanceof Kogtevran){
                    sum2 = ((Kogtevran) hogwarts[i + 1]).getMind()+ ((Kogtevran) hogwarts[i + 1]).getWisdom()+ 
                            ((Kogtevran) hogwarts[i + 1]).getWittiness() + ((Kogtevran) hogwarts[i + 1]).getCreativity();
                }
                else {
                    if(temp != null) sum2 = temp.getMind()+ temp.getWisdom()+ temp.getWittiness()+ temp.getCreativity();
                    else throw new IllegalArgumentException("Что то пошло не так, проверьте метод compareStudentKogtevran");
                }
                if(sum1 > sum2) {
                    student = hogwarts[i].getStudent();
                    temp = (Kogtevran) hogwarts[i];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum1);
                    System.out.println("Студент: "+hogwarts[i+1].getStudent().getName()+" Очки: "+sum2);
                    System.out.println("У Студента "+ student.getName()+" очков больше");
                }
                else if (sum2 > sum1) {
                    student = hogwarts[i + 1].getStudent();
                    temp = (Kogtevran) hogwarts[i + 1];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum2);
                    System.out.println("Студент: "+hogwarts[i].getStudent().getName()+" Очки: "+sum1);
                    System.out.println("У Студента "+ student.getName()+" очков больше");
                }
                else {
                    student = hogwarts[i].getStudent();
                    temp = (Kogtevran) hogwarts[i];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum1);
                    System.out.println("Студент: "+hogwarts[i].getStudent().getName()+" Очки: "+sum2);
                    System.out.println("У Студентов одинаковое кол-во очков");
                }
            }
        }
        if(student != null)System.out.println("Самый лучший ученик Когтаврана: "+student.toString());
        else throw new IllegalArgumentException("Учеников в Когтевране нет");
    }
    //Лучший ученик Слизерина
    public void compareStudentSlizerin(){
        Student student = null;
        Slizerin temp = null;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < hogwarts.length; i++) {
            if(hogwarts[i] instanceof Slizerin){
                sum1 = ((Slizerin) hogwarts[i]).getAuthority()+ ((Slizerin) hogwarts[i]).getAmbition()+
                        ((Slizerin) hogwarts[i]).getResourcefulness()+ ((Slizerin) hogwarts[i]).getTrickery() + ((Slizerin) hogwarts[i]).getDetermination();
                if (hogwarts[i+1] instanceof Slizerin){
                    sum2 = ((Slizerin) hogwarts[i + 1]).getAuthority()+ ((Slizerin) hogwarts[i + 1]).getAmbition()+
                            ((Slizerin) hogwarts[i + 1]).getResourcefulness() + ((Slizerin) hogwarts[i + 1]).getTrickery() + ((Slizerin) hogwarts[i + 1]).getDetermination();
                }
                else {
                    if(temp != null) sum2 = temp.getAuthority()+ temp.getTrickery()+ temp.getAmbition()+ temp.getResourcefulness()+ temp.getDetermination();
                    else throw new IllegalArgumentException("Что то пошло не так, проверьте метод compareStudentSlizerin");
                }
                if(sum1 > sum2) {
                    student = hogwarts[i].getStudent();
                    temp = (Slizerin) hogwarts[i];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum1);
                    System.out.println("Студент: "+hogwarts[i+1].getStudent().getName()+" Очки: "+sum2);
                    System.out.println("У Студента "+ student.getName()+" очков больше");
                }
                else if (sum2 > sum1) {
                    student = hogwarts[i + 1].getStudent();
                    temp = (Slizerin) hogwarts[i + 1];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum2);
                    System.out.println("Студент: "+hogwarts[i].getStudent().getName()+" Очки: "+sum1);
                    System.out.println("У Студента "+ student.getName()+" очков больше");
                }
                else {
                    student = hogwarts[i].getStudent();
                    temp = (Slizerin) hogwarts[i];
                    System.out.println("Студент: "+student.getName()+" Очки: "+sum1);
                    System.out.println("Студент: "+hogwarts[i].getStudent().getName()+" Очки: "+sum2);
                    System.out.println("У Студентов одинаковое кол-во очков");
                }
            }
        }
        if(student != null)System.out.println("Самый лучший ученик Слизерина: "+student.toString());
        else throw new IllegalArgumentException("Учеников в Слизерине нет");
    }
    public void compareManaStudents(int studentCount1, int studentCount2){
        if(searchStudent(studentCount1).getMana() > searchStudent(studentCount2).getMana())
            System.out.println("У студента "+searchStudent(studentCount1).getName()+" маны больше, чем у "+ searchStudent(studentCount2).getName());
        else if(searchStudent(studentCount1).getMana() < searchStudent(studentCount2).getMana())
            System.out.println("У студента "+searchStudent(studentCount2).getName()+" маны больше, чем у "+ searchStudent(studentCount1).getName());
        else System.out.println("У студентов "+searchStudent(studentCount1).getName()+" и "+ searchStudent(studentCount2).getName()+" одинаковое кол-во маны");
    }
    public void compareTravelRangeStudents(int studentCount1, int studentCount2){
        if(searchStudent(studentCount1).getTravelRange() > searchStudent(studentCount2).getTravelRange()) System.out.println("У студента "+searchStudent(studentCount1).getName()+
                " более большой талант к трансгрессии, чем у "+ searchStudent(studentCount2).getName());
        else if(searchStudent(studentCount1).getTravelRange() < searchStudent(studentCount2).getTravelRange()) System.out.println("У студента "+searchStudent(studentCount2).getName()+
                " более большой талант к трансгрессии, чем у "+ searchStudent(studentCount1).getName());
        else System.out.println("У студентов "+searchStudent(studentCount1).getName()+" и "+ searchStudent(studentCount2).getName()+" одинаковый талант к трансгрессии");
    }
    private Student searchStudent(int count){
        Student student = null;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getCounter() == count){
                student = students[i];
                break;
            }
        }
        if(student != null) return student;
        else throw new IllegalArgumentException("Студент не найден");
    }
    private Department searchDepartment(Student student){
        Department department = null;
        for (int i = 0; i < hogwarts.length; i++) {
            if(hogwarts[i].getStudent().equals(student)){
                department = hogwarts[i];
                break;
            }
        }
        if(department != null) return department;
        else throw new IllegalArgumentException("Факультет не найден");
    }
}
