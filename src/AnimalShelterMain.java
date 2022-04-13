import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalShelterMain {
    public static void main(String[] args) {
        List<AnimalInterface> animals = new ArrayList<>();
        animals.add(new Dog("Wuffi", 35));
        animals.add(new Dog("Kymani", 2000));
        animals.add(new Dog("Ferdi", 1999));
        animals.add(new Cat("Mietzi", 3));
        List<AnimalInterface> sortedAnimals = animals.stream().sorted(Comparator.comparingInt(AnimalInterface::getCuteness)).toList();
        System.out.println("The cutest animals ascending");
        sortedAnimals.forEach(entry -> System.out.println(entry.getName()));
    }
}
