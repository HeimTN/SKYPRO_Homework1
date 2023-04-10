package Hommework13;

public class Puffendui extends Department{
    private final CharacterProperty industry;
    private final CharacterProperty loyalty;
    private final CharacterProperty probity;
    private static final String name = "Puffendui";

    public Puffendui(int industry, int loyalty, int probity, Student student){
        super(student);
        this.industry = new CharacterProperty(industry);
        this.loyalty = new CharacterProperty(loyalty);
        this.probity = new CharacterProperty(probity);
    }

    public int getIndustry(){
        return industry.getValue();
    }
    public int getLoyalty(){
        return loyalty.getValue();
    }
    public int getProbity(){
        return probity.getValue();
    }

    @Override
    public String getDepartmentName() {
        return name;
    }

    @Override
    public String toString() {
        return "Трудолюбие: "+this.getIndustry()+", Верность: "+this.getLoyalty()+", Честность: "+ this.getProbity();
    }
}
