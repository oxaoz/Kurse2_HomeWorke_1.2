public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return brand + " " + model + ", " +
                year + " год выпуска, сборка в " + country +
                ", " + color + " цвета кузова, объем двигателя - " + engineVolume + " л.";
    }
}
