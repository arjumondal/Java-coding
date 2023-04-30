/* Create a base class Distance which stores the distance between two locations in miles and a method travelTime(). The method prints the time taken to cover the distance when the speed is 60 miles per hour. Now in a derived class DistanceMKS, override travelTime() so that it
prints the time assuming the distance is in kilometers and the speed is 100 km per second. Demonstrate the working of the classes. */
import java.lang.reflect.Array;

class Distance {
    float distance;

    public void setDistance(float distance) {
        this.distance = distance;
    }

    float travelTime(){
        return (distance/60);
    }
}


class DistanceMKS extends Distance{
    public DistanceMKS(float value){
        super.setDistance(value);
    }

    @Override
    float travelTime() {
        /*
            1 sec ---- 100 km
           60 sec ---- 6000 km
            1 min ---- 6000 km
           60 min ---- 6000 x 60 km
                     = 360000 km/h
         */
        return (distance / 36000);
    }
}

public class DistanceConverter {
    public static void main(String[] args) {
        Distance d = new Distance();
        d.setDistance(120);
        DistanceMKS ds = new DistanceMKS(120);
        System.out.println(d.travelTime() + " Hours");
        System.out.println(ds.travelTime() + " Hours");

    }
}


