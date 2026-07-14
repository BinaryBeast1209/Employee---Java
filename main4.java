
class Animal {

    void showCategory() {
        System.out.println("This is an Animal.");
    }
}


class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking.");
    }
}


class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing.");
    }
}


public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.bark();          
        dog.showCategory();  

       
    }
}
