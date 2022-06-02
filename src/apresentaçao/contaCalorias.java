package apresentaçao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contaCalorias {

	private static final Scanner scanner = new Scanner(System.in);
	private static String diaSemana;

	public static void main(String[] args) {

		List<Integer> listaKcalSemana = new ArrayList<Integer>();
		List<Integer> kcalPorRefeição = new ArrayList<Integer>();
		String diaSemana = "";
		int total = 0;
		int kcal = 0;

		do {

			System.out.print("Informe o dia da semana:");
			diaSemana = scanner.next();
			if (!diaSemana.equals("0")) {

				System.out.print("Informe a quantidade de calorias que deverão ser consumidas:");
				kcal = scanner.nextInt();
				
				int soma = somaDia(kcal);
				listaKcalSemana.add(kcal);
			}

		} while (!diaSemana.equals("0"));

		int somaSemana = 0;

		for (int i = 0; i < listaKcalSemana.size(); i++) {
			somaSemana = somaSemana + listaKcalSemana.get(i);

		}
		System.out.println("Você consumiu "+somaSemana+" calorias durante a semana!");

		System.out.println("Fim do programa");
	}

	private static int somaDia(int kcal) {
		int ref = 0;
		int total = 0;
		List<Integer> kcalPorRefeição = new ArrayList<Integer>();
		do {

			System.out.println("\nDigite a quantidade de calorias consumidas nessa refeição:");
			ref = scanner.nextInt();
			kcalPorRefeição.add(ref);
		} while (ref != 0);

		for (int i = 0; i < kcalPorRefeição.size(); i++) {
			total = total + kcalPorRefeição.get(i);
		}

		if (total > kcal) {
			System.out.println("Você consumiu " + (total - kcal) + " calorias a mais do que o programado!\n");

		} else if (total == kcal) {
			System.out.println("Você consumiu as calorias diárias!\n");

		} else {
			System.out.println("Você consumiu " + total + " calorias, ainda faltam " + (kcal - total) + "!\n");
		}

		return total;
	}
}
