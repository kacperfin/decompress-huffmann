import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String input;
        int result;
        String input_name;
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
                System.out.println("Give me the name of input file with the message to encode");
                input_name = scanner.nextLine();

                result = Facade.compress(input_name);

                System.out.println(result); //0 means there are no errors
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