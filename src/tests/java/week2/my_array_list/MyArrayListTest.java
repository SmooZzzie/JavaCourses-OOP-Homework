package week2.my_array_list;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by SmooZzzie on 26.04.2017.
 */
public class MyArrayListTest {

    MyArrayList testArrayList;

    @Before
    public void setUp() {

        Object[] inputValues = {"TestValue1", "TestValue2", "TestValue3", "TestValue4", "TestValue5"};
        testArrayList = new MyArrayList(inputValues);
    }

    @After
    public void tearDown() {

        testArrayList = null;
    }

    @Test
    public void test_trim_to_size() {

        // поленился делать расширение вручную, поэтому этот тест получился зависим от другого метода
        testArrayList.ensureCapacity();
        testArrayList.trimToSize();

        int expected = 5;
        int actual = testArrayList.getElementData().length;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test_size() {

        int expected = 5;
        int actual = testArrayList.size();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test_is_empty() {

        Assert.assertFalse(testArrayList.isEmpty());
    }

    @Test
    public void test_add_by_object() {

        Assert.assertTrue(testArrayList.add(5));
    }

    @Test
    public void test_add_by_index() {

        Assert.assertTrue(testArrayList.add(4,5.77));
    }

    @Test
    public void test_get() {

        Object expected = "TestValue3";
        Assert.assertEquals(expected, testArrayList.get(2));
    }

    @Test
    public void test_remove_by_index() {

        int expectedSize = 4;

        testArrayList.remove(2);
        Assert.assertEquals(expectedSize, testArrayList.size());
    }

    @Test
    public void test_remove_by_object() {

        Object expected = "TestValue2";

        Assert.assertEquals(expected,testArrayList.remove("TestValue2"));
    }

    @Test
    public void test_set() {

        Object expected = "TestValue2";

        Assert.assertEquals(testArrayList.set(1,"TestSetting"), expected);
    }

    @Test
    public void test_clear() {

        int expectedSize = 0;

        testArrayList.clear();
        int actual = testArrayList.size();

        Assert.assertEquals(expectedSize,actual);
    }

    @Test
    public void test_contains() {

        Object testValue = "TestValue5";

        Assert.assertTrue(testArrayList.contains(testValue));
    }



}
