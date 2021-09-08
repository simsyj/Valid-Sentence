import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        boolean valid = validator.validateSentence(sentence);

        if(valid)
            System.out.println("You have entered a valid sentence");
        else
            System.out.println("You have entered an invalid sentence");
    }
}
