import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String input;
        int result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey!");

        while(true)
        {
            System.out.println("Write \"1\" if you want to compress.\n" +
                    "Write \"2\" if you want to decompress.\n" +
                    "Write EXIT to exit the program.");

            input = scanner.nextLine();

            if(input.equals("1"))
            {
                System.out.println("Give me three arguments:");
                System.out.println("1. name of input file with the message to encode");


                result = Facade.compress();
                System.out.println(result);
            }
            else if(input.equals("2"))
            {
                result = Facade.decompress();
                System.out.println(result);
            }
            else if(input.equals("EXIT"))
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Incorrect input.");
            }
        }
    }
}