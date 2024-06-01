package Abs;
public abstract class Vehicle {
    private int noOfTires;
    public abstract void makeStartSound();
    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void commute(){
        System.out.println("going ..........");
    }
}
//Abstract method::: abstract method me obj not create but child to create is called abstract class;