import java.util.Scanner;

class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model: ");
        this.model = scanner.nextLine();

        System.out.print("Enter brand: ");
        this.brand = scanner.nextLine();

        System.out.print("Enter year: ");
        this.year = scanner.nextInt();

        System.out.print("Enter price: ");
        this.price = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter color: ");
        this.color = scanner.nextLine();

        System.out.print("Enter quantity: ");
        this.quantity = scanner.nextInt();
    }

    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
    public int getQuantity() {
        return quantity;
    }


    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void delivery(int amount) {
        quantity += amount;
    }

    public void sell() {
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("No cars left to sell.");
        }
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", brand='" + brand + '\'' + ", year=" + year + ", price=" + price + ", color='" + color + '\'' + ", quantity=" + quantity + '}';
    }
}


public class Task2 {
        public static void main(String[] args) {
            Car car = new Car();

            System.out.println(car.toString());

            car.sell();

            System.out.println("After selling one car:");
            System.out.println("Model: " + car.getModel());
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Year: " + car.getYear());
            System.out.println("Price: " + car.getPrice());
            System.out.println("Color: " + car.getColor());
            System.out.println("Quantity: " + car.getQuantity());

            car.setColor("Blue");
            car.setPrice(890);
            System.out.println("After changes:");
            System.out.println(car.toString());
        }
    }
