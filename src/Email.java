import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email: "+ this.firstName + " " + this.lastName);

        this.department = SetDepartment();
        System.out.println(this.department);
    }

    private String SetDepartment(){
        System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {return "sales";}
        else if(depChoice == 2) {return "development";}
        else if(depChoice == 3) {return "accounting";}
        else {return "";}

    }

}
