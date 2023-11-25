import java.util.Scanner;
import java.util.UUID;

public class Employee extends Car implements utility {
    private String emp_id;
    private String emp_name;
    private int emp_age;
    private String emp_department;
    private String showroom_name;

    int count=1;
    @Override
    public void get_details() {
        System.out.println("Employee Id: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Age: " + emp_age);
        System.out.println("Employee Department: " + emp_department);
        System.out.println("Showroom Name: " + showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
//        emp_id=count+=1;
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
    }
}
