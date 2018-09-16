
/**
 * Provides an interface for combinatorics formulas
 */
public interface ICombinatorics {
  
  /**
   * The number of combinations without repeating n!/k!/(n-k)!
   * 
   * @param n all elements of a set
   * @param k chosen elements
   * @return
   */
  long C(int n, int k) throws Exception;
  
  /**
   * The number of variations with repeating n^k
   * 
   * @param n all elements of a set
   * @param k chosen elements
   * @return
   */
  long $A(int n, int k) throws Exception;
}
