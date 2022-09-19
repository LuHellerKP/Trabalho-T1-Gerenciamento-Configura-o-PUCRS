import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Beecrowd line:
        // Scanner input = new Scanner(System.in);
        // Local Testing Line:
        Scanner input = new Scanner(new File("entry.txt"));
        int vitoriasAdalberto = 0;
        int vitoriasBernadete = 0;
        int partidas = Integer.parseInt(input.nextLine());
        int decorridas = 1;
        while (partidas >= decorridas) {
            System.out.println("Partida "+decorridas);
            String[] line = input.nextLine().split(" ");
            int vA = 0, vB = 0;
            for (int i = 0; i < 3; i++) {
                if (Integer.parseInt(line[i]) >= Integer.parseInt(line[i + 3]))
                    vA++;
                else
                    vB++;
            }
            if (vA >= vB)
                vitoriasAdalberto++;
            else
                vitoriasBernadete++;
            decorridas++;
        }
        System.out.print(vitoriasAdalberto + " " + vitoriasBernadete);
    }
}