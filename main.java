class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("This is parent class: ");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // parent constructor call
        System.out.println("This is child class");
    }

    void show() {
        System.out.println(super.name); // parent variable
    }

}

    public class main{

    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}