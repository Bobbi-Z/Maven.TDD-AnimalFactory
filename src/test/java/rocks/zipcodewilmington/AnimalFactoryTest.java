package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog(){
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(new Dog("", new Date(), 1));

        String givenName = "Spot";
        Date givenBD = new Date(2021, 07, 17);

         Dog newDog = AnimalFactory.createDog(givenName, givenBD);

         String actualName = newDog.getName();
         Date actualDate = newDog.getBirthDate();
         Integer actualID = newDog.getId();

        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenBD, actualDate);
        Assert.assertTrue(1 == actualID);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCatCreate(){
        CatHouse catHouse = new CatHouse();
        catHouse.add(new Cat("", new Date(), 1));

        String givenName = "Patches";
        Date givenBD = new Date(2021, 07, 17);

        Cat newCat = AnimalFactory.createCat(givenName, givenBD);

        String actualName = newCat.getName();
        Date actualBD = newCat.getBirthDate();
        Integer actualID = newCat.getId();

        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenBD, actualBD);
        Assert.assertTrue(1 == actualID);

    }




}
