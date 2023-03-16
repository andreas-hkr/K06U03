import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            var scan = new Scanner(System.in);
            System.out.print("Talet? ");
            int talet = scan.nextInt();
            if (talet <= 0)
                break;
            boolean ärPrimtal = true;
            for (int k = 2; k<talet; k++)
                if (talet % k == 0)
                    ärPrimtal = false;
            if (ärPrimtal)
                System.out.println("Primtal");
            else
                System.out.println("Ej primtal");
        }
    }
}