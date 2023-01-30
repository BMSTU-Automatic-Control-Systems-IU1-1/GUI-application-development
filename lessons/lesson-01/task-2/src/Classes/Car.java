package Classes;

public class Car {
    public static void main(String[] args) {
        CarMain car = new CarMain();
        car.horsePower = 200;
        car.wheels = 4;
        car.color = "blue";

        CarMain[] cars = new CarMain[10];
        cars[0] = new CarMain();
        cars[1] = new CarMain();
    }
    public void printInfoAboutCar(CarMain car){
        System.out.println("" + car.horsePower);
        System.out.println("" + car.wheels);
    }
}
