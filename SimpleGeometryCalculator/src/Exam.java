public class test {
    static class Vehicle {
        public void start() {
            System.out.println("Vehicle");
            class Car extends Vehicle {
                public void start() {
                }
            }
            System.out.println("Car");
            class ElectricCar extends Car {
            }
            public static void main (String[]args){
                Car car = new ElectricCar();
                car.start();
            }
        }
    }
}