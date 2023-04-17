package Homework14;

public abstract class Machine implements IMachineService{
    private String modelName;
    private int wheelsCount;

    public Machine(String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName(){
        return modelName;
    }

    public int getWheelsCount(){
        return wheelsCount;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    public void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
