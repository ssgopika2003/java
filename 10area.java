import java.util.Scanner;
    
    public class 10area{
    
        public static double calculateArea(double length, double width) {
            return length * width;
        }
    
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }
    
        public static double calculateArea(double base, double height,double factor) {
            return factor * base * height;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a shape (1 - Rectangle, 2 - Circle, 3 - Triangle): ");
            int choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.print("Enter length and width of rectangle: ");
                    System.out.println("Area of rectangle: " + calculateArea(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 2:
                    System.out.print("Enter radius of circle: ");
                    System.out.println("Area of circle: " + calculateArea(scanner.nextDouble()));
                    break;
                case 3:
                    System.out.print("Enter base and height of triangle: ");
                    System.out.println("Area of triangle: " + calculateArea(scanner.nextDouble(), scanner.nextDouble(), 0.5));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
