
import java.lang.Math;

/**
 *
 */
public class Combinatorics implements ICombinatorics {

  private long factorial(int n) throws Exception {
    if (n < 0) {
      throw new Exception("Attempt to get a factorial from a negative number"); 
    }
    long res = 1;
    for (int i = 2; i <= n; ++i) {
      res *= i;
    }
    return res;
  }
  
  @Override
  public long C(int n, int k) throws Exception {
    try {
      return factorial(n) / factorial(k) / factorial(n - k);
    }
    catch (Exception ex) {
      throw new Exception("Selection cannot be negative");
    }
  }

  @Override
  public long $A(int n, int k) throws Exception{
    if (n < 0 || k < 0) {
      throw new Exception("Selection cannot be negative");
    }
    return (long)Math.pow(n, k);
  }

}
