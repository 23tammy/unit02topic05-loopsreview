public class Main {
  public static String formGradeString(int[] grades) {
    String letterGrades = "";
    for (int percent : grades){
      if (percent >= 90){
        letterGrades = letterGrades + "A";
      }else if (percent >= 80){
        letterGrades = letterGrades + "B";
      }else if (percent >= 70){
        letterGrades = letterGrades + "C";
      }else if (percent >= 60){
        letterGrades = letterGrades + "D";
      }else{
        letterGrades = letterGrades + "F";
      }
    }
    return letterGrades;
  } 

  public static String valedictorianName(String[] names, double[] grades) {
    String val = "";
    double highest = grades[0];
    for (int i = 1; i < grades.length; i++){
      if (grades[i] > highest ){
        highest = grades[i];
        val = names[i];
      }
    }
    return val;
  }
  
  public static void main(String[] args) {
    // int[] gradeArray = {90, 88, 56, 77, 100, 60};
    // System.out.println(formGradeString(gradeArray));
    String[] names = {"emily", "albert", "tammy", "phillip", "ophelia", "sophie"};
    double[] grades = {0.223, 3.538, 4.0, 3.237, 1.437, 1.162};
    System.out.println(valedictorianName(names, grades));
  }
}