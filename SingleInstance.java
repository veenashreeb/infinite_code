Q2-------------------------

Single inheritance

Write a Java program to implement Single Inheritance.

[Note: Strictly adhere to the object oriented specifications given as a part of the problem

statement. Use the same class names and member variable names.

Follow the naming conventions mentioned for getters/setters]

Consider a class named Person with the following private data members.

Data Type     Data Member  

String name

String dateOfBirth

String gender

String mobileNumber

String bloodGroup

Include appropriate getters and setters.

Consider a class named Donor which extends Person class with the following private

data members.

Data Type     Data Member  

String bloodBankName

String donorType

String donationDate

Include appropriate getters and setters.

The class Donor should have the following method

Method Description

public void displayDonationDetails( ) This method displays the donation details. Display the statement ‘Donation Details :’ inside this method Consider another class Main and write the main method to test the above class.

In the main( ) method, read the person and donor details from the user and call the

displayDonationDetails( ) method.

[Note: The date format should be “dd-MM-yyyy”] Input and Output Format:

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.



-- coded part


import javax.crypto.spec.PSource;
import java.awt.*;
import java.util.Scanner;

class Person {
    String name;
    String dateOfBirth;
    String gender;
    String mobileNumber;
    String bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
class Donner extends Person{
    private String bloodBankName;
    private String donorType;
    private String donationDate;

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public void displayDonationDetails( ){
        System.out.println("Donation Details");
        Donner d = new Donner();
        System.out.println("Name : "+getName());
        System.out.println("Date Of Birth : "+getDateOfBirth());
        System.out.println("Gender : "+getGender());
        System.out.println("Mobile Number : "+getMobileNumber());
        System.out.println("Blood Group : "+getBloodGroup());
        System.out.println("Blood Bank Name : "+getBloodBankName());
        System.out.println("Donor Type : "+getDonorType());
        System.out.println("Donation Date : "+getDonationDate());
    }


}
public class SingleInstance {
    public static void main(String[] args) {
        Donner d = new Donner();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name - ");
        String name = sc.next();
        System.out.println("Enter Date Of Birth - ");
        String dob = sc.next();
        System.out.println("Enter Gender - ");
        String gender = sc.next();
        System.out.println("Enter Mobile Number - ");
        String mn = sc.next();
        System.out.println("Enter Blood Group - ");
        String bg = sc.next();
        System.out.println("Enter Blood Bank Name - ");
        String bbn = sc.next();
        System.out.println("Enter Donor Type - ");
        String dt = sc.next();
        System.out.println("Enter Donation Date - ");
        String dod = sc.next();

        d.setName(name);
        d.setDateOfBirth(dob);
        d.setGender(gender);
        d.setMobileNumber(mn);
        d.setBloodGroup(bg);
        d.setBloodBankName(bbn);
        d.setDonorType(dt);
        d.setDonationDate(dod);
        d.displayDonationDetails();
    }
}

