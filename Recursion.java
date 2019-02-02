
public class Recursion{
    /*You may write additional private methods */
    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
    */
    public static double sqrt(double n, double tolerance){
      /*
      During Intro 1, I did this exact problem but in scheme,
      the basic idea was to use a helper function that took in the guess that was done first.
      */
      if (n == 0) {
        return 0;
      }
      else {
        mysqrt(n, tolerance, 1);
      }
    }

    //this helper finds the guess if it is not equal to the permitted value.
    private static double mysqrt(double n, double tolerance, double guess) {
      if (Math.abs((guess * guess - n) / (n * 1000)) < tolerance) {
        return guess;
    }
    else {
      return sqrtHelper(n, tolerance, (n / guess + guess) / 2);
    }
  }


    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      /*
      This method is the way that the recursion without linear time.
      Just for reference
      if (n == 0) {
      return 0;
    }
    if (n == 1) {
    return 1;
  }
  else {
  return fib (n -1) + fib (n -2);
}
*/
      if ()
      fibber(n, n - 1);
    }

    private static int fibber(int number, int before) {
      if (number == 0) {
        return 0;
      }
      if (number == 1) {
        return 1;
      }i


    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
      sumDigits()
    }

    private static ArrayList<Integer> sumDigits() {

    }

}
