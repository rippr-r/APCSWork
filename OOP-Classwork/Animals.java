public class Animals{
    private String animal_species;
    private String animal_color;
    private int animal_legs;

    public Animals(String species, String color, int legs){
        animal_species = species;
        animal_color = color;
        animal_legs = legs;
    }

    public Animals(){
        animal_species = "None";
        animal_color = "None";
        animal_legs = 0;
    }

    public void display(){
        System.out.println("Species: " + animal_species);
        System.out.println("Color: " + animal_color);
        System.out.println("Legs: " + animal_legs);
    }
}
