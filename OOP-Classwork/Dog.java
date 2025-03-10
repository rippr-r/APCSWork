public class Dog {
    private String name;
    private int age;
    private boolean good_dog;

    public Dog(String dog_name, int dog_age, boolean is_good_dog) {
        name = dog_name;
        age = dog_age;
        good_dog = is_good_dog;
    }

    public String to_string(){
        return name + " " + age + ". Is " + name + " a good dog? " + good_dog;
    }

    public String get_name(){
        return name;
    }

    public int get_age(){
        return age;
    }

    public boolean get_good_dog(){
        return good_dog;
    }


    
    //Internal Testing
    /*public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", 3, true);
        Dog dog2 = new Dog("Rex", 5, false);

        System.out.println(dog1.to_string()+ ".");
        System.out.println(dog2.to_string()+ ".");

        Dog dog3 = new Dog("Spot", 2, true);

        System.out.println(dog3.get_name()+ " is " + dog3.get_age() + " years old.");


    }*/ 
    
}
