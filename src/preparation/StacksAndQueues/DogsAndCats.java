package preparation.StacksAndQueues;

import java.util.*;

public class DogsAndCats {

    class Animal{
        String type;

        public Animal(String type){
            this.type = type;
        }
    }

    class Cat extends Animal {

        public Cat(){
            super("cat");
        }
    }

    class Dog extends Animal {

        public Dog(){
            super("dog");
        }
    }
    LinkedList ll = new LinkedList();

    public void enqueue(String type){
        if(type.equalsIgnoreCase("cat"))
            this.ll.addLast(new Cat());
        else
            this.ll.addLast(new Dog());


    }

    public Animal dequeueAny() {
        return (Animal)ll.removeFirst();
    }

    public void display() {
        Iterator it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(((Animal) it.next()).type);
        }
    }

    public Animal dequeue(String type){
        Iterator it = ll.iterator();
        while(it.hasNext()){
            Object o = it.next();
            if(((Animal)o).type.equalsIgnoreCase(type)){
                Animal animal =(Animal)o;
                ll.remove(animal);
                return animal;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DogsAndCats dc = new DogsAndCats();
        dc.enqueue("cat");
        dc.enqueue("dog");
        dc.enqueue("cat");
        dc.enqueue("dog");
        dc.dequeue("dog");
        dc.display();


    }
}
