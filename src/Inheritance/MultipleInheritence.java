package Inheritance;

public class MultipleInheritence extends SingleInheritanceB {
    MultipleInheritence(String Name, int Age, String city) {
        super(Name, Age, city);
    }

    public static void main(String[] args) {
        MultipleInheritence inheritence = new MultipleInheritence("Abhijeet", 20, "Pune");
        inheritence.show();
        inheritence.showB();
    }
}
