import java.util.Scanner;

class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        System.out.println("With this program, you will calculate the area of a rectangle.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + area);
    }
}

public class Task1 {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();

        rectangle.getData();
        rectangle.computeField();
        rectangle.fieldDisplay();
    }
}