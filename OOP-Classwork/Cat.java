public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void meow(){
        System.out.println("Meow");
    }

    private void heyThisIsPrivate(){
        System.out.println("How did you call this?");
    }

    private static void thisIsPrivateAndStatic(){
        System.out.println("Hey Im Private and Static!");
    }

    public static void thisIsPublicAndStatic(){
        System.out.println("Hey Im Public and Static!");
    }
}
