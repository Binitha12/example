import java.util.Scanner;
import java.io.*;


  class Employee {
    String Name;
    int Age;
    int Phno;
    String Address;
    int Salary;
    void Printsalary()
    {
    System.out.println(Salary);

    }
}
class Officer extends Employee{
    String  specialization;
}
class Manager extends Employee{
    String department;

}

public class Employees{
    public static void main(String args[]){

    Officer obj1=new Officer();       //Creating object for Officer

    Scanner sc=new Scanner(System.in);   //Taking Inputs
    Scanner s =new Scanner(System.in);
    
    System.out.println("Officer Details");
    System.out.println("Enter the name");
    obj1.Name=sc.nextLine();
    System.out.println("Enter age");
    obj1.Age=s.nextInt();
    System.out.println("Enter phno");
    obj1.Phno=s.nextInt();
    System.out.println("Enter Address");
    obj1.Address=sc.nextLine();
    System.out.println("Enter salary");
    obj1.Salary=s.nextInt();
    System.out.println("Enter specialization");
    obj1.specialization=sc.nextLine();

   System.out.println("  Officer");
    System.out.println("Name: "+obj1.Name);
    
    System.out.println("Age: "+obj1.Age);
    
    System.out.println("Phno: "+obj1.Phno);
    
    System.out.println("Address: "+obj1.Address);
    
    System.out.println("Salary : "+obj1.Salary);
    
    System.out.println("Specialization: "+obj1.specialization);




   Manager obj2=new Manager();


System.out.println("Manager Details");
   System.out.println("Enter the name");
    obj2.Name=sc.nextLine();
    System.out.println("Enter age");
    obj2.Age=s.nextInt();
    System.out.println("Enter phno");
    obj2.Phno=s.nextInt();
    System.out.println("Enter Address");
    obj2.Address=sc.nextLine();
    System.out.println("Enter salary");
    obj2.Salary=s.nextInt();
    System.out.println("Enter Department");
    obj2.department=sc.nextLine();

    System.out.println("Manager Details");

    System.out.println("Name: "+obj2.Name);
    
    System.out.println("Age: "+obj2.Age);
    
    System.out.println("Phno: "+obj2.Phno);
    
    System.out.println("Address: "+obj2.Address);
    
    System.out.println("Salary: "+obj2.Salary);
    
    System.out.println("Specialization:  "+obj2.department);

}
}