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
public class DogTest {
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
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        String givenName = "Spot";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testDogSpeak(){
        String givenName = "Spot";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String expectedSpeak = "bark!";
        String actualSpeak = dog.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testDogBD(){
        String givenName = "Spot";
        Date givenBirthdate = new Date(121 + 1900, Calendar.JULY, 17);
        Integer givenId = 0;

        Dog dog = new Dog(givenName, new Date(121 + 1900, Calendar.JULY, 17), givenId);

        Date expectedBD = dog.setBirthDate(new Date(121 + 1900, Calendar.JULY, 17));
        Date actualBD = dog.getBirthDate();

        Assert.assertEquals(expectedBD, actualBD);
    }
// TODO - Create tests for `void eat(Food food)`
    @Test
    public void testDogEat(){
        String givenName = "Spot";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthdate, givenId);
        Food chicken = new Food();

        Integer expectedNumOfMeals = 1;
        Integer actualNumOfMeals = dog.eat(chicken);

        Assert.assertEquals(expectedNumOfMeals, actualNumOfMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testDogID(){
        String givenName = "Spot";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthdate, givenId);

        Integer expectedID = dog.setID(100);
        Integer actualID = dog.getId();

        Assert.assertEquals(expectedID, actualID);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceAnimal(){
        String givenName = "Spot";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthdate, givenId);

        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceMammal(){
        String givenName = "Spot";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthdate, givenId);
        Assert.assertTrue(dog instanceof Mammal);
    }



}
