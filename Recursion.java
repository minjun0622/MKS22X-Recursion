import java.util.ArrayList;
public class Recursion{
  public static void main(String[] args){
    //testing sqr root
    System.out.println("Testing sqrt");
		System.out.println("value:"+ 7 + "     square root:"+ sqrt(7,0.0001));
    System.out.println("value:"+ 2 + "     square root:"+ sqrt(2,0.0001));
    System.out.println("value:"+ 4 + "     square root:"+ sqrt(4,0.0001));
    System.out.println("value:"+ 0.5 + "     square root:"+ sqrt(0.5,0.0001));
    System.out.println("value:"+ 0.1 + "     square root:"+ sqrt(0.1,0.0001));

    System.out.println();
    System.out.println();

    //testing fib
    System.out.println("Testing fib");
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(10));
    System.out.println(fib(12));
    System.out.println(fib(89));

    System.out.println();
    System.out.println();

    //testing makeAllSums
    System.out.println("Testing makeAllSums");
    System.out.println(makeAllSums(0));
    System.out.println(makeAllSums(1));
    System.out.println(makeAllSums(2));
    System.out.println(makeAllSums(3));
    System.out.println(makeAllSums(4));
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
      if (index == current) {
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
    }

      //helper for the makeAllSums method.
    private static ArrayList<Integer> sumDigits(int sum, int partial, ArrayList<Integer> data) {
      if (sum == 0) {
        data.add(partial);
      }
      if (sum > 0) {
        sumDigits(sum - 1, partial  + sum, data);
        sumDigits(sum - 1, partial, data);
      }
      return data;
    }

}
