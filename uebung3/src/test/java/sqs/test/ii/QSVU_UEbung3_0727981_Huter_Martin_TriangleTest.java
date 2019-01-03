package sqs.test.ii;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mgh on 12.12.15.
 */
public class QSVU_UEbung3_0727981_Huter_Martin_TriangleTest {

    @Test
    public void testCalcHypotenuse001(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcHypotenuse(null,null));
    }

    @Test
    public void testCalcHypotenuse002(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcHypotenuse(null,10D));
    }

    @Test
    public void testCalcHypotenuse003(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcHypotenuse(10D,null));
    }

    @Test
    public void testCalcHypotenuse004(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcHypotenuse(-10D,10D));
    }

    @Test
    public void testCalcHypotenuse005(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcHypotenuse(10D,-10D));
    }

    @Test
    public void testCalcHypotenuse006(){
        Assert.assertEquals(new Double(5),QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcHypotenuse(3D,4D));
    }

    @Test
    public void testCalcOpposingAngle001(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcOpposingAngle(-10D));
    }

    @Test
    public void testCalcOpposingAngle002(){
        Assert.assertEquals(new Double(30),QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcOpposingAngle(60D));
    }

    @Test
    public void testCalcOpposingAngle003(){
        Assert.assertEquals(new Double(45),QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcOpposingAngle(45D));
    }

    @Test
    public void testCalcOpposingAngle004(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcOpposingAngle(100D));
    }

    @Test
    public void testCalcOpposingAngle005(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcOpposingAngle(null));
    }

    @Test
    public void testCalcArea001(){
        Assert.assertEquals(new Double(6),QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcArea(3D,4D));
    }

    @Test
    public void testCalcArea002(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcArea(null,10D));
    }

    @Test
    public void testCalcArea003(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcArea(10D,null));
    }

    @Test
    public void testCalcArea004(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcArea(-10D,10D));
    }

    @Test
    public void testCalcArea005(){
        Assert.assertEquals(null,QSVU_UEbung3_0727981_Huter_Martin_Triangle.calcArea(10D,-10D));
    }



}
