public class Student {
    private String name;
    private double gpa;
    private int age;

    public Student(){
        name = "John Doe";
        gpa = 0.0;
        age = 0;
    }

    public Student(String n, double g, int a){
        name = n;
        gpa = g;
        age = a;
    }

    //Getters and Setters

    public String get_name(){
        return name;
    }

    public double get_gpa(){
        return gpa;
    }

    public int get_age(){
        return age;
    }

    public void set_name(String n){
        name = n;
    }

    public void set_gpa(double g){
        gpa = g;
    }

    public void set_age(int a){
        age = a;
    }


    //Methods

    public void raise_hand(){
        System.out.println(name + " raised their hand.");
    }

}
