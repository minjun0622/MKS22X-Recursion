import java.util.ArrayList;
public class recursion{
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
        return mysqrt(n, tolerance, n/2);
      }
    }

    //this helper finds the guess if it is not equal to the permitted value.
    private static double mysqrt(double n, double tolerance, double guess) {
      if (Math.abs(guess * guess - n) <= tolerance) {
        return guess;
    }
    else {
      return mysqrt(n, tolerance, (n / guess + guess) / 2);
    }
  }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
     //Linear time because it uses a helper method in which the parameters are counted inside
     //the helper function.

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
      return fibber(0, 1, n, 0);
    }

    //helper for fib
    private static int fibber(int before, int after, int target, int index) {
      if (index == target) {
        return before;
      }
      return fibber(after, before + after, target, index + 1);
    }

    /*As Per classwork
    We can use the function of an arraylist to shrink down or add to the list at all times.
    */
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> data = new ArrayList<Integer>();
      sumDigits(n, 0, data);
      return data;
    }

      //helper for the makeAllSums method.
    private static void sumDigits(int sum, int partial, ArrayList<Integer> data) {
      if (sum == 0) {
        data.add(partial);
      }
      else {
        sumDigits(sum - 1, partial, data);
        sumDigits(sum - 1, partial + sum, data);
      }
    }

}
