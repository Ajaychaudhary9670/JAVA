package oop;

public interface inheritance {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.breath();
        Shark.Swim();
       

        
    }
    
}

//// base classs or parent class
class Animal{
    String color ;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }

}


// Derived class or child class

class Fish extends Animal{
    int fins;

    void Swim (){
        System.out.println("swim in water");
    }

}


// ye single level inheritance hai
