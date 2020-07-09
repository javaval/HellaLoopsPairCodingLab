package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        // init empty string for return
        String evenNums = "";

        // loop through set of numbers, increment by 1
        for (int i = start; i <= stop; i++){

            //conditional statement: the condition is if the number is even
            if(i % 2 ==0){
    
                //concatenating the number to empty string
                evenNums += i;
            }
        }
  
        //returning empty string
        return evenNums;
    }


    public static String getOddNumbers(int start, int stop) {
        // init empty string for return
        String oddNums = "";

        // loop through set of numbers, increment by 1
        for (int i = start; i <= stop; i++){

            //conditional statement: the condition is if the number is even
            if(i % 2 ==1){
    
                //concatenating the number to empty string
                oddNums += i;
            }
        }
  
        //returning empty string
        return oddNums;
    }

    // getSquare 
    public static String getSquareNumbers(int start, int stop, int step) {
        String value ="";
        for(int i= start; i < stop; i = step){
            value += Math.pow(i,2);
        }
        return value;
    }

    //same thing as the previous method but now start value is specificed
    public static String getRange(int start, int stop) {
        String value ="";
        for(int i= start; i < stop; i++){
            value += i;
            //value = value + i;
        }
        return value;
    }
    
    public static String getRange(int start, int stop, int step) {
        String value ="";
        for(int i= start; i < stop; i = step){
            value += i;
            //value = value + i;
        }
        return value;
    }
    
    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String value ="";
        for (int i = start; i < stop; i = step){
            value += Math.pow(i, exponent);
        }
        return value;
    }
}
