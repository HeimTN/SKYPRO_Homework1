package Homework14;

public interface IService {
    public void check(Bicycle machine);
    default void upTyre(Bicycle machine){
        System.out.println("Обслуживаем " + machine.getModelName());
        for (int i = 0; i < machine.getWheelsCount(); i++) {
            machine.updateTyre();
        }
    }
}
