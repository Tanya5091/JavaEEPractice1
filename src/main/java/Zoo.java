import java.util.Collection;

public class Zoo {
    public Zoo(){}
    public void makeSounds(){
        for (Animal animal: animals){
            animal.makeSound();
        }
    }
    private Collection<Animal> animals;
    public void setAnimals(Collection<Animal> animals){
        this.animals = animals;
    }
}
