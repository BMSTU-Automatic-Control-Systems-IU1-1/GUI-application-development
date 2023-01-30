package Classes;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(15, 170, Sex.Female);
        humanInfo(human);
        human.age = 20;
        human.height = 166;
        human.sex = Sex.Male;
        humanInfo(human);
    }

    private static void humanInfo(Human human){
        System.out.println("age = " + human.age);
        System.out.println("height = " + human.height);
        System.out.println("sex = " + human.sex);
    }

}
