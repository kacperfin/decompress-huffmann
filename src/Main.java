import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String input;
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
                System.out.println("1");
            }
            else if(input.equals("2"))
            {
                System.out.println("2");
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