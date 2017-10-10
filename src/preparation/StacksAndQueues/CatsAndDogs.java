package preparation.StacksAndQueues;

import java.util.Iterator;
import java.util.LinkedList;

public class CatsAndDogs {

    LinkedList cat = new LinkedList();
    LinkedList dog = new LinkedList();
    int insertOrder = 0;

    class Animal {
        String type;
        int order;

        public Animal(String type) {
            this.type = type;
            this.order = insertOrder;
            insertOrder++;
        }
    }

    class Cat extends Animal {

        public Cat() {
            super("cat");
        }
    }

    class Dog extends Animal {

        public Dog() {
            super("dog");
        }
    }


    public void enqueue(String type) {
        if (type.equalsIgnoreCase("cat"))
            this.cat.addLast(new Cat());
        else
            this.dog.addLast(new Dog());


    }

    public Animal dequeueAny() {
        if(cat.size()==0){
            if(dog.size()>0)
                return (Animal)dog.pop();
            else
                return null;
        }
        else if(dog.size()==0){
                if(cat.size()>0)
                    return (Animal)cat.pop();
                else
                    return null;
        }
        else if(cat.size()>0 && dog.size()>0) {
            Animal c = (Animal) cat.peek();
            Animal d = (Animal) dog.peek();
            System.out.println(c.type + " " + c.order + " " + d.type + " " + d.order);
            return d.order > c.order ? (Animal) cat.pop() : (Animal) dog.pop();
        }
        else {
            return null;
        }
    }


    public void display() {
        Iterator it = cat.iterator();
        while (it.hasNext()) {
            Animal cat = ((Animal) it.next());
            System.out.println(cat.type + " " + cat.order);
        }

        Iterator itr = dog.iterator();
        while (itr.hasNext()) {
            Animal dog = ((Animal) itr.next());
            System.out.println(dog.type + " " + dog.order);
        }
    }

    public Animal dequeue(String type) {
        if (type.equalsIgnoreCase("cat")) {
            if (cat.size() > 0) {
                return (Animal) cat.pop();
            } else if (dog.size() > 0) {
                return (Animal) dog.pop();
            }
        } else if (type.equalsIgnoreCase("dog")) {
            if (dog.size() > 0) {
                return (Animal) dog.pop();
            } else if (cat.size() > 0) {
                return (Animal) cat.pop();
            }
        }
            return null;
    }



    public static void main(String[] args) {
        CatsAndDogs cd = new CatsAndDogs();
        cd.enqueue("cat");
        cd.enqueue("dog");
        cd.enqueue("cat");
        cd.enqueue("dog");
        cd.display();
        System.out.println(cd.dequeueAny());
        System.out.println(cd.dequeueAny());
        System.out.println(cd.dequeueAny());
        System.out.println(cd.dequeueAny());
        System.out.println(cd.dequeueAny());
    }


}
