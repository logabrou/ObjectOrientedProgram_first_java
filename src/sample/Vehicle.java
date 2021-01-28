package sample;


public class Vehicle {

    //    Fields
    private String name;
    private int mileage;
    private boolean isFunctional;


    //  First empty constructor
    public Vehicle () {

    }

    //  Main constructor for the Vehicle class
    public Vehicle(String name, int mileage, boolean isFunctional) {
        this.name = name;
        this.mileage = mileage;
        this.isFunctional = isFunctional;

    }


    //  Get methods for fields
    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    public boolean getIsFunctional() {
        return isFunctional;
    }


    //  Set new methods values for the associated fields
    public String setName(String newName){
        this.name = newName;
        return this.name;
    }

//     Set methods, but I changed the names to be more interactive
    public int Drive(int mileage){
        this.mileage += mileage;
        return this.mileage;
    }

    public boolean workOnVehicle(boolean isFunctional){
        this.isFunctional = isFunctional;
        return this.isFunctional;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", isFunctional=" + isFunctional +
                '}';
    }

    public static void main(String[] args) {

        Vehicle myCar = new Vehicle("Jeep", 1000, false);
        System.out.println("Here are my car stats.");
        System.out.println(myCar.getName());
        System.out.println(myCar.getMileage());
        System.out.println(myCar.getIsFunctional());
        System.out.println(myCar.toString());

        System.out.println("\nFix and drive.");
        System.out.println(myCar.workOnVehicle(true));
        System.out.println(myCar.Drive(500));
        System.out.println(myCar.toString());



    }



}
