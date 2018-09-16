
/**
 *
 */
public class Student {
  
  private static int numOfAttendrTypes = 3;
  
  private ICombinatorics _comb;
  
  public Student(ICombinatorics comb) {
    this._comb = comb;
  }
  
  /**
   * Ā(n, 3)-C(n, 2)*Ā(n-2, 2)-C(n, 3)*Ā(n - 3, 2)-...-C(n, n)*Ā(n - n, 2)-
   * -C(n-1, 1)*Ā(n - 2, 2)-C(n-2, 1)*Ā(n - 3, 2)-...-C(n-n+1, 1)*Ā(n - n, 2)
   * 
   * @param numOfLessons a number of lessons
   * @return a number of variants of attendance when a student can take an exam
   */
  public long getNumVarsOfAttendance(int numOfLessons) throws Exception {
    long res = this._comb.$A(numOfAttendrTypes, numOfLessons);
    for (int i = 2; i <= numOfLessons;  ++i) {
      res -= 
          (this._comb.C(numOfLessons, i) + 
           this._comb.C(numOfLessons - i + 1, 1)) *
           this._comb.$A(numOfAttendrTypes - 1, numOfLessons - i);
    }
    return res;
  }
}
