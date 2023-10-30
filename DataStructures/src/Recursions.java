public class Recursions {
  public static void main(String[] args) {
    System.out.println(totalWays(46));
  }

  public static int fact(int n) {
    if (n >= 1) {
      return n * fact(n - 1);
    } else {
      return 1;
    }
  }

  public static int fib(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 0) {
      return 0;
    }
    return fib(n - 1) + fib(n - 2);
  }

  public static int totalWays(int feet) {
    if (feet >= 3) {
      return totalWays(feet - 1) + totalWays(feet - 2);
    } else if (feet == 2) {
      return 2;
    } else {
      return 1;
    }
  }
}
