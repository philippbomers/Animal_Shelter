public class Dog implements AnimalInterface{

    private final String name;
    private final int cuteness;

    public Dog(String name, int cuteness) {
        this.name = name;
        this.cuteness = cuteness;
    }

    @Override
    public int getCuteness() {
        return this.cuteness;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void sleep(int time) {
        System.out.println("Dog sleeps.");
    }

    @Override
    public void run(int speed, int time) {
        System.out.println("Dog runs "+speed+" mph and "+time+" seconds.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats.");
    }
}
