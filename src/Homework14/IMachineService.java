package Homework14;

public interface IMachineService {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    default void checkDetails(){};
}
