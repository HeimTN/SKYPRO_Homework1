package Hommework13;

public class Griffindor extends Department {
    private final CharacterProperty nobleness;
    private final CharacterProperty honor;
    private final CharacterProperty bravery;
    private final Student student;
    private static final String name = "Griffindor";

    public Griffindor(int nobleness, int honor, int bravery, Student student){
        super(student);
        this.nobleness = new CharacterProperty(nobleness);
        this.honor = new CharacterProperty(honor);
        this.bravery = new CharacterProperty(bravery);
        this.student = student;
    }
    public int getNobleness(){
        return nobleness.getValue();
    }
    public int getHonor(){
        return honor.getValue();
    }
    public int getBravery(){
        return bravery.getValue();
    }

    @Override
    public String getDepartmentName() {
        return name;
    }

    @Override
    public String toString() {
        return "Благородство: "+this.getNobleness()+", Честь: "+this.getHonor()+", Храбрость: "+ this.getBravery();
    }
}
