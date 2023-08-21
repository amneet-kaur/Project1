package aug5;

public class Chair extends Furniture{
    private String name;
    private String weight;
    private String numberOfSeats;
    private String typeOfFabric;

    Chair(){

    }


    Chair(String typeOfFurniture, String color, String numberOfLegs, String typeOfWood, String name, String weight, String numberOfSeats, String typeOfFabric){
        super(typeOfFurniture, color, numberOfLegs, typeOfWood);
        this.name = name;
        this.weight = weight;
        this.numberOfSeats = numberOfSeats;
        this.typeOfFabric = typeOfFabric;
    }

    public void displayChild(){
        System.out.println("Name of Chair : " + name);
        System.out.println("Weight of Chair : " + weight);
        System.out.println("Number of Seats : " + numberOfSeats);
        System.out.println("Name of Type of Fabric : " + typeOfFabric);
    }

}
