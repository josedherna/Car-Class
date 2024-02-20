public class Car {
    private String brand;
    private String model;
    private int year;
    Car() {
        this.brand = "None";
        this.model = "None";
        this.year = 0;
    }
    //Parametric Constructor
    Car(String brand) {
        this.brand = brand;
        this.model = "";
        this.year = 0;
    }
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 0;
    }
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    //Copy Constructor
    Car(Car c) {
        this.brand = c.brand;
        this.model = c.model;
        this.year = c.year;
    }
    public void printMe() {
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nYear: " + year +"\n");
    }
    public void setYear(int _year) {
        this.year = _year;
    }

}
