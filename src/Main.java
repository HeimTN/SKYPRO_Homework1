import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Здарова, отец!");
        run1();
    }


    public static void run1(){
        System.out.println("Задача 1 - 4");
        // Задача 1
        int[] integerMass = new int[3];
        integerMass[0] = 1;
        integerMass[1] = 2;
        integerMass[2] = 3;

        double[] doubMass = {1.57, 7.654, 9.986};

        boolean[] trueOrFalse = new boolean[2];
        trueOrFalse[0] = true;

        // Задача 2
        for (int i = 0; i < integerMass.length; i++){
            System.out.print(integerMass[i]);
            if( i < integerMass.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubMass.length; i++){
            System.out.print(doubMass[i]);
            if( i < doubMass.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < trueOrFalse.length; i++){
            System.out.print(trueOrFalse[i]);
            if( i < trueOrFalse.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 3
        for (int i = integerMass.length - 1; i >= 0; i--){
            System.out.print(integerMass[i]);
            if( i != 0 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubMass.length - 1 ; i >= 0; i--){
            System.out.print(doubMass[i]);
            if( i != 0 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = trueOrFalse.length - 1; i >= 0; i--){
            System.out.print(trueOrFalse[i]);
            if( i != 0 ){
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 4
        for (int i = 0; i < integerMass.length; i++){
            if (integerMass[i] % 2 != 0){
                integerMass[i]++;
            }
        }
        System.out.println(Arrays.toString(integerMass));

    }


}