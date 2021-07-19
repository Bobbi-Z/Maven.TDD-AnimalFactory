package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testingAddCat(){
        String expectedName = "fluffy";
        Date expectedDate = new Date();
        Integer expectedID = 1200;

        Cat expectedCat = new Cat(expectedName, expectedDate, expectedID);
        CatHouse catHouse = new CatHouse();
        CatHouse.clear();
     catHouse.add(expectedCat);

        Assert.assertTrue(1 == catHouse.getNumberOfCats());
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testingRemoveCat(){
        String expectedName = "fluffy";
        Date expectedDate = new Date();
        Integer expectedID = 1200;

        Cat expectedCat = new Cat(expectedName, expectedDate, expectedID);
        CatHouse catHouse = new CatHouse();
        CatHouse.clear();
            catHouse.add(expectedCat);
            catHouse.remove(expectedCat);

            Assert.assertTrue(0 == catHouse.getNumberOfCats());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatByID(){
        String expectedName = "fluffy";
        Date expectedDate = new Date();
        Integer expectedID = 1200;

        Cat expectedCat = new Cat(expectedName, expectedDate, expectedID);
        CatHouse catHouse = new CatHouse();
        CatHouse.clear();
        catHouse.add(expectedCat);

        catHouse.remove(1200);

        Assert.assertTrue(0 == catHouse.getNumberOfCats());
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatByID(){
        String expectedName = "fluffy";
        Date expectedDate = new Date();
        Integer expectedID = 1200;

        Cat expectedCat = new Cat(expectedName, expectedDate, expectedID);
        CatHouse catHouse = new CatHouse();
        CatHouse.clear();
        catHouse.add(expectedCat);

        Cat actual = catHouse.getCatById(1200);

        Assert.assertEquals(expectedCat, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()
    @Test
    public void testGetNumOfCats(){
        String expectedName = "fluffy";
        Date expectedDate = new Date();
        Integer expectedID = 1200;

        Cat expectedCat = new Cat(expectedName, expectedDate, expectedID);
        CatHouse catHouse = new CatHouse();
        CatHouse.clear();
        catHouse.add(expectedCat);

        Integer expected = 1;
        Integer actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}
