package function;

public class Function1 {
    public static void main(String[] args){
        int z = square(5);
        System.out.println(z);
    }

    public static int square(int x){
        int y = x * x;
        return y;
    }
}
