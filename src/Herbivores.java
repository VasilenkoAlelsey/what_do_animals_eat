public class Herbivores extends Animal implements Eatable {

    public Herbivores(String name) {
        super(name);
    }

    @Override
    public void eats(Eatable eat) {
        boolean answer = !(eat instanceof Animal);
        System.out.printf("%s eats %s? - %b\n", super.getName(), eat.getName(), answer);
    }
}
