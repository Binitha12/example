import java.util.Scanner;
import java.lang.*;

public class frequency {
    

    
    public static void main(String args[]){
    
        String str;
        int i;int count=1;

    
    
     
    Scanner sc=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    System.out.println("Enter the character");
    char ch=s.next().charAt(0);
    int strlen=str.length();
    for( i=0;i<strlen;i++)
    {
        char c=str.charAt(i);
   if(c==ch)
   {
   count++;
        }
    }
    
       


        System.out.println("Frequency of "+ ch+" is");
        System.out.println(--count);







    }
}




