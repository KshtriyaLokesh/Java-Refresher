
import java.util.Scanner;

public class ProfilAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp =  sc.nextInt();
        int sp = sc.nextInt();
        if(cp>sp){
            System.out.println("It's loss");
            System.out.println((cp - sp) * 100 / cp);
        }
        else {
            System.out.println("It's Profit");
            System.out.println((sp - cp) * 100 / sp);
        }
    }
}
