package Inheritance;

public class A {
    String Name;
    int Age;

    A(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    void show(){
        System.out.println("My Name is " +Name+"\n"+
                "And my age is "+Age );
    }


}
