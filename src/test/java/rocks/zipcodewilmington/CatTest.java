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
public void setNameTest()
    {
        //Given
        String expectedname = "Pablo";
        String actualname = "Frank";
        //When
        Mammal cat = new Cat(actualname,new Date(),4312);
        cat.setName(expectedname);
        //Then
        Assert.assertEquals(cat.getName(),expectedname);
    }
    @Test
    public void setBirthDate()
    {
        //Given
        Date newdate = new Date();
        //When
        Cat cat = new Cat("Name",null,6543);
        //Then
        cat.setBirthDate(newdate);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(newdate,actual);
    }


    @Test
    public void testSpeak() {
        //Given
        String Expected = "meow!";

        //When
        Cat cat = new Cat("Ralph", new Date(), 3894);

        //Then
        String actual = cat.speak();
        Assert.assertEquals(Expected, actual);

    }

    @Test
    public void testeat() {
        //Given
        Food expected = new Food();
        //When
        Cat cat = new Cat("Ralph", new Date(), 3894);
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
        Mammal cat = new Cat("j",new Date(),12);
       int  actual= cat.getId();
        //Then
        Assert.assertEquals(actual,expected);
    }
@Test
    public void isMammal()
{
    Cat cat = new Cat("",null,9);

    Assert.assertTrue(cat instanceof Mammal);

}


@Test
    public void isAnimal()
{
    Cat cat = new Cat("",null,9);

    Assert.assertTrue(cat instanceof Animal);
}
}
