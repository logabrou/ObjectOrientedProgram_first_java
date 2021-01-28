package sample;

public class Pet {


    //    Fields
    private String name;
    private int age;
    private String location;
    private String type;

    //  First empty constructor
    public Pet (){

    }

    //  Main constructor for the Pet class
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }


    //  Get methods for fields
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getType() {
        return this.type;
    }

    public String getLocation() {
        return this.location;
    }



    //  Set new methods values for the associated fields
    public String setName(String newName){
        this.name = newName;
        return this.name;
    }

    public String setNewLocation(String newLocation){
        this.location = newLocation;
        return this.location;
    }

    public int setPlusYear(){
        this.age++;
        return this.age;
    }

    public static void main(String[] args) {
        Pet horse = new Pet("Charger", 4, "Austin", "horse");
        System.out.println("");
        System.out.println(horse.getAge());
        System.out.println(horse.getName());
        System.out.println(horse.getType());
        System.out.println(horse.getLocation());


        System.out.println("\nUse set methods.");
        System.out.println(horse.setName("Sandy"));
        System.out.println(horse.setNewLocation("Chicago"));
        System.out.println(horse.setPlusYear());
        System.out.println(horse.setPlusYear());



    }



}
