/* 5. Create a base class called “vehicle” that stores number of wheels and speed. Create the following derived classes –
“car” that inherits “vehicle” and also stores number of passengers.
“truck” that inherits “vehicle” and also stores the load limit.
Write a main function to create objects of these two derived classes and display all the information about “car” and “truck”. Also compare the speed of these two vehicles - car and truck and display which one is faster. */
class Vehicle {
    int wheels;
    float speed;
}

class Car extends Vehicle {
    int passengers;

    Car(int wheels, float speed, int passengers) {
        super.wheels = wheels;
        super.speed = speed;
        this.passengers = passengers;
    }

    void display(){
        System.out.println("Number of Wheels is:\t" + super.wheels);
        System.out.println("Speed of Car is:\t" + super.speed);
        System.out.println("Number of Passengers is:\t" + this.passengers);
    }
}

class Truck extends Vehicle {
    int load_limit;

    Truck(int wheels, float speed, int load_limit){
        super.wheels = wheels;
        super.speed = speed;
        this.load_limit = load_limit;
    }

    void display(){
        System.out.println("Number of Wheels is:\t" + super.wheels);
        System.out.println("Speed of Truck is:\t" + super.speed);
        System.out.println("maximum Load Limit is:\t" + this.load_limit);
    }
}

 class VehicleInfo {
    public static void main(String[] args) {
        Car c = new Car(4, 100, 6);
        Truck t = new Truck(12, 130, 200);
        c.display();
        t.display();

        if (c.speed > t.speed)
            System.out.println("Car is Faster.");
        else
            System.out.println("Truck is Faster.");
    }
}
