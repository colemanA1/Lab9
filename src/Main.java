import java.util.*;
public class Main {
static Scanner scan = new Scanner(System.in);

public static ArrayList<Car> getUserInfo(int numCars) {
    ArrayList<Car> carList = new ArrayList<>();

    for (int i = 0; i < numCars; i++) {
        String getUserMake = Validator.getString(scan, "Enter Make For Car Num" + (i + 1) +": ");
        String getUserModel = Validator.getString(scan, "Enter Model For Car Num" + (i + 1) +": ");
        scan.nextLine();
        int getUserYear = Validator.getInt(scan,"Enter Year For Car Num " + (i + 1) + ": ", 1910, 2018);
        scan.nextLine();
        double getUserPrice = Validator.getInt(scan,"Enter Price For Car Num " + (i + 1) + ": ");
        scan.nextLine();
        //this is a constructor
        //Car carHolder = new Car(getUserMake, getUserModel, getUserYear, getUserPrice);
        carList.add(new Car(getUserMake, getUserModel, getUserYear, getUserPrice));

    }
    return carList;
}

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE GRAND CIRCUS MOTORS ADMIN CONSOLE");
        System.out.println("How many cars do you want to enter?: ");
        int numCars = scan.nextInt();
        scan.nextLine();

        ArrayList<Car> carList = getUserInfo(numCars);
        System.out.println("Car Inventory: ");
        for (Car c: carList) {
            System.out.println(c.toString());
            System.out.println();
        }





    }
}


/**carList.add(new Car("Ford", "Explorer", 1999, 2000));

 carList.get(0).setMake("Fiat");
 carList.get(0).setModel("Abernath");
 carList.get(0).setYear(2015);
 carList.get(0).setPrice(30000);
 /**for (Car C: carList){
 System.out.println(C);
 }**/
/**Car car1 = new Car("Ford", "Interceptor", 2016, 2000.00);
 Car car2 = new Car("Chevy","Tahoe", 2016, 50000.00);
 //This .toString will only print the object and where it is in memory.
 System.out.println(car1.toString());
 System.out.println(car2.toString());

 //Reason we use the .toString is so we don't have to do the following.
 //System.out.println(car1.getMake() + car1.getModel() + car1.getYear() + car1.getPrice());**/