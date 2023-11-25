import java.util.Scanner;

public class Car extends Showroom implements utility {
    private String car_name;
    private String color;
    private String type;
    private String fule;
    private double price;
    private int average;

    @Override
    public void get_details() {
        System.out.println("Car Name: " + car_name);
        System.out.println("Car Color: " + color);
        System.out.println("Car Type: " + type);
        System.out.println("car fule tyle : "+fule);
        System.out.println("Car Price: "+price);
        System.out.println("Average: " + average);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("Car Name: ");
        car_name = sc.nextLine();
        System.out.print("Car Color: ");
        color = sc.nextLine();
        System.out.print("Car Type (Sedan/XUV) : ");
        type = sc.nextLine();
        System.out.print("car fule tyle (Desel/Petrol) : ");
        fule=sc.next();
        System.out.print("Car Price: ");
        price=sc.nextDouble();
        System.out.print("Average: ");
        average = sc.nextInt();
        total_car++;
    }

}
