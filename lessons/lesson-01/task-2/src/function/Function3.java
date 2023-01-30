package function;

public class Function3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            arr[i] = i + 1;
        }
        printIntArr(arr);
    }
    private static void printIntArr(int[] arr){
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
