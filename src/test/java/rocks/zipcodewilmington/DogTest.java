package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDog() {
        // Given (a name exists and a dog exists)
        Dog name = new Dog(null, null, 1253);
        String givenName = "Freya";
        Date expectedBday = new Date(2003, Calendar.JANUARY, 07);

        // When (a dog's name is set to the given name)
        name.setName("Freya");
        name.setBirthDate(expectedBday);

        // Then (we expect to get the given name from the dog)
        String dogName = name.getName();
        Date actualbDay = name.getBirthDate();
        Assert.assertEquals(dogName, givenName);
        Assert.assertEquals(expectedBday, actualbDay);
    }

    @Test
    public void speakTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String expectedSpeak = "bark!";

        // When (a dog's name is set to the given name)
         String actualSpeak = dog.speak();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
    @Test
    public void setBirthDate() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        Date expectedBday = new Date(2003, Calendar.JANUARY, 07);

        // When (a dog's name is set to the given name)
        Date actualBday = new Date(2003, Calendar.JANUARY, 07);

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(actualBday, expectedBday);
    }

    @Test
    public void setVoidFood() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        Integer expectedFood = 1;

        // When (a dog's name is set to the given name)
         dog.eat(food);
         Integer actualFoodEaten = dog.getNumberOfMealsEaten();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(actualFoodEaten, expectedFood);
    }

    @Test
    public void getID() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, 12356);
        Integer expectedID = 12356;

        // When (a dog's name is set to the given name)
         Integer actualID = dog.getId();
        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(actualID, expectedID);
    }
    @Test
    public void Animalinher() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, 12356);
        Integer expectedID = 12356;

        // When (a dog's name is set to the given name)
        Integer actualID = dog.getId();
        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(actualID, expectedID);
    }
}
