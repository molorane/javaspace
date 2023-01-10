package main;

public class Main {

    public static void main(String[] args) {

        AutoCloseable a = () -> System.out.println("AutoCloseable A");
        AutoCloseable b = () -> System.out.println("AutoCloseable B");
        AutoCloseable c = () -> System.out.println("AutoCloseable C");

        try(a;b;c){

        } catch(Exception e) {

        }

    }


}
