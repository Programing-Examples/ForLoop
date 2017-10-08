package main.java.com.company;

public class Main {

    public static void main(String[] args) {
        int iterator;
        System.out.println("Counting to 20: ");
        for (iterator=1; iterator<=20; iterator++) {
            System.out.print(iterator + " ");
        }
        System.out.println();

        System.out.println("Counting backwards from 20: ");
        for (iterator=20; iterator>0; iterator--) {
            System.out.print(iterator + " ");
        }
        System.out.println();

        System.out.println("Even numbers to 20: ");
        //Iterator can be created inside For structure
        for (int i=2; i<=20; i=i+2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
