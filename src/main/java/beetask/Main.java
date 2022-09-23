package beetask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		String pathname = (((args == null) || (args.length == 0)) ? "fiveMatches.txt" : args[0]);
		getResults(pathname);
	}

	public static int[] getResults(String pathname) throws FileNotFoundException {
		// Beecrowd line:
		// Scanner input = new Scanner(System.in);
		// Local Testing Lines (following two):
		pathname = (((pathname == null) || (pathname.length() == 0)) ? "fiveMatches.txt" : pathname);
		Scanner input = new Scanner(new File(pathname));

		int vitoriasAdalberto = 0;
		int vitoriasBernadete = 0;
		int partidas = Integer.parseInt(input.nextLine());
		int decorridas = 0;
		int a1;
		int a2;
		int a3;
		int b1;
		int b2;
		int b3;

		while (partidas > decorridas) {
			int rodadaAdalberto = 0;
			int rodadaBernadete = 0;
			String[] line = input.nextLine().split(" ");
			a1 = Integer.parseInt(line[0]);
			a2 = Integer.parseInt(line[1]);
			a3 = Integer.parseInt(line[2]);
			b1 = Integer.parseInt(line[3]);
			b2 = Integer.parseInt(line[4]);
			b3 = Integer.parseInt(line[5]);

			if (areSymbol(a1, a2, a3, b1, b2, b3)) {
				if (a1 == 12)
					a1 = 11;
				else if (a1 == 11)
					a1 = 12;
				else if (a1 == 1)
					a1 = 14;
				else if (a1 == 2)
					a1 = 15;
				else if (a1 == 3)
					a1 = 16;

				if (a2 == 12)
					a2 = 11;
				else if (a2 == 11)
					a2 = 12;
				else if (a2 == 1)
					a2 = 14;
				else if (a2 == 2)
					a2 = 15;
				else if (a2 == 3)
					a2 = 16;

				if (a3 == 12)
					a3 = 11;
				else if (a3 == 11)
					a3 = 12;
				else if (a3 == 1)
					a3 = 14;
				else if (a3 == 2)
					a3 = 15;
				else if (a3 == 3)
					a3 = 16;

				if (b1 == 12)
					b1 = 11;
				else if (b1 == 11)
					b1 = 12;
				else if (b1 == 1)
					b1 = 14;
				else if (b1 == 2)
					b1 = 15;
				else if (b1 == 3)
					b1 = 16;

				if (b2 == 12)
					b2 = 11;
				else if (b2 == 11)
					b2 = 12;
				else if (b2 == 1)
					b2 = 14;
				else if (b2 == 2)
					b2 = 15;
				else if (b2 == 3)
					b2 = 16;

				if (b3 == 12)
					b3 = 11;
				else if (b3 == 11)
					b3 = 12;
				else if (b3 == 1)
					b3 = 14;
				else if (b3 == 2)
					b3 = 15;
				else if (b3 == 3)
					b3 = 16;
			}

			if (a1 >= b1)
				rodadaAdalberto++;
			else
				rodadaBernadete++;

			if (a2 >= b2)
				rodadaAdalberto++;
			else
				rodadaBernadete++;

			if (a3 >= b3)
				rodadaAdalberto++;
			else
				rodadaBernadete++;

			if (rodadaAdalberto >= rodadaBernadete)
				vitoriasAdalberto++;
			else
				vitoriasBernadete++;
			decorridas++;
		}

		int[] results = { vitoriasAdalberto, vitoriasBernadete };
		System.out.println(vitoriasAdalberto + " " + vitoriasBernadete);
		return results;
	}

	private static boolean areSymbol(int a1, int a2, int a3, int b1, int b2, int b3) {
		return (a1 == 12 || a2 == 12 || a3 == 12 || b1 == 12 || b2 == 12 || b3 == 12 ||
				a1 == 11 || a2 == 11 || a3 == 11 || b1 == 11 || b2 == 11 || b3 == 11 ||
				a1 == 1 || a2 == 1 || a3 == 1 || b1 == 1 || b2 == 1 || b3 == 1 ||
				a1 == 2 || a2 == 2 || a3 == 2 || b1 == 2 || b2 == 2 || b3 == 2 ||
				a1 == 3 || a2 == 3 || a3 == 3 || b1 == 3 || b2 == 3 || b3 == 3);
	}
}
