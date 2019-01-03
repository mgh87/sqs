package sqs.test.ii;

/**
 * Created by mgh on 12.12.15.
 */
public class QSVU_UEbung3_0727981_Huter_Martin_Triangle {


    /**
     * For illegal inputs null will be returned.
     * cathetus must be greater than 0
     * @param cathetusA length of the first cathetus
     * @param cathetusB length of the second cathetus
     * @return returns the hypotenuse for the two cathetus
     */
    public static Double calcHypotenuse(Double cathetusA, Double cathetusB) {
        if(illegalCathetus(cathetusA,cathetusB)){
            return null;
        }
        return Math.sqrt(Math.pow(cathetusA,2) + Math.pow(cathetusB,2));
    }

    /**
     * Returns the angle of the opposing angle of the rectangular Triangle that is not 90°
     * For illegal inputs null will be returned.
     * Angle must be between 0 and 90 decrees
     * @param angle angle of the first angle
     * @return
     */
    public static Double calcOpposingAngle(Double angle) {
        if (angle == null || angle <= 0 || angle >= 90){
            return null;
        }
        return 90D-angle;
    }

    public static Double calcArea(Double cathetusA, Double cathetusB) {
        if(illegalCathetus(cathetusA,cathetusB)){
            return null;
        }
        return cathetusA*cathetusB/2;
    }

    private static boolean illegalCathetus(Double cathetusA, Double cathetusB){
        return (cathetusA == null || cathetusA <= 0
                || cathetusB == null || cathetusB <=0);
    }
}
