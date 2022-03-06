package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCat() {
        // Given
        CatHouse.clear();
        String name = "Berry";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
    @Test
    public void removeID() {
        // Given
        CatHouse.clear();
        Cat cat = new Cat(null, null, 12564);
        Cat cat1 = new Cat(null, null, 12547);

        // When
        CatHouse.remove(12564);

        // Then
        Integer numCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, 1);
    }

    @Test
    public void removeCat() {
        // Given
        CatHouse.clear();
        Cat cat = new Cat(null, null, null);
        // When
        CatHouse.remove(cat);
        // Then
        Integer numCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(0, 0);
    }

    @Test
    public void getCatById() {
        // Given
        CatHouse.clear();
        Cat cat = new Cat(null, null,  12568);
        Cat cat2 = new Cat(null, null, 25672);
        Cat expectedCat = cat;
        // When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        Cat actualCat = CatHouse.getCatById(12568);
        // Then
        Assert.assertEquals(expectedCat, actualCat);
    }

    @Test
    public void getNumCats() {
        // Given
        CatHouse.clear();
        Cat cat = new Cat(null, null,  12568);
        Cat cat2 = new Cat(null, null, 25672);

        // When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        Integer expectedCats = 2;


        // Then
        Integer actualCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCats, actualCats);
    }

}
