package EX01_06;

public class EX01_06 {
    public static void main(String[] args) {
        int i = 8;
        int j = i++; // j becomes 8 and then i becomes 9
        int k = ++i; // i becomes 10 and then k becomes 10
        int m = i--; // m becomes 10 and then 9 becomes 9
        int n = 9 + --i; // i becomes 8 and then n becomes 17
    }
}
