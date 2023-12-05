import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Gayatri Mistary");
                break;
            case 2: 
                System.out.println("Vittas Sanjeev");
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Aerospace":
                        System.out.println("Aerospace Department");
                        break;
                
                    default:
                        System.out.println("No Department entered");
                       
                }
                 break;
            default:
                System.out.println("enter correct EmpID");
        }

    }
}
