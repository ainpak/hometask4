public class Main {
    public static void main(String[] args) {

        Animal cat;
        cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Meow");

            }
        };

        cat.makeSound();
    }
}