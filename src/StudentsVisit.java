
public class StudentsVisit {
  
  public static void main(String[] args) {
    try {
      Student student = new Student(new Combinatorics());
      int n = Integer.parseInt(args[0]);
      System.out.println(student.getNumVarsOfAttendance(n));
    }
    catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
