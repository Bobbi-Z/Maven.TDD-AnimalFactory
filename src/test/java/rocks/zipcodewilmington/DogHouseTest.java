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
public class DogHouseTest {
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
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog(){
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);

        Integer expectedDog = 1;
        Integer actualDog = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDog, actualDog);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID() {
        String expectedName = "fluffy";
        Date expectedDate = new Date();
        Integer expectedID = 1200;

        Dog expectedDog = new Dog(expectedName, expectedDate, expectedID);
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(expectedDog);

        dogHouse.remove(1200);

        Assert.assertTrue(0 == dogHouse.getNumberOfDogs());
    }
        // TODO - Create tests for `void remove(Dog dog)`
        @Test
        public void testRemoveDog(){
            String expectedName = "fluffy";
            Date expectedDate = new Date();
            Integer expectedID = 1200;

            Dog expectedDog = new Dog(expectedName, expectedDate, expectedID);
            DogHouse dogHouse = new DogHouse();
            dogHouse.add(expectedDog);

            dogHouse.remove(expectedDog);

            Assert.assertTrue(0 == dogHouse.getNumberOfDogs());
        }
        // TODO - Create tests for `Dog getDogById(Integer id)`
        @Test
        public void testGetDogByID(){
            String expectedName = "fluffy";
            Date expectedDate = new Date();
            Integer expectedID = 1200;

            Dog expectedDog = new Dog(expectedName, expectedDate, expectedID);
            DogHouse dogHouse = new DogHouse();
            DogHouse.add(expectedDog);

            Dog actual = DogHouse.getDogById(1200);

            Assert.assertEquals(expectedDog, actual);
        }

    }


