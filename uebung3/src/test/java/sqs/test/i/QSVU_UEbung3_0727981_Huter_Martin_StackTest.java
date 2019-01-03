package sqs.test.i;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by mgh on 12.12.15.
 */
public class QSVU_UEbung3_0727981_Huter_Martin_StackTest {

    Stack<String> stringStack;

    @Before
    public void setUp(){
        stringStack = new Stack<String>();
    }

    @After
    public void tearDown(){
        stringStack = null;
    }

    @Test
    public void testIsEmtpy(){
        Assert.assertTrue(stringStack.empty());
    }

    @Test
    public void testIsNotEmtpy(){
        stringStack.push("Test");
        Assert.assertFalse(stringStack.empty());
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekEmpty(){
        stringStack.peek();
    }

    @Test
    public void testPeek(){
        stringStack.push("Test");
        Assert.assertEquals("Test",stringStack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopEmpty(){
        stringStack.pop();
    }

    @Test
    public void testPop1ElementInStack(){
        stringStack.push("Test");
        Assert.assertEquals("Test",stringStack.pop());
    }

    @Test
    public void testPop3ElementsInStack(){
        stringStack.push("Test1");
        stringStack.push("Test2");
        stringStack.push("Test3");
        Assert.assertEquals("Test3",stringStack.pop());
        Assert.assertEquals("Test2",stringStack.pop());
        Assert.assertEquals("Test1",stringStack.pop());
    }

    @Test
    public void testPush(){
        Assert.assertEquals(0,stringStack.size());
        stringStack.push("Test");
        Assert.assertEquals(1,stringStack.size());
    }

    @Test
    public void testSearch001(){
        stringStack.push("Test0");
        stringStack.push("Test1");
        stringStack.push("Test2");
        stringStack.push("Test3");
        stringStack.push("Test4");
        stringStack.push("Test5");

        Assert.assertEquals(6,stringStack.search("Test0"));
        stringStack.pop();
        Assert.assertEquals(5,stringStack.search("Test0"));
    }

    @Test
    public void testSearch002(){
        Assert.assertEquals(-1,stringStack.search("Test0"));
    }

    /**
     * Finds only the Top Location an Equal Instance
     */
    @Test
    public void testSearch003(){
        stringStack.push("Test1");
        Assert.assertEquals(-1,stringStack.search("Test0"));
        stringStack.push("Test0");
        stringStack.push("Test0");
        Assert.assertEquals(1,stringStack.search("Test0"));
        stringStack.pop();
        Assert.assertEquals(1,stringStack.search("Test0"));
    }

    /**
     * Test if the Object is no longer in the Stack the search returns -1 again
     */
    @Test
    public void testSearch004(){
        stringStack.push("Test0");
        stringStack.push("Test1");
        stringStack.push("Test2");
        Assert.assertEquals(2,stringStack.search("Test1"));
        stringStack.pop();
        Assert.assertEquals(1,stringStack.search("Test1"));
        stringStack.pop();
        Assert.assertEquals(-1,stringStack.search("Test1"));
    }


    @Test
    public void testSizeIncrementOnPush(){
        Assert.assertEquals(0,stringStack.size());
        stringStack.push("Test0");
        Assert.assertEquals(1,stringStack.size());
        stringStack.push("Test1");
        Assert.assertEquals(2,stringStack.size());
        stringStack.push("Test2");
        Assert.assertEquals(3,stringStack.size());
    }

    @Test
    public void testSizeDecrementOnPop(){
        Assert.assertEquals(0,stringStack.size());
        stringStack.push("Test0");
        stringStack.push("Test1");
        stringStack.push("Test2");
        Assert.assertEquals(3,stringStack.size());
        stringStack.pop();
        Assert.assertEquals(2,stringStack.size());
        stringStack.pop();
        Assert.assertEquals(1,stringStack.size());
        stringStack.pop();
        Assert.assertEquals(0,stringStack.size());
    }

    @Test
    public void testSizeEqualAfterPeek(){
        Assert.assertEquals(0,stringStack.size());
        stringStack.push("Test0");
        stringStack.push("Test1");
        stringStack.push("Test2");
        Assert.assertEquals(3,stringStack.size());
        stringStack.peek();
        Assert.assertEquals(3,stringStack.size());
    }


}
