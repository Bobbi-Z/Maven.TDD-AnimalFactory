package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

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
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testCatSetName(){
        String givenName = "Patches";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat("Patches", givenBirthDate, givenId);

        String expectedName = cat.setName(givenName);

        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testCatSetBDay(){
        String givenName = "";
        Date givenBirthdate = new Date(121 + 1900, Calendar.JULY, 17);
        Integer givenId =0;

        Cat cat = new Cat(givenName, givenBirthdate, givenId);

        Date expectedBD = cat.setBirthDate(givenBirthdate);

        Date actualBD= cat.getBirthDate();

        Assert.assertEquals(expectedBD, actualBD);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testCatSpeak(){
        String givenName = "Patches";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String expectedSpeak = "meow!";
        String actualSpeak = cat.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testCatEat(){
        String givenName = "Patches";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food tuna = new Food();

        Integer expectedNumOfMeals = 1;
        Integer actualNumOfMeals = cat.eat(tuna);

        Assert.assertEquals(expectedNumOfMeals, actualNumOfMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testCatId(){
        String givenName = "Patches";
        Date givenBirthDate = new Date();
        Integer givenId = 100;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Integer expectedId = cat.setID(100);
        Integer actualId = cat.getId();

        Assert.assertEquals(expectedId, actualId);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceMammal(){
        String givenName = "Patches";
        Date givenBirthDate = new Date();
        Integer givenId = 100;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

    Assert.assertTrue(cat instanceof Mammal);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceAnimal(){
        String givenName = "Patches";
        Date givenBirthDate = new Date();
        Integer givenId = 100;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat instanceof Animal);
    }

}
