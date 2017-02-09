public class UsedCar extends Car {
    private int Mileage;

    public void getMileage(int mileage) {
        Mileage = mileage;
    }

    public int getMileage() {

        return Mileage;
    }

    @Override
    public String toString() {
        return  make +  model +  year +  price +  Mileage;
    }

    public UsedCar(String make, String model, int year, double price, int Mileage) {
        {   this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
            this.Mileage = Mileage;
        }
    }
}
