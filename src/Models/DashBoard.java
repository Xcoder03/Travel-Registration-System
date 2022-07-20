package Models;

import Services.BusRegistration;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DashBoard implements BusRegistration {
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
        System.out.println("Welcome to Mikes Transport Limited bus booking.  ");
        System.out.println("/////////////////////");
        System.out.println("Enter name ");
        System.out.println("Enter destination");
        System.out.println("Enter number of people");// this is for each person that your travelling with in the bus
        // then their name will be entered and the system will have to check to if they exists if they dont they will have register them

    }
    public  static void addCustomers(SignUp sup){
        registeredCustomers.add(sup);
    }
    public static   void addFirstCustomers(SignUp sp){
        customers.add(sp);

    }
}
