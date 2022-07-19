package chapter10;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("woof");
    }

    public void fetch(){
        System.out.println("fetch is fun!");
    }
    public void colorSkin(){
        System.out.println("Animal Dog");
    }
}