package RemoveAllCharactersLab;

public class RemoveAllCharactersTest {
    public static void main(String[] args) {
        // Create an instance of RemoveAllCharacters
        RemoveAllCharacters rac = new RemoveAllCharacters();

        // Test cases
        String input1 = "abcdef";
        String removed1 = "c";
        System.out.println("Input: " + input1 + ", Remove: " + removed1);
        System.out.println("Output: " + rac.removeAll(input1, removed1)); // Expected: "abdef"

        String input2 = "gorilla";
        String removed2 = "l";
        System.out.println("\nInput: " + input2 + ", Remove: " + removed2);
        System.out.println("Output: " + rac.removeAll(input2, removed2)); // Expected: "goria"

        String input3 = "banana";
        String removed3 = "a";
        System.out.println("\nInput: " + input3 + ", Remove: " + removed3);
        System.out.println("Output: " + rac.removeAll(input3, removed3)); // Expected: "bnn"

        // Additional custom test case
        String input4 = "hello world";
        String removed4 = "o";
        System.out.println("\nInput: " + input4 + ", Remove: " + removed4);
        System.out.println("Output: " + rac.removeAll(input4, removed4)); // Expected: "hell wrld"
    }
}