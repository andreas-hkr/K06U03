import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Talet? ");
        int talet = scan.nextInt();

        for (int i = 1; i <= talet; i++) {
            boolean ärPrimtal = true;
            for (int k = 2; k<i; k++)
                if (i % k == 0)
                    ärPrimtal = false;
            if (ärPrimtal)
                System.out.print(i + " ");
        }
    }
}