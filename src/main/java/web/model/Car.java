package web.model;

import java.util.Objects;

public class Car {

    String model;
    int series;
    long price;

    public Car() {
    }

    public Car(String model, int series, long price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(car.model , model)
                && Objects.equals(car.series, series)
                && Objects.equals(car.price, price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, price);
    }
}
