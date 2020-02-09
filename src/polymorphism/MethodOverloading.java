package polymorphism;

public class MethodOverloading {
MethodOverloading(){
    System.out.println("default constructor is being called");
}
MethodOverloading(int a){

}

int add(int a , int b){
    return (a + b);
}

String add(String a, String b){
    return (a + b);
}

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println("Sum of a n b: "+ mo.add(5, 6));
        System.out.println("sum of strings: "+ mo.add("Java", " Training"));
    }

}
