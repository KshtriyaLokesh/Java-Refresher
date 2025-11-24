
import java.util.Scanner;

public class ProfilAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        int cp =  sc.nextInt();
        System.out.print("Enter Selling Price : ");
        int sp = sc.nextInt();
        if(cp>sp){
            System.out.print("It's loss, it is : ");
            System.out.println((cp - sp) * 100 / cp + "%");
        }
        else if(cp<sp){
            System.out.print("It's Profit, it is : ");
            System.out.println((sp - cp) * 100 / sp + "%");
        }
        else System.out.println("no profit, no loss");
    }
}
