package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

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
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    @Test
    public void testSpeak() {
        //Given
        String Expected = "bark!";

        //When
        Dog cat = new Dog("Ralph", new Date(), 3894);

        //Then
        String actual = cat.speak();
        Assert.assertEquals(Expected, actual);

    }


    @Test
    public void setBirthDate()
    {
        //Given
        Date newdate = new Date();
        //When
        Dog cat = new Dog("Name",null,6543);
        //Then
        cat.setBirthDate(newdate);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(newdate,actual);
    }

    @Test
    public void testeat() {
        //Given
        Food expected = new Food();
        //When
        Dog cat = new Dog("Ralph", new Date(), 3894);
        //Then
        cat.eat(expected);
        Food Actual = cat.getEatenMeals().get(0);
        Assert.assertEquals(expected, Actual);

    }
    @Test
    public void getID()
    {
        //Given
        int expected=12;
        //When
        Dog cat = new Dog("j",new Date(),12);
        int actual= cat.getId();
        //Then
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void isMammal()
    {
        Dog cat = new Dog("",null,9);

        Assert.assertTrue(cat instanceof Mammal);

    }


    @Test
    public void isAnimal()
    {
        Dog cat = new Dog("",null,9);

        Assert.assertTrue(cat instanceof Animal);
    }
}



