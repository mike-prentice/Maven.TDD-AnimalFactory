package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setName() {
        // Given (a name exists and a dog exists)
        Cat name = new Cat(null, null, null);
        String actualName = "Kitty";


        // When (a dog's name is set to the given name)
        name.setName("Kitty");

        // Then (we expect to get the given name from the dog)
        String expectedName = name.getName();
        Assert.assertEquals(actualName, expectedName);

    }

    @Test
    public void speakTest() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        String expectedSpeak = "meow!";

        // When (a dog's name is set to the given name)
        String actualSpeak = cat.speak();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
    @Test
    public void setBirthDate() {
        // Given (a name exists and a dog exists)
        Cat dog = new Cat(null, null, null);
        Date expectedBday = new Date(2003, Calendar.JANUARY, 07);

        // When (a dog's name is set to the given name)
        Date actualBday = new Date(2003, Calendar.JANUARY, 07);

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(actualBday, expectedBday);
    }

    @Test
    public void setVoidFood() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        Integer expectedFood = 1;

        // When (a dog's name is set to the given name)
        cat.eat(food);
        Integer actualFoodEaten = cat.getNumberOfMealsEaten();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(actualFoodEaten, expectedFood);
    }

    @Test
    public void getID() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, 12356);
        Integer expectedID = 12356;

        // When (a dog's name is set to the given name)
        Integer actualID = cat.getId();
        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(actualID, expectedID);
    }
    @Test
    public void Animalinher() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);

        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void Animalinheritance() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);

        Assert.assertTrue(cat instanceof Mammal);
    }

}
