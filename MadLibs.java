import java.util.Scanner;

public class MadLibs {
    public static void main(String args[]) {
        Scanner keyboardInput = new Scanner(System.in);

        // Collecting user input
        String weather = getInput(keyboardInput, "Enter a weather condition: ");
        String colour = getInput(keyboardInput, "Enter a colour: ");
        String adjective = getInput(keyboardInput, "Enter an adjective: ");
        String noun = getInput(keyboardInput, "Enter a noun: ");
        String adverb = getInput(keyboardInput, "Enter an adverb: ");

        // Using StringBuilder to concatenate the story
        // StringBuilder is more efficient than using the + operator to concatenate strings
        // https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
        StringBuilder story = new StringBuilder();
        story.append("It is definitely possible we are living in a cyberpunk simulation. \n")
             .append("Have you seen all the ").append(weather).append(" we have been getting lately? \n")
             .append("Have you noticed how the colour ").append(colour).append(" has become so prevalent in our modern society? \n")
             .append("I think I can see the glitches in this ").append(adjective).append(" society \n")
             .append("If you listen closely, you can hear the ").append(noun).append(" ").append(adverb).append(". \n")
             .append("What has this world become? \n")
             .append("Will we be outperformed by our own brains?");
                
        
        // Displaying the story
        System.out.println("\n" + story);
        
        // Closing the scanner
        keyboardInput.close();
    }
    
    // Helper methods for collecting user input and generating the story
    private static String getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}