public class Main {
    public static void main(String[] args) {
        System.out.println("Здарова, отец!");
        int[] test = {1,2,3,4,5,6,7,8};
        printMass(test);
        reverse2(test);
        printMass(test);
    }

    public static void reverse2(int[] temp){
        int test2 = 0;
        for(int i = temp.length-1, j = 0; i >= 0 && j < (int)(temp.length/2); i--, j++){
            test2 = temp[j];
            temp[j] = temp[i];
            temp[i] = test2;
        }
    }

    public static void printMass(int[] temp){
        for (int i: temp) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

}