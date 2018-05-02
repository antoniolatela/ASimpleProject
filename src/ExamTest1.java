/**
 * Created by alatel01 on 02/05/2018.
 */
public class ExamTest1 {
    public boolean isReverse (String a, String b) {
        if ((a.length() == b.length()) && a.length() == 0) return true;
        if (a.length() != b.length()) return false;
        if ((a.length() == b.length()) && a.length() == 1 && a.equals(b)) {
            return true;
        } else if (a.charAt(0) == b.charAt(b.length()-1)) {
            return isReverse(a.substring(1, a.length()), b.substring(0, b.length()-1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ExamTest1().isReverse("AbBa", "aBbA"));
    }
}
