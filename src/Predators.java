public class Predators extends Animal {

    public Predators(String name) {
        super(name);
    }

    @Override
    public void eats(Eatable eat) {
        boolean answer = eat instanceof Animal;
        System.out.printf("%s eats %s? - %b\n", super.getName(), eat.getName(), answer);
    }
}
