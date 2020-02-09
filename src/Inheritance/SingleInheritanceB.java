package Inheritance;

import org.w3c.dom.ls.LSOutput;

public class SingleInheritanceB extends A {
    String city;


    SingleInheritanceB(String Name, int Age, String city) {
        super(Name, Age);
        this.city = city;
    }
    void showB(){
        System.out.println("i live in city "+city);
    }
}
