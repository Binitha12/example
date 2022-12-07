import java.util.Scanner;
import java.util.StringTokenizer;


public class Tokenizer {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the limit");
    int n=sc.nextInt();
    System.out.println("Enter the numbers");
    String numlist=s.nextLine();
    StringTokenizer st=new StringTokenizer(numlist);
    int sum=0;

    while(st.hasMoreTokens())
    {
        sum=sum +Integer.parseInt(st.nextToken());
    }
    System.out.println("SUM"+ sum);

    }







}    

