package Hommework13;

public class Slizerin extends Department{
    private final CharacterProperty trickery;
    private final CharacterProperty determination;
    private final CharacterProperty ambition;
    private final CharacterProperty resourcefulness;
    private final CharacterProperty authority;
    private static final String name = "Slizerin";

    public Slizerin(int trickery, int determination, int ambition, int resourcefulness, int authority, Student student){
        super(student);
        this.trickery = new CharacterProperty(trickery);
        this.determination = new CharacterProperty(determination);
        this.ambition = new CharacterProperty(ambition);
        this.resourcefulness = new CharacterProperty(resourcefulness);
        this.authority = new CharacterProperty(authority);
    }

    public int getTrickery(){
        return trickery.getValue();
    }
    public int getDetermination(){
        return determination.getValue();
    }
    public int getAmbition(){
        return ambition.getValue();
    }
    public int getResourcefulness(){
        return resourcefulness.getValue();
    }
    public int getAuthority(){
        return authority.getValue();
    }

    @Override
    public String getDepartmentName() {
        return name;
    }

    @Override
    public String toString() {
        return "Хитрость: "+this.getTrickery()+", Решительность: "+this.getDetermination()+", Амбициозность: "+this.getAmbition()
                +", Находчивость: "+this.getResourcefulness()+", Жажда власти: "+this.getAuthority();
    }
}
