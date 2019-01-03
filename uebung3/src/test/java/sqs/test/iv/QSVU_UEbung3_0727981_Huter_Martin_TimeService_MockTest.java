package sqs.test.iv;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sqs.test.iv.isolation.ChristmasCounter;

/**
 * Created by mgh on 12.12.15.
 */
public class QSVU_UEbung3_0727981_Huter_Martin_TimeService_MockTest {

    private ChristmasCounter christmasCounter;

    @Before
    public void setUp(){
        christmasCounter = new ChristmasCounter(new QSVU_UEbung3_0727981_Huter_Martin_TimeService_Mock());
    }

    @After
    public void tearDown(){
        christmasCounter = null;
    }

    @Test
    public void christmasCounterMockTest(){
        Assert.assertEquals(9,christmasCounter.calculateDaysToChristmas());
    }
}
