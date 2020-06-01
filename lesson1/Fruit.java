package lesson1;


import java.util.ArrayList;

public abstract class Fruit {
    abstract int getWeight();

}

    class Apple extends Fruit {

        @Override
        int getWeight() {
            return 1;
        }
    }

    class Orange extends Fruit {

        @Override
        int getWeight() {
            return 2;
        }
    }

    class Box<T extends Fruit> {
    public int weight;
    public ArrayList<T> fruits;

        public Box() {
            fruits = new ArrayList<>();
            weight = 0;
        }

       public void addFruit (T fruit) {
            fruits.add(fruit);
            weight += fruit.getWeight();
    }

        public void getWeight() {
        }

        public void clearBox () {
            weight = 0;
        }

        public boolean compare (Box<? extends Fruit> otherBox) {
            return weight == otherBox.weight;
        }

        public void dropTo (Box<T> otherBox) {
            clearBox();
            for (T fruit: fruits) {
                otherBox.addFruit(fruit);
            }
            fruits.clear();
        }
    }
