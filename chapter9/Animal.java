package chapter9;

public class Animal{

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + " goes ZZZzzzzz");
    }

    public void eat(){
        System.out.println(name + " says N0M nom nom");
    }

    public String speak(){
        return "w00t";
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return  name + " says " + speak();
    }




}