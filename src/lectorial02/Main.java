package lectorial02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Vehicle() {
            public void startEngine() {
                System.out.println("Anonymous car's engine is revving.");
            };
        });

        for(Vehicle vehicle: vehicles) {
            vehicle.startEngine();
        }
    }
}

