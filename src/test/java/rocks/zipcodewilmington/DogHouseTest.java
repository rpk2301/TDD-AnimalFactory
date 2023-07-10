package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)` 7
    // TODO - Create tests for `void remove(Integer id)`7
    // TODO - Create tests for `void remove(Dog dog)`7
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()` 7

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
    public void removebyID()
    {
        //Given
        DogHouse home = new DogHouse();
        Dog rem = new Dog("Jeff",null,45);
        //When
        home.add(rem);
        int inital = DogHouse.getNumberOfDogs();
        home.remove(45);
        int after = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertNotEquals(inital,after);
    }
    @Test
    public void removebyObject()
    {
        //Given
        DogHouse home = new DogHouse();
        Dog rem = new Dog("Jeff",null,45);
        //When
        home.add(rem);
        int inital = DogHouse.getNumberOfDogs();
        home.remove(rem);
        int after = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertNotEquals(inital,after);
    }
    @Test
    public void  testAdd()
    {

        //Given
         DogHouse expected = new DogHouse();
        Dog chad = new Dog("",null,234);
        //When
        expected.add(chad);
        //Then
       Assert.assertEquals(chad,DogHouse.getDogById(234));
    }
    @Test
    public void getbyid()
    {
        //Given
        DogHouse home = new DogHouse();
        Dog f = new Dog("",null,2343);
        //When
        home.add(f);
        //Then
        Assert.assertTrue((DogHouse.getDogById(2343).equals(f)));
    }



}
