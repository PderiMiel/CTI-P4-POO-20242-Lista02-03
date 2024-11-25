package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_min, nht, coeficiente, sal_bruto, imposto, grat, auxilio, sal_liq;
		String turno, categoria;
		
		System.out.println("Digite o salário minimo: ");
		sal_min = sc.nextDouble();
		System.out.println("Digite o turno (M, V ou N): ");
		turno = sc.next().toUpperCase();
		System.out.println("Digite a categoria (O ou G): ");
		categoria = sc.next().toUpperCase();
		System.out.println("Digite o número de horas trabalhadas: ");
		nht = sc.nextDouble();
		
		if (turno == "M") {
			coeficiente = 10/100 * sal_min;
		} else if (turno == "V") {
			coeficiente = 15/100 * sal_min;
		} else if (turno == "N") {
			coeficiente = 12/100 * sal_min;
		} else {
			coeficiente = 0;
		}
		System.out.println("Coeficiente: " + coeficiente);
		sal_bruto = nht * coeficiente;
		System.out.println("Salário bruto: ");

	}

}
