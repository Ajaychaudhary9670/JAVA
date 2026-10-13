package oop;

public class createClass {
    public static void main(String[] args) {
      Pen p1 = new Pen();      ////create a pen object call p1
      p1.setColor("blue");
    //   p1.color = "yellow";       //ye bhi ek method hai argument pass karne ka
      System.out.println(p1.color);
      System.out.println(p1.color);
    }

}

class Pen {
    String color;      ///properties
    
    int tip;

    void setColor(String newColor) { /// function
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}