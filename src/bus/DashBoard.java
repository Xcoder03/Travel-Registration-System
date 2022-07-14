package bus;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DashBoard implements  BusRegistration {
     static  ArrayList<SignUp>  registeredCustomers = new ArrayList<>();
    static PriorityQueue<SignUp> customers = new PriorityQueue<>();
    @Override
    public void signUp(SignUp signup) {
         Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your  First Name");
        String name = input.nextLine();
        signup.setFirstname(name);
        System.out.println("Please Enter your Last Name");
        String lastname = input.nextLine();
        signup.setLastname(lastname);
        System.out.println("Please Enter your sex");
        String sex = input.nextLine();
        signup.setSex(sex);
        System.out.println("Please Enter your email");
        String email = input.nextLine();
        signup.setEmail(email);
        System.out.println("Please enter your correct phone number");
        String phoneno = input.nextLine();
        signup.setPhoneNo(phoneno);
        System.out.println("Thank you for succesfully registering with Mikes Transport limited");
        addFirstCustomers(signup);
        addCustomers(signup);


    }

    @Override
    public void busBooking() {

    }
    public  static void addCustomers(SignUp sup){
        registeredCustomers.add(sup);
    }
    public static   void addFirstCustomers(SignUp sp){
        customers.add(sp);

    }
}
