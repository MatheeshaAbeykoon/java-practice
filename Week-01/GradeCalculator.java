public class GradeCalculator {

    public static void main(String[] args) {

        int marks = 85;

        if (marks >= 75) {
            System.out.println("Grade A");
        } else if (marks >= 65) {
            System.out.println("Grade B");
        } else if (marks >= 55) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade S");
        } else {
            System.out.println("Grade F");
        }

    }

}
