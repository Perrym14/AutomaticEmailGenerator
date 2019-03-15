import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email: "+ this.firstName + " " + this.lastName);

        //Call method that sets department
        this.department = SetDepartment();
        System.out.println(this.department);

        //Call method that generates email.
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +".company.com";
        System.out.println("Email address: "+email);

        //Call method that returns random password
        this.password = randomPassword(10);
        System.out.println("Password: " + this.password);

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

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void SetMailboxCapacity(int limit){
        this.mailboxCapacity =limit;
    }

    public void SetAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    public void ChangePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

}
