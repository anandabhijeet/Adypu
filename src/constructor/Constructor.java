package constructor;

public class Constructor {
    int a; int b;

    Constructor(int a, int b){
        this.a = a;
        this.b = b;
    }

    void sum(){
        System.out.println(" sum of a nd b is "+ (a+b));
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(5, 6);
        c.sum();

    }
}
