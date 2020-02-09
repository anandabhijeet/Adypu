package controlStatement;

import java.util.Scanner;

public class FirstDay {

    void showData(){
        System.out.println("hello world");
    }

    void checkIfElse(int number){
        if(number%2 == 0){
            System.out.println(number + " number is even");
        } else {
            System.out.println(number + " number is odd");
        }
    }
    public static void main(String[] args){
        FirstDay demo = new FirstDay();
        demo.showData();
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        demo.checkIfElse(number);

    }
}
