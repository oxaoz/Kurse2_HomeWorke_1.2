public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    String zero = "«Информация не указана»";

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;

        if(brand == null || brand.isEmpty()){
            this.brand = zero;
        }else this.brand = brand;

        if (model == null || model.isEmpty()) {
            this.model = zero;
        }else this.model = model;

        if (country == null || country.isEmpty()) {
            this.country = zero;
        }else this.country = country;

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }else this.engineVolume = engineVolume;

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        }else this.color = color;

        if (year <= 0) {
            this.year = 2000;
        }else this.year = year;
    }
        @Override
    public String toString() {
        return brand + " " + model + ", " +
                year + " год выпуска, сборка в " + country +
                ", " + color + " цвета кузова, объем двигателя - " + engineVolume + " л.";
    }
}
/*Дополните созданные ранее конструкторы проверками:

Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default.
Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
Если год производства ≤0, то значение по умолчанию — 2000.
В случае если какая-либо информация не указана по объекту,
программа должна выводить в консоль информацию о каждом автомобиле и все указанные выше характеристики,
подставляя вместо отсутствующей информации значение по умолчанию.
 */