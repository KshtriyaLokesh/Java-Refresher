import java.util.Scanner;

public class IsFourDigit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if( a/1000 >= 1 && a/1000 <= 9)
        {
            System.out.println("it's a four digit number");
        }
        else System.out.println("it's not a four digit number");

    }
}
