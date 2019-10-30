package chapter9;

public class Zoo{

    public static void main(String[] args) {
        
        Animal animal = new Animal("Cat");
        System.out.println(animal);
        animal.sleep();
        animal.eat();


        Animal animal2 = new Animal("Dog");
        System.out.println(animal2);
        animal2.sleep();
        animal2.eat();

        Cat cat = new Cat("Fluffy");
        cat.eat();
        cat.sleep();
        System.out.println(cat);



    }



}