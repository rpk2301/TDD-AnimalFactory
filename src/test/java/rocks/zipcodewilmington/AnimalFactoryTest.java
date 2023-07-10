package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
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
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void CreateCatTest()
    {
        Cat newcat = AnimalFactory.createCat("Dan",new Date());
        CatHouse.add(newcat);
        Cat d = CatHouse.getCatById(0);
        Assert.assertEquals(newcat,d);
    }




    @Test
    public void CreateDogTest()
    {
        Dog expected = AnimalFactory.createDog("Jeff",new Date());
        DogHouse.add(expected);
        Dog d = DogHouse.getDogById(1);
        Assert.assertEquals(expected,d);
    }
}
