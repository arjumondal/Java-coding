// Name - Arju Mondal, Roll no- 39
/* 1. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it. The class ThreeDObject has methods wholeSurfaceArea( ) and volume( ). Override these two methods in each of the derived classes to calculate the volume and whole surface area of each type of three-dimensional object. The dimensions of the objects are to be taken from the users and passed through the respective constructors of each derived class. Write a main method to test these classes. */
import java.util.Scanner;

class ThreeDObject{
    Scanner scan = new Scanner(System.in);

    void wholeSurfaceArea(){}
    void volume(){}
}

class Box extends ThreeDObject{
    float length, width, height;

    public Box() {
        System.out.println("Name - Arju Mondal, Roll no- 39");
        System.out.println("Enter The Length:\t");
        this.length = scan.nextFloat();
        System.out.println("Enter The Width:\t");
        this.width = scan.nextFloat();
        System.out.println("Enter The Height:\t");
        this.height = scan.nextFloat();
    }

    @Override
    void wholeSurfaceArea() {
        System.out.println(
                "Whole Surface Area of Box is:\t" +
                        (2 * ((length * width) + (width * height) + (height * length)))
        );
    }

    @Override
    void volume() {
        System.out.println(
                "Volume of Box is:\t" +
                        (length * width * height)
        );
    }
}


class Cube extends ThreeDObject {
    float length;

    public Cube() {
        System.out.println("Enter Length of any one Side:\t");
        this.length = scan.nextFloat();
    }

    @Override
    void wholeSurfaceArea() {
        System.out.println(
                "Whole Surface Area of Cube is:\t" +
                        (6 * length * length)
        );
    }

    @Override
    void volume() {
        System.out.println(
                "Volume of Cube is:\t" +
                        Math.pow(length, 3)
        );

    }
}


class Cylinder extends ThreeDObject{
    float radius, height;

    public Cylinder() {
        System.out.print("Enter The Radius:\t");
        this.radius = scan.nextFloat();
        System.out.print("Enter The Height:\t");
        this.height = scan.nextFloat();
    }

    @Override
    void wholeSurfaceArea() {
        System.out.println(
                "Whole Surface Area of Cylinder is:\t" +
                        (2 * Math.PI * radius * (radius + height))
        );
    }

    @Override
    void volume() {
        System.out.println(
                "Volume of Cylinder is:\t" +
                        (Math.PI * radius * radius * height)
        );
    }
}

class Cone extends ThreeDObject {
    float height, slant_height, radius;

    public Cone() {
        System.out.print("Enter The Height of Cone:\t");
        this.height = scan.nextFloat();
        System.out.print("Enter The Slant Height of Cone:\t");
        this.slant_height = scan.nextFloat();
        System.out.print("Enter The Radius of Circular Base:\t");
        this.radius = scan.nextFloat();
    }

    @Override
    void wholeSurfaceArea() {
        System.out.println(
                "Whole Surface Area of Cone is:\t" +
                        (Math.PI * radius * (slant_height + radius))
        );
    }

    @Override
    void volume() {
        System.out.println(
                "Volume of Cone is:\t" +
                        ((Math.PI * radius * radius * height) / 3)
        );
    }
}

public class AreaVolume {
    public static void main(String[] args) {
        Box bx = new Box();
        bx.wholeSurfaceArea();
        bx.volume();

        Cube cu = new Cube();
        cu.wholeSurfaceArea();
        cu.volume();

        Cylinder cy = new Cylinder();
        cy.wholeSurfaceArea();
        cy.volume();

        Cone co = new Cone();
        co.wholeSurfaceArea();
        co.volume();
    }
}
