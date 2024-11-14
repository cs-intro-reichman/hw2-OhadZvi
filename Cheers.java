// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String input = args[0].toUpperCase();
            String anLetters = "AEFHILMNORSX";
            for (int i = 0; i < input.length(); i++) {
                System.out.print("Give me a");
                if (anLetters.indexOf(input.charAt(i)) != -1) {
                        System.out.print("n");                       
                }
                else {
                        System.out.print(" ");
                }
                System.out.println(" " + input.charAt(i) + ": " + input.charAt(i) + "!");
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < Integer.parseInt(args[1]); i++) {
                System.out.println(input + "!!!");
            }
        }
}
