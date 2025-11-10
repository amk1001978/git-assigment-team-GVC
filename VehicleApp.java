class Vehicle {  //This program shows how to use constructor overloading in Java.
String type, colour;
int speed, number_tyres;
boolean canFly, canSwim;


Vehicle(String t, String c, int s, int tyres) {
    type = t;
    colour = c;
    speed = s;
    number_tyres = tyres;
    canFly = false;
    canSwim = false;
    }

// By default, the vehicle cannot fly
Vehicle(String t, String c, int s, int tyres, boolean fly) {
    type = t;
    colour = c;
    speed = s;
    number_tyres = tyres;
    canFly = fly;
    canSwim = false;
    }


Vehicle(String t, String c, int s, int tyres, boolean fly, boolean swim) {
    type = t;
    colour = c;
    speed = s;
    number_tyres = tyres;
    canFly = fly;
    canSwim = swim;
    }

void details() {
    System.out.println("Type: " + type);
    System.out.println("Colour: " + colour);
    System.out.println("Speed: " + speed + " km/h");
    System.out.println("Tyres: " + number_tyres);
    System.out.println("Can Fly: " + canFly);
    System.out.println("Can Swim: " + canSwim);
    System.out.println();
    }
}

public class VehicleApp {
public static void main(String[] args) {
        Vehicle aeroplane = new Vehicle("Airbus", "White", 1000, 6, true);
        Vehicle car = new Vehicle("Toyota", "Black", 200, 4);
        Vehicle motorbike = new Vehicle("Honda", "Black", 300, 2);
        Vehicle truck = new Vehicle("Volvo", "Multi", 120, 6);
        Vehicle boat = new Vehicle("Boat", "White", 60, 0, false, true);

        car.details();
        aeroplane.details();
        boat.details();
    }

}
