public class Main {
    public static void main(String[] args) {
        System.out.println("Здарова, отец!");
        run1();
        run2();
        run3();
        run4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void run1(){
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for(int temp : arr){
            sum = sum + temp;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }

    public static void run2(){
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxSum = -1;
        int minSum = 210_000;
        for (int temp : arr){
            if(temp > maxSum){
                maxSum = temp;
            }
            if (temp < minSum){
                minSum = temp;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSum+" рублей. Максимальная сумма трат за день составила "+maxSum+" рублей");
    }

    public static void run3(){
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int temp : arr){
            sum = sum+temp;
        }
        int middleSumInDay = (int)(sum/ arr.length);
        System.out.println("Средняя сумма трат за месяц составила "+middleSumInDay+" рублей");
    }

    public static void run4(){
        System.out.println("Здача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println("");
    }




}