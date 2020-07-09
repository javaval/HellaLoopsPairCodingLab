package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    /*The first two functions work together to build a triangle 
    - first we get the num rows, then the number of stars */

    //spits out a string with the number of stars we input
    // ex: getTriangle(20) -> "********************" (20 star string)

    public static String getTriangle(int numberOfRows) {
        //init empty string
        String output = "";
        //Loop the number of times we want, starting at 1 to be inclusive.
            //Start @ | Condition for loop to run | Step
        for(int r = 1; r <= numberOfRows; r++){
            //adds row full of stars to output str and adds new line
            output += getRow(r) + "\n";
        }
        return output;
    }

    public static String getRow(int numberOfStars) {
        //init empty string
        String output = "";
        //Loop the number of times we want, starting at 1 to be inclusive.
            //Start @ | Condition for loop to run | Step
        for(int star = 1; star <= numberOfStars; star++){
            //add star to output str
            output += "*";
        }
        return output;
    }

     // test Case says 4 rows... use getTriangle
    public static String getSmallTriangle() {
        return getTriangle(5);
    }

     // test Case says 9 rows... use getTriangle
    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
