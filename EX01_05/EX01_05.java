package EX01_05;

public class EX01_05 {
    public static void main(String[] args) {
        int j = 8;
        Integer a = new Integer(12);
        int k = a; // implicit call to a.intValue()
        int m = j+a; // a is automatically unboxed before the addition
        a = 3 * m; // result is automatically boxed before the assignment
        Integer b - new Integer("-135"); // constructor accepts a String
        int n = Integer.parseInt("2013"); // using static method of Integer class
    }
}
