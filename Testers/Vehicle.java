class Vehicle { //This is the parent or super class
    int maxSpeed;
    Vehicle(){
        System.out.println("Vehicle constructor called!");
    }

    Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed; // This is the constructor of the parent class
        System.out.println("Vehicle constructor with maxSpeed called!");
    }

    public void vroom(){
        System.out.println("Vroom Vroom from Vehicle!");
    }

}

class Car extends Vehicle{
    int maxSpeed = 100;

    Car(){
        super(); // This calls the constructor of the parent class Vehicle, needs to be first
        System.out.println("Car constructor called!");
    }   

    public void displayMaxSpeed() {
        System.out.println("Max speed of car: " + super.maxSpeed + " km/h"); //Super is a keyword that refers to the parent class
    }

    public void vroom(){
        System.out.println("Vroom Vroom from Car!");
        super.vroom();
    }

}

