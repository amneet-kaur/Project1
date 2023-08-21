package aug5;

public class Furniture {

    String typeOfFurniture;
    String color;
    String numberOfLegs;

    String typeOfWood;
    Furniture(){

    }

    Furniture(String typeOfFurniture, String color, String numberOfLegs, String typeOfWood){
        this.typeOfFurniture = typeOfFurniture;
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.typeOfWood = typeOfWood;
    }

    public void displayParent(){
        System.out.println("Type of Furniture : " + typeOfFurniture);
        System.out.println("Color : " + color);
        System.out.println("Number of Legs : " + numberOfLegs);
        System.out.println("Type of Wood : " + typeOfWood);
    }


}
