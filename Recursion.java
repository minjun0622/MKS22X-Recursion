import java.util.ArrayList;
public class Recursion{
  public static void main(String[] args) {
        System.out.println("sqrt()");
        System.out.println("-----------------------\n");

        System.out.println("sqrt(4, 0.00001)");
        System.out.println("EXPECTED: 2");
        System.out.println(sqrt(4, 0.00001));         // 2

        System.out.println("----");

        System.out.println("sqrt(8, 0.00001)");
        System.out.println("EXPECTED: ~2.8284");
        System.out.println(sqrt(8, 0.00001));         // ~2.8284

        System.out.println("----");

        System.out.println("sqrt(0, 0.00001)");
        System.out.println("EXPECTED: 0");
        System.out.println(sqrt(0, 0.00001));         // 0

        System.out.println("\n");

        System.out.println("fib()");
        System.out.println("-----------------------\n");

        System.out.println("fib(0)");
        System.out.println("EXPECTED: 0");
        System.out.println(fib(0));                   // 0

        System.out.println("----");

        System.out.println("fib(1)");
        System.out.println("EXPECTED: 1");
        System.out.println(fib(1));                   // 1

        System.out.println("----");

        System.out.println("fib(7)");
        System.out.println("EXPECTED: 13");
        System.out.println(fib(7));                   // 13

        System.out.println("makeAllSums()");
        System.out.println("-----------------------\n");

        System.out.println("makeAllSums(0)");
        System.out.println("EXPECTED: [0]");
        System.out.println(makeAllSums(0));           // [0]

        System.out.println("----");

        System.out.println("makeAllSums(1)");
        System.out.println("EXPECTED: [1, 0]");
        System.out.println(makeAllSums(1));           // [1, 0]

        System.out.println("----");

        System.out.println("makeAllSums(3)");
        System.out.println("EXPECTED: [0, 3, 2, 5, 1, 4, 3, 6]");
        System.out.println(makeAllSums(3));           // [0, 3, 2, 5, 1, 4, 3, 6]
}
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
        return mysqrt(n, tolerance, 1);
      }
    }

    //this helper finds the guess if it is not equal to the permitted value.
    private static double mysqrt(double n, double tolerance, double guess) {
      if (Math.abs((guess * guess - n) / (n * 1000)) < tolerance) {
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
