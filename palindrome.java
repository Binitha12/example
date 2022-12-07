import java.util.*;
import java.lang.*;

public class palindrome{

    public static void main(String args[])
    {
    String str,rstr="";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    String lwrstr=str.toLowerCase();
    int strlen=str.length();
    System.out.println(strlen);
    for(int i=strlen-1;i>=0;i--)
    {
    rstr=rstr+lwrstr.charAt(i);
    }
    
    if(lwrstr.equals(rstr))
    {
        System.out.println("The string is Pallindrome");
    }
    else
    System.out.println("The string is not pallindrome");

}
}


    

