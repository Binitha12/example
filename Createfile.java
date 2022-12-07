import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class Createfile{
    /**
     
     */
    public static void main(String args[]){

try{

    File myfile=new File("newfile.txt");

    if(myfile.createNewFile())
    {
        System.out.println("File is created: "+myfile.getName());

    }
    else 
    {
        System.out.println("File Already exists");
    }
    }
    catch(IOException e)

    {System.out.println("An error occured");
    e.printStackTrace();

    }



    try{
        FileWriter  mywrite=new FileWriter("newfile.txt");
        mywrite.write("Java is powerful");
        mywrite.close();
        System.out.println("Successfully wrote to this file");
    }
    catch(IOException e)
    {
        System.out.println("An error occurred");
        e.printStackTrace();
    }



try{

    File myread=new File("newfile.txt");
    Scanner reader=new Scanner(myread);
    while(reader.hasNextLine())
    {
        String data=reader.nextLine();
        System.out.println(data);
    }

    reader.close();
    }

catch(FileNotFoundException e)
{
    System.out.println("An error occured");
    e.printStackTrace();
}

    }
    }

