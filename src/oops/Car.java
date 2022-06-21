package oops;

public class Car extends Vehicle {


    public int gears;

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public static void main(String[] args) {
        Car bc = new Car();
        bc.setWheels(4);
        System.out.println("Wheels of car:" + bc.getWheels());

        bc.setEngine("BS-IV");
        System.out.println("Engine Type: " + bc.getEngine());

        bc.setGears(6);
        System.out.println("Gears: " + bc.getGears());

    }


}
