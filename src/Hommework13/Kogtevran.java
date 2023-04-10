package Hommework13;

public class Kogtevran extends Department{
    private final CharacterProperty mind;
    private final CharacterProperty wisdom;
    private final CharacterProperty wittiness;
    private final CharacterProperty creativity;
    private static final String name = "Kogtevran";

    public Kogtevran(int mind, int wisdom, int wittiness, int creativity, Student student){
        super(student);
        this.mind = new CharacterProperty(mind);
        this.wisdom = new CharacterProperty(wisdom);
        this.wittiness = new CharacterProperty(wittiness);
        this.creativity = new CharacterProperty(creativity);
    }

    public int getMind(){
        return mind.getValue();
    }
    public int getWisdom(){
        return wisdom.getValue();
    }
    public int getWittiness(){
        return wittiness.getValue();
    }
    public int getCreativity(){
        return creativity.getValue();
    }

    @Override
    public String getDepartmentName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ум: "+this.getMind()+", Мудрость: "+this.getWisdom()+", Остроумие: "+this.getWittiness()+", Творчество: "+this.getCreativity();
    }
}
