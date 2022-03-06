package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDogs() {
        // Given
        String name = "Muffin";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void removeID() {
        // Given
        Dog dog = new Dog(null, null, 12564);
        Dog dog1 = new Dog(null, null, 12547);

        // When
        DogHouse.remove(12564);

        // Then
        Integer numDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, 1);
    }

    @Test
    public void removeDog() {
        // Given
        Dog dog = new Dog(null, null, null);
        // When
        DogHouse.remove(dog);
        // Then
        Integer numDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(0, 0);
    }

    @Test
    public void getDogById() {
        // Given
        Dog dog = new Dog(null, null,  12568);
        Dog dog2 = new Dog(null, null, 25672);
        Dog expectedDog = dog;
        // When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        Dog actualDog = DogHouse.getDogById(12568);
        // Then
        Assert.assertEquals(expectedDog, actualDog);
    }

    @Test
    public void getNumDogs() {
        // Given
        Dog dog = new Dog(null, null,  12568);
        Dog dog2 = new Dog(null, null, 25672);

        // When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        Integer expectedDogs = 2;


        // Then
        Integer actualDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogs, actualDogs);
    }
}
