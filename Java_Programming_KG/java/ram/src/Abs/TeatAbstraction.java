package Abs;

public class TeatAbstraction {
    public static void main(String[] args) {
//        Vehicle veh = new Vehicle(2);
        Car car  = new Car();
        car.commute();
        car.makeStartSound();//Abstract method
    }
}
