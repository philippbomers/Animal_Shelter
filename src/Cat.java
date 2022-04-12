public class Cat implements AnimalInterface{

    private final String name;
    private final int cuteness;

    public Cat(String name, int cuteness) {
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
        System.out.println("Cat sleeps.");
    }

    @Override
    public void run(int speed, int time) {
        System.out.println("Cat runs "+speed+" mph and "+time+" seconds and looks for the mice.");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats.");
    }
}
