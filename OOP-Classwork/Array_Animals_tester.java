public class Array_Animals_tester{
    public static void main(String[] args){
        Animals[] animal = new Animals[3];
        animal[0] = new Animals("Dog", "Brown", 4);
        animal[1] = new Animals("Cat", "White", 4);
        animal[2] = new Animals("Bird", "Blue", 2);
        
        for(Animals i : animal){
            i.display();
            System.out.println();
        }
    }
}
