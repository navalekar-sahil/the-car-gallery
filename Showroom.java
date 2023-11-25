import java.util.*;

public class Showroom implements utility {

    private String showroomm_name;
    private String address;
    private int totla_employee_in_showroom;
    public int total_car;
    //private String manager_name;

    public void get_details() {
        System.out.println("Showroom Name: " + showroomm_name);
        System.out.println("Showroom Address: " + address);
        System.out.println("Total employee in showroom: " + totla_employee_in_showroom);
        System.out.println("total car in showroom:" + total_car);
       // System.out.println("Manager Name: " + manager_name);
        System.out.println();
    }

    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.print("Showroom Name: ");
        showroomm_name = sc.nextLine();
        System.out.print("Showroom Address: ");
        address = sc.nextLine();
        System.out.print("Total employee in showroom: ");
        totla_employee_in_showroom = sc.nextInt();
        System.out.print("total car in showroom:");
        total_car = sc.nextInt();
        //System.out.print("Manager Name: ");
        //manager_name = sc.nextLine();
        System.out.println();
    }
}
