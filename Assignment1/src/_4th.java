// Name - Arju Mondal, Roll no- 39
// 4.	Write a java Program to find the area and Perimeter of a rectangle.
import java.util.Scanner;
public class _4th{
    public static void main(String args[])
    {
        System.out.println("Name - Arju Mondal, Roll no- 39");
        int w,l,area,perimeter;
        Scanner dc = new Scanner(System.in);
        System.out.print("Enter the width of rectange--");
        w = dc.nextInt();
        System.out.print("Enter the length of rectange--");
        l = dc.nextInt();
        area = area(w,l);
        perimeter = perimeter(w,l);
        System.out.println("Area of the rectangle is "+area);
        System.out.println("Perimeter of the rectangle is "+perimeter);
    }
    public static int area(int x,int y)
    {
        int area = x*y;
        return area;
    }
    public static int perimeter(int x,int y)
    {
        int perimeter = 2*(x+y);
        return perimeter;
    }
}