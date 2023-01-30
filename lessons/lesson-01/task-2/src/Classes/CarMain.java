package Classes;

public class CarMain {
    String color;
    int wheels;
    int horsePower;

    public CarMain(){
        horsePower = 10;
        wheels = 10;
        color = "yellow";
    }

    public CarMain(String color, int wheels, int horsePower){
        this.color = color;
        this.wheels = wheels;
        this.horsePower = horsePower;
    }
}
