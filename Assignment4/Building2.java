/* 2. Create a base class Building that stores the number of floors of a building, number of rooms and it’s total footage. Create a derived class House that inherits Building and also stores the number of bedrooms and bathrooms. Demonstrate the working of the classes. */
class Building {
    int floors = 5;
    int rooms = 15;
    int footage = 28;
}

class House extends Building {
    int bedrooms = 2;
    int bathroom = 1;
}

class Office extends Building {
    int no_of_telephones = 3;
    int no_of_tables = 5;
}

public class Building2 {
    public static void main(String[] args) {
        House h = new House();
        System.out.println("Number of Bedrooms is:\t" + h.bedrooms + " and each of:\t" + h.footage + " sqr FT.");
        System.out.println("Number of Bathrooms is:\t" + h.bathroom + " and each of:\t" + h.footage + " sqr FT.");

        Office o = new Office();
        System.out.println("Number of Telephones in Office:\t" + o.no_of_telephones);
        System.out.println("Number of Tables in Office:\t" + o.no_of_tables);
    }
}
