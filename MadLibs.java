import java.util.Scanner;

public class MadLibs
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a weather condition: ");
        String weather = keyboardInput.nextLine();
        System.out.print("Enter a colour: ");
        String colour = keyboardInput.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = keyboardInput.nextLine();
        System.out.print("Enter a noun: ");
        String noun = keyboardInput.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = keyboardInput.nextLine();

        System.out.println("It is definitely possible we are living in a cyberpunk simulation. \n"
        + "Have you seen all the "+ weather +" we have been getting lately? \n"
        + "Have you noticed how the colour "+ colour +" has become so prevalent in our modern society? \n"
        + "I think I can see the glitches in this "+ adjective +" society \n"
        + "If you listen closely, you can hear the "+ noun +" "+ adverb +" \n"
        + "What has this world become? \n"
        + "Will we be outperformed by our own brains?");
    }
}