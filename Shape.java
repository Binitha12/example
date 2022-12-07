 import java.util.*;
 import java.io.*;
 import java.util.Scanner;
 
 abstract class  Shapes {
     abstract void noofSides();
}

class Triangle extends Shapes{
    void noofSides()
    {
        System.out.println("Traingle  No of sides is 3");
    }

}
class Rectangle extends Shapes{
    void noofSides()
    {
        System.out.println("Rectangle  No of sides is 4");
    }
}
class Hexagon extends Shapes{
    void noofSides(){
        System.out.println("Hexagon No of sides is 6");
    }
}
class Shape{
/**
 * 
 */
public static void main(String args[])
{
    Triangle t=new Triangle();
    Rectangle r =new Rectangle();
    Hexagon h=new Hexagon();

    t.noofSides();
    r.noofSides();
    h.noofSides();




}
}