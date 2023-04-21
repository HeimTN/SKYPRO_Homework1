package Homework14;

public class Car extends Machine{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkDetails() {
        System.out.println("Проверяем двигатель");
    }
}
