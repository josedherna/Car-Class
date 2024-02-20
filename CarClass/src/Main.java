//Jose Hernandez
public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Toyota", "Camry",2020);
        System.out.println("Car 1:");
        car1.printMe();
        System.out.println("Car 2:");
        Car car2 = new Car(car1);
        car2.printMe();
        System.out.println("Car 3:");
        Car car3 = new Car("Honda","Civic",2010);
        car3.printMe();
        System.out.println("Car 4:");
        Car car4 = new Car();
        car4.printMe();
        car4 = car1;
        System.out.println("Car 4 (Shallow copy from Car 1):");
        car4.printMe();
        car4.setYear(2012);
        System.out.println("Car 4 (Shallow copy from Car 1):");
        car4.printMe();
        System.out.println("Car 1 (Shallow Copy Flaw: Changing the year in car4 also changed the year in car1):");
        car1.printMe();
    }
}
