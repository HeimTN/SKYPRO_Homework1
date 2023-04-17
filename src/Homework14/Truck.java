package Homework14;

public class Truck extends Machine{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkDetails() {
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}
