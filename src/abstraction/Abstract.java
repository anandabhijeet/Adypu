package abstraction;

public class Abstract extends Abstraction implements InterfaceDemo {
        @Override
        public int add(int a, int b) {
            return (a + b);
        }

        @Override
        public void show() {
            System.out.println("interface is working");
        }

        @Override
        void showData() {
            System.out.println("abstract method is been implemented");
        }

        public static void main(String[] args) {
            Abstract ab = new Abstract();
            ab.showData();
            ab.getData();
            ab.show();
            System.out.println("Sum: "+ ab.add(20, 30));
        }
    }