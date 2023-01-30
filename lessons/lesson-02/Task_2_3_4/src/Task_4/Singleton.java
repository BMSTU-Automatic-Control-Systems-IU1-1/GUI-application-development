package Task_4;

public class Singleton {

   private static Singleton Earth;

   private Singleton(){};

   public static Singleton createObject(){
       if (Earth == null){
           Earth = new Singleton();
       }
       return Earth;
   }


}
