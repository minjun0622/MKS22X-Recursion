
public class Recursion{
    /*You may write additional private methods */
    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
    */
    public static double sqrt(double n, double tolerance){
      if ((n - tolerance) < 0.0001) {
        return n;
      }
      else {

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
      fibber();
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
      sumDigits()
    }

    private static ArrayList<Integer> sumDigits() {

    }

}
