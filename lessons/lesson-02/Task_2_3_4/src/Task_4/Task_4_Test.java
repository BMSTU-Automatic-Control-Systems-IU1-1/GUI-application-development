package Task_4;

public class Task_4_Test {
    public static void main(String[] args) {
        Singleton The_Earth = Singleton.createObject();
        System.out.println(The_Earth);

        System.out.println(Singleton.createObject());

    }
}
