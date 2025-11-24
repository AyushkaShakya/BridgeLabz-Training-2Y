class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    private List<T> list = new ArrayList<>();

    public void add(T fruit) {
        list.add(fruit);
    }

    public void display() {
        for (T f : list)
            System.out.println(f.getClass().getSimpleName());
    }
}

class fruitBox {
    public static void main(String[] args) {
        FruitBox<Apple> fb = new FruitBox<>();
        fb.add(new Apple());
        fb.add(new Apple());
        fb.display();

        // fb.add(new Car()); ❌ Compile-time error
    }
}

