package Hommework13;

public class Student {
    private final String name;
    private final int mana; // Измерение мощности колдовства
    private final int travelRange;
    private final int id;
    private static int counter = 1;

    public Student(String name, int mana, int travelRange){
        this.name = name;
        this.mana = mana;
        this.travelRange = travelRange;
        this.id = counter;
        counter++;
    }

    public String getName(){
        return name;
    }
    public int getMana(){
        return mana;
    }
    public int getTravelRange(){
        return travelRange;
    }
    public int getCounter(){
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            return this.getName().equals(((Student) obj).getName()) && this.getMana() == ((Student) obj).getMana() &&
                    this.getTravelRange() == ((Student) obj).getTravelRange();
        }
        else throw new IllegalArgumentException("Сравниваемый обьект равен null или не является подходящим классом");
    }

    @Override
    public String toString() {
        return this.getCounter()+". Имя: "+this.getName()+", Мана: "+this.getMana()+", Расстояние для трансгрессирования: "+this.getTravelRange();
    }
}
