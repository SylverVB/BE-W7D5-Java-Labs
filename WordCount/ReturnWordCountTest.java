package WordCount;

public class ReturnWordCountTest {
    public static void main(String[] args) {
        ReturnWordCount r = new ReturnWordCount();
        
        System.out.println(r.count("Hello world")); // Output: 2
        System.out.println(r.count("  This is a test ")); // Output: 4
        System.out.println(r.count("")); // Output: 0
        System.out.println(r.count("    ")); // Output: 0
        System.out.println(r.count("SingleWord")); // Output: 1
    }
}