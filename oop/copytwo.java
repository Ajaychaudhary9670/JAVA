package oop;

public class copytwo {
    public static void main(String[] args) {
        Labour s1 = new Labour("ajay chaudhary",27485);
        
        System.out.println(s1.name);
        System.out.println(s1.sallary);
        
        Labour s2 = new Labour(s1);
        System.out.println("copy details of s1 in s2");
        System.out.println(s2.name);
        System.out.println(s2.sallary);
        
    }
}

class Labour {
    String name;
    int sallary;
    


    Labour(String name,int sallary){   /// original
        this.name = name;
        this.sallary = sallary;
        
    }


    Labour( Labour s1){        /// copy constructor  s1 in s2
        this.name = s1.name;
        this.sallary = s1.sallary;
      
    }
}