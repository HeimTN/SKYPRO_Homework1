package Homework14;

public class ServiceStation implements IService{
    @Override
    public void check(Machine machine) {
        upTyre(machine);
        machine.checkDetails();
    }
}
