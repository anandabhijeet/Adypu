package polymorphism;

public class MethodOverriding extends MethodOverloading{
    int add(){
        int a = 5; int b = 56;
        System.out.println("sum of a and b : "+ (a+ b));
        return 0;
    }

    public static void main(String[] args) {
        MethodOverriding overrdng = new MethodOverriding();
        overrdng.add();
    }

}
