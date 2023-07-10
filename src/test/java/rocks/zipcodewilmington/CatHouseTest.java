package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)` 7
    // TODO - Create tests for `void remove(Integer id)` 7
    // TODO - Create tests for `void remove(Cat cat)`7
    // TODO - Create tests for `Cat getCatById(Integer id)`7
    // TODO - Create tests for `Integer getNumberOfCats()`7



    @Test
    public void addTest()
    {
        //Given
        CatHouse home = new CatHouse();
        Cat chad = new Cat("",null,234);
        //When
        home.add(chad);
        //Then
        Assert.assertTrue((CatHouse.getCatById(234).equals(chad)));
    }

    @Test
    public void getbyid()
    {
        //Given
        CatHouse home = new CatHouse();
        Cat f = new Cat("",null,2343);
        //When
        home.add(f);
        //Then
        Assert.assertTrue((CatHouse.getCatById(2343).equals(f)));
    }


@Test
    public void removebyID()
    {

    //Given
        CatHouse home = new CatHouse();
        Cat rem = new Cat("Jeff",null,45);

      //When
        home.add(rem);
        int inital = CatHouse.getNumberOfCats();
        home.remove(45);
        int after = CatHouse.getNumberOfCats();
        //Then
        Assert.assertNotEquals(inital,after);


    }
@Test
    public void removebyObject()
    {

        //Given
        CatHouse home = new CatHouse();
        Cat rem = new Cat("Jeff",null,45);

        //When
        home.add(rem);
        int inital = CatHouse.getNumberOfCats();
        home.remove(rem);
        int after = CatHouse.getNumberOfCats();

        //Then
        Assert.assertNotEquals(inital,after);


    }



    @Test
    public void testget()
    {
        //Given
        CatHouse shingala = new CatHouse();
        Cat chad = new Cat("Name", new Date(), 345);
        shingala.clear();
        int expected = 1;

        //When
        shingala.add(chad);
        int actual = shingala.getNumberOfCats();

        Assert.assertEquals(actual,expected);

    }
}
