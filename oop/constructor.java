package oop;

public class constructor {
    public static void main(String[] args) {

        Student s1 = new Student("ajay chaudhary"); // naya student object bna rhe hai constructor ke help se
        System.out.println(s1.name);
        Student s2 = new Student(2400433);    /// esi ko hi constructor calling bhi bolte hai
        System.out.println(s2.roll);
        Student s3 = new Student();
    }
}

class Student { // ye class hai aur class ke ander properties hai aur constructor hai
    String name; // ye properties hai
    int roll;

    Student(String name) { // ye constructor hai
        this.name = name;
       
    }
    Student (int roll){
        this.roll = roll;
    }


    Student(){
        System.out.println("this is constructor without argument pass..");
    }

}


// ek constructor ko ek hi baar call ho sakta hai
//  esss liye do constructor bnay agya hai