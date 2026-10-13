package oop;

public class copy {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "ajay chaudhary";
        s1.roll = 232454;
        s1.password = "abcd";
        Students s2 = new Students(s1);
        s2.password = "xyz";
       System.out.println("s1 ka naam::"+ s1.name);
       System.out.println("s1 ka roll::"+ s1.roll);
       System.out.println("s1 ka password::"+ s1.password);
       System.out.println("s2 ka naam::"+ s2.name);
       System.out.println("s2 ka roll::"+ s2.roll);
       System.out.println("s2 ka password::"+ s2.password);

    }

}

class Students {
    String name;
    int roll;
    String password;

    Students(Students s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Students() {
        System.out.println("ajy chaudahry");

    }

    // Students(int roll) {
    //     this.roll = roll;
    // }
}
