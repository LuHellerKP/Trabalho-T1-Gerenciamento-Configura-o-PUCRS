import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Beecrowd line:
        // Scanner input = new Scanner(System.in);
        // Local Testing Line:
        Scanner input = new Scanner(System.in);
        int vitoriasAdalberto = 0;
        int vitoriasBernadete = 0;

        int partidas = input.nextInt();
        int decorridas = 1;
        int a1, a2 = 0, a3 = 0, b1 = 0, b2 = 0, b3 = 0;
        while (partidas >= decorridas) {
            int rodadaAdalberto = 0;
            int rodadaBernadete = 0;

            a1 = input.nextInt();
            a2 = input.nextInt();
            a3 = input.nextInt();
            b1 = input.nextInt();
            b2 = input.nextInt();
            b3 = input.nextInt();
            if (a1 == 12 || a2 == 12 || a3 == 12 || b1 == 12 || b2 == 12 || b3 == 12 ||
                    a1 == 11 || a2 == 11 || a3 == 11 || b1 == 11 || b2 == 11 || b3 == 11 ||
                    a1 == 1 || a2 == 1 || a3 == 1 || b1 == 1 || b2 == 1 || b3 == 1 ||
                    a1 == 2 || a2 == 2 || a3 == 2 || b1 == 2 || b2 == 2 || b3 == 2 ||
                    a1 == 3 || a2 == 3 || a3 == 3 || b1 == 3 || b2 == 3 || b3 == 3) {

                if (a1 == 12) {
                    a1 = 11;

                }
                if (a2 == 12) {
                    a2 = 11;

                }
                if (a3 == 12) {
                    a3 = 11;

                }
                if (b1 == 12) {
                    b1 = 11;

                }
                if (b2 == 12) {
                    b2 = 11;

                }
                if (b3 == 12) {
                    b3 = 11;

                }
                //
                if (a1 == 11) {
                    a1 = 12;

                }
                if (a2 == 11) {
                    a2 = 12;

                }
                if (a3 == 11) {
                    a3 = 12;

                }
                if (b1 == 11) {
                    b1 = 12;

                }
                if (b2 == 11) {
                    b2 = 12;

                }
                if (b3 == 11) {
                    b3 = 12;

                }
                //
                if (a1 == 1) {
                    a1 = 14;

                }
                if (a2 == 1) {
                    a2 = 14;

                }
                if (a3 == 1) {
                    a3 = 14;

                }
                if (b1 == 1) {
                    b1 = 14;

                }
                if (b2 == 1) {
                    b2 = 14;

                }
                if (b3 == 1) {
                    b3 = 14;

                }
                //
                if (a1 == 2) {
                    a1 = 15;

                }
                if (a2 == 2) {
                    a2 = 15;

                }
                if (a3 == 2) {
                    a3 = 15;

                }
                if (b1 == 2) {
                    b1 = 15;

                }
                if (b2 == 2) {
                    b2 = 15;

                }
                if (b3 == 2) {
                    b3 = 15;

                }
                //
                if (a1 == 3) {
                    a1 = 16;

                }
                if (a2 == 3) {
                    a2 = 16;

                }
                if (a3 == 3) {
                    a3 = 16;

                }
                if (b1 == 3) {
                    b1 = 16;

                }
                if (b2 == 3) {
                    b2 = 16;

                }
                if (b3 == 3) {
                    b3 = 16;

                }
            }
            if (a1 >= b1) {
                rodadaAdalberto++;

            }
            if (b1 > a1) {
                rodadaBernadete++;

            }
            if (a2 >= b2) {
                rodadaAdalberto++;

            }
            if (b2 > a2) {
                rodadaBernadete++;

            }
            if (a3 >= b3) {
                rodadaAdalberto++;

            }
            if (b3 > a3) {
                rodadaBernadete++;

            }

            if (rodadaAdalberto >= rodadaBernadete)
                vitoriasAdalberto++;
            else
                vitoriasBernadete++;
            decorridas++;
        }
        System.out.print(vitoriasAdalberto + " " + vitoriasBernadete);
    }
}
