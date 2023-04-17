package Homework14;

public class ServiceStation implements IService{
    @Override
    public void check(Bicycle machine) {
        if (machine instanceof Car && machine.getClass() != Truck.class) {
            upTyre(machine);
            ((Car)machine).checkEngine();
        } else if (machine instanceof Truck) {
            upTyre(machine);
            ((Truck)machine).checkEngine();
            ((Truck)machine).checkTrailer();
        } else if (machine != null) {
           upTyre(machine);
        }
    }
}
