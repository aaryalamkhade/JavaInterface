
package interfaceshape;
import java.util.*;


//public main class
public class Interfaceshape 
{
public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the comma separated 2 radii 1.For circle enter 0 for second radius :");
    String s=sc.nextLine();
    String[] arrOfStr = s.split(","); 
    double num1,num2;
    num1=Double.parseDouble(arrOfStr[0]);
    num2=Double.parseDouble(arrOfStr[1]);
    
    if((num1==0 && num2==0) || num1==0)
    {
        System.out.print("Wrong Input");
    }
    else if(num2==0)
    {
        Shape cref= new Circle();
        System.out.print("Perimeter of the circle:");
        System.out.println(String.format("%.4f",cref.perimeterCalculation(num1, num2)));
        System.out.print("Area of the circle:");
        System.out.println(String.format("%.4f",cref.areaCalculation(num1, num2)));
    }
    else
    {
        Shape eref=new Ellipse();
        System.out.print("Perimeter of the Ellipse:");
        System.out.println(String.format("%.4f",eref.perimeterCalculation(num1, num2)));
        System.out.print("Area of the Ellipse:");
        System.out.println(String.format("%.4f",eref.areaCalculation(num1, num2)));
    }
 }
}

//interface shape
interface Shape
{
    public double perimeterCalculation(double majorRadius,double minorRadius);
    public double areaCalculation(double majorRadius,double minorRadius);
}

//class circle implements shape
class Circle implements Shape
{
    //override perimeter Calculation
    @Override public double perimeterCalculation(double radius,double abc)
    {
        return 2*Math.PI*radius;
    }
    //@Override area Calculation
    @Override public double areaCalculation(double radius,double abc)
    {
        return Math.PI*(Math.pow(radius,2));
    }
}

//class Ellipse implements Shape
class Ellipse implements Shape
{
     //override perimeter Calculation
    @Override public double perimeterCalculation(double majorRadius,double minorRadius)
    {
        
        return (2 * Math.PI * Math.sqrt((majorRadius * majorRadius + minorRadius * minorRadius) / (2 * 1.0)));
    }
     //@Override area Calculation
    @Override public double areaCalculation(double majorRadius,double minorRadius)
    {
       return Math.PI*majorRadius*minorRadius;
    }
}


/*Output
Enter the comma separated 2 radii 1.For circle enter 0 for second radius :
5,0
Perimeter of the circle:31.4159
Area of the circle:78.5398


Enter the comma separated 2 radii 1.For circle enter 0 for second radius :
5,10
Perimeter of the Ellipse:49.6729
Area of the Ellipse:157.0796


Enter the comma separated 2 radii 1.For circle enter 0 for second radius :
0,0
Wrong Input
*/