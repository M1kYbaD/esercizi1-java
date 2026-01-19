package main;

import java.time.LocalDate;
import java.util.Random;

import arrays.ArrayMethods;
import arrays.matrix.Anagrafica;

//import java.util.Iterator;

import arrays.matrix.MatrixMethods;

public class Main {

	public static void main(String[] args) {

		// Array con 'int' di esempio
		int[] arr1 = { 23, 32, 67, 94, 16, 59, 8, 41, 158, 75, 4, 33 };
		int[] arr2 = { 6, 13, 39, 45, 56, 77, 81, 94, 182, 756 };
		int[] arr3 = { 14, 20, 89, 142, 38, 56 };
		int[] arr4 = { 6, 64, 945, 412, 51, 79, 22, 64, 385, 36 };

		// Array con 'float' di esempio
		float[] arrFl1 = { 24.5f, 65.9f, 13.4f, 76.3f, 42.7f, 51.8f };
		float[] arrFl2 = { 1.23f, 42.56f, 7.89f, 3.45f, 68.78f };
		float[] arrFl3 = { 3.14f, 1.618f, 0.577f, 2.718f };

		// Array con 'stringhe' di esempio
		String[] arrSt1 = { "Roma", "Milano", "Napoli", "Roma", "Firenze", "Bologna" };
		String[] arrSt2 = { "Rosso", "Verde", "Blu", "Giallo", "Viola", "Blu" };
		String[] arrSt3 = { "Sedia", "Tavolo", "Penna", "Telefono", "Lampada", "Libro", "Occhiali", "Chiavi" };

		ArrayMethods.stampIntArr(arr1);
		ArrayMethods.stampIntArr(arr2);
		ArrayMethods.stampIntArr(arr3);
		System.out.println(); // Separatore output
		ArrayMethods.stampStrArr(arrSt1);
		ArrayMethods.stampStrArr(arrSt2);
		ArrayMethods.stampStrArr(arrSt3);
		System.out.println();
		//
		ArrayMethods.sumIntArray(arr1); // Es 1
		ArrayMethods.maxIntArray(arr1); // Es2
		ArrayMethods.minIntArray(arr1); // Es 3
		ArrayMethods.medIntArray(arr1); // Es 4.1
		System.out.println();
		//
		ArrayMethods.sumIntArray(arr2);
		ArrayMethods.maxIntArray(arr2);
		ArrayMethods.minIntArray(arr2);
		ArrayMethods.medIntArray(arr2);
		System.out.println();
		//
		ArrayMethods.sumIntArray(arr3);
		ArrayMethods.maxIntArray(arr3);
		ArrayMethods.minIntArray(arr3);
		ArrayMethods.medIntArray(arr3);
		System.out.println();
		//
		ArrayMethods.stampFltArr(arrFl1);
		ArrayMethods.stampFltArr(arrFl2);
		ArrayMethods.stampFltArr(arrFl3);
		System.out.println();
		//
		ArrayMethods.medFloatArray(arrFl1); // Es 4
		ArrayMethods.medFloatArray(arrFl2);
		ArrayMethods.medFloatArray(arrFl3);
		System.out.println();
		//
		ArrayMethods.copyElementInNewArray(arr1); // Es 6
		ArrayMethods.copyElementInNewArray(arr2);
		//
		ArrayMethods.verificaElementoArray(arr1, 41); // Es 7
		ArrayMethods.verificaElementoArray(arr2, 77);
		ArrayMethods.verificaElementoArray(arr1, 2); // Es 7
		ArrayMethods.verificaElementoArray(arr2, 300);
		//
		System.out.println();
		//
		ArrayMethods.invertElementsArray(arr1); // Es 8
		ArrayMethods.invertElementsArray(arr2);
		//
		ArrayMethods.sommaDuePerVolta(arr2, arr4); // Es 9
		ArrayMethods.sommaDuePerVolta(arr3, arr4);
		System.out.println();
		//
		ArrayMethods.trovaPosElement(arr1, 16); // Es 10
		ArrayMethods.trovaPosElement(arr1, 60);
		ArrayMethods.trovaPosElement(arr2, 94);
		ArrayMethods.trovaPosElement(arr2, 200);
		System.out.println();

		// Matrici di 'int'
		int[][] matrice = { {}, {}, {}, {}, {} }; // Inizializzata ma vuota
		int[][] matrice1 = { { 14, 22, 38, 6 }, { 41, 57, 66, 294 }, { 73, 84, 90, 142 }, { 2, 46, 71, 30 } };
		int[][] matrice2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrice3 = { { 54, 87, 12, 5 }, { 69, 76, 33, 290 } };
		int[][] matrice4 = { { 2, 3, 8 }, { 7, 6, 7 }, { 4, 9, 6 } };
		int[][] matrice5 = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24, 25, 26, 27 }, { 28, 29, 30, 31, 32, 33, 34, 35, 36 },
				{ 37, 38, 39, 40, 41, 42, 43, 44, 45 }, { 46, 47, 48, 49, 50, 51, 52, 53, 54 },
				{ 55, 56, 57, 58, 59, 60, 61, 62, 63 }, { 64, 65, 66, 67, 68, 69, 70, 71, 72 },
				{ 73, 74, 75, 76, 77, 78, 79, 80, 81 } };
		int[][] matrice6 = { { 3, 7, 1, 0, 9, 4, 2, 6, 8, 5 }, { 5, 2, 6, 3, 1, 0, 9, 7, 4, 8 },
				{ 8, 0, 4, 7, 5, 2, 6, 1, 3, 9 }, { 1, 9, 3, 6, 8, 7, 0, 5, 2, 4 }, { 4, 6, 2, 9, 0, 3, 5, 8, 7, 1 },
				{ 7, 5, 0, 8, 2, 6, 1, 9, 3, 4 }, { 2, 3, 9, 5, 4, 1, 8, 0, 6, 7 }, { 6, 1, 8, 2, 7, 9, 3, 4, 5, 0 },
				{ 0, 8, 5, 1, 6, 4, 7, 3, 9, 2 }, { 9, 4, 7, 0, 3, 5, 6, 2, 1, 8 } };
		int[][] matricePitagora = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 },
				{ 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 }, { 4, 8, 12, 16, 20, 24, 28, 32, 36, 40 },
				{ 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 }, { 6, 12, 18, 24, 30, 36, 42, 48, 54, 60 },
				{ 7, 14, 21, 28, 35, 42, 49, 56, 63, 70 }, { 8, 16, 24, 32, 40, 48, 56, 64, 72, 80 },
				{ 9, 18, 27, 36, 45, 54, 63, 72, 81, 90 }, { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 } };
		int[][] matriceScacchiera = { { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 } };
		int[][] matriceScacchieraInvertita = { { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 } };
		int[][] matriceDiagonaliUguali = { { 1, 0, 0, 0, 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0, 0, 0, 1, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 1 } };
		int[][] matricePalindroma = { { 12, 40, 8, 24, 13, 7 }, { 5, 25, 17, 7, 5, 8 }, { 79, 42, 30, 40, 27, 20 },
				{ 33, 55, 41, 26, 43, 40 }, { 6, 13, 9, 15, 20, 4 }, { 64, 22, 5, 4, 5, 4 } };
		int[][] matrice7X7ConZero = { { 60, 0, 0, 0, 0, 42, 7 }, { 0, 30, 40, 0, 88, 0, 15 }, { 40, 0, 0, 0, 0, 63, 0 },
				{ 20, 0, 0, 91, 0, 0, 54 }, { 50, 0, 77, 0, 20, 0, 0 }, { 0, 36, 0, 0, 0, 0, 81 },
				{ 59, 10, 80, 70, 10, 90, 99 } };
		int[][] matrice5X5 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int[][] matrice6X6 = { { 1, 2, 3, 4, 5, 60 }, { 7, 8, 9, 10, 11, 120 }, { 13, 14, 15, 16, 17, 180 },
				{ 19, 20, 21, 22, 23, 240 }, { 25, 26, 27, 28, 29, 300 }, { 31, 32, 33, 34, 35, 360 } };
		int[][] matriceBordi1 = { { 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
		int[][] matrice8X8 = { { 1, 2, 2, 2, 2, 2, 2, 2 }, { 2, 1, 2, 2, 2, 2, 2, 2 }, { 2, 2, 1, 2, 2, 2, 2, 2 },
				{ 2, 2, 2, 1, 2, 2, 2, 2 }, { 2, 2, 2, 2, 1, 2, 2, 2 }, { 2, 2, 2, 2, 2, 1, 2, 2 },
				{ 2, 2, 2, 2, 2, 2, 1, 2 }, { 2, 2, 2, 2, 2, 2, 2, 1 } };
		int[][] matrice1A4X4 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] matrice2A4X4 = { { 45, 13, 2, 78 }, { 29, 53, 18, 9 }, { 84, 36, 6, 57 }, { 48, 3, 2, 1 } };
		int[][] matriceBinaria = { { 0, 0, 1, 0, 1, 1, }, { 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 0 },
				{ 0, 1, 0, 1, 1, 0 }, { 1, 1, 0, 1, 0, 0 }, { 0, 0, 0, 1, 1, 1 } };
		int[][] matricePerRiga = { { 1, 1, 2, 4, 8 }, { 3, 3, 6, 12, 24 }, { 5, 5, 10, 20, 40 }, { 2, 2, 4, 8, 16 },
				{ 7, 7, 14, 28, 56 } };
		int[][] matriceIdentita = { { 1, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0, 1 } };
		int[][] matrice7 = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6, 7 }, { 4, 5, 6, 7, 8 },
				{ 5, 6, 7, 8, 9 } };
		int[][] matriceProdInd = { { 0, 0, 0, 0, 0 }, { 0, 1, 2, 3, 4 }, { 0, 2, 4, 6, 8 }, { 0, 3, 6, 9, 12 },
				{ 0, 4, 8, 12, 16 } };
		int[][] matriceUniPariPerRiga = { { 1, 0, 1, 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 1 }, { 1, 0, 0, 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0, 0, 1, 0 } };
		int[][] matriceA = { { 12, 87, 45, 133, 29, 76 }, { 101, 5, 64, 150, 38, 92 }, { 47, 120, 11, 66, 143, 8 },
				{ 33, 99, 72, 14, 135, 60 }, { 88, 23, 149, 6, 121, 41 }, { 19, 137, 53, 70, 95, 132 } };
		int[][] matriceB = { { 34, 142, 17, 89, 76, 121 }, { 58, 3, 147, 25, 132, 66 }, { 91, 44, 109, 12, 73, 150 },
				{ 6, 138, 27, 119, 84, 41 }, { 123, 59, 98, 2, 145, 36 }, { 70, 115, 20, 134, 9, 87 } };
		int[][] matriceA2 = { { 320, -150, 33, 475, -230 }, { -90, 410, 250, -75, 500 }, { 120, -200, 300, 0, -100 },
				{ -250, 85, -50, 400, 1 }, { 500, -175, 0, 330, -90 }, { 45, 275, -240, 15, 180 } };
		int[][] matriceB2 = { { -200, 75, 25, 300, 100 }, { 120, -60, 500, 90, -250 }, { 400, 50, -125, -25, 200 },
				{ 30, -100, 60, 15, 500 }, { -45, 220, 10, -30, 150 }, { 90, 0, 1, 59, 250 } };
		int[][] matriceA2Bis = new int[6][5]; // DA VALORIZZARE CON 'RANDOM'
		int[][] matriceB2Bis = new int[6][5]; // DA VALORIZZARE CON 'RANDOM'

		// Matrici di 'String'
		String[][] matrStr = { { "Ciao", "Palla", "Gamba" }, { "Ciao", "Ciao", "Libro" },
				{ "Cappello", "Ciao", "Ciao" }, { "Auto", "Moto", "Ciao" }, { "Ciao", "Ciao", "Matita" } };
		String[][] matrStr2 = { { "Alice", "Blu", "Roma", "Felicità" }, { "Bob", "Verde", "Tokyo", "Cinema" },
				{ "Charlie", "Rosso", "New York", "Sorpresa" }, { "Diana", "Giallo", "Sydney", "Pace" } };
		String[][] matrStr3 = { { "carla", "abba", "fucile" }, { "fanta", "bar", "cerchio" },
				{ "giulio", "pezzo", "abcd" } };
		String[][] matrStr4 = { { "caccia", "fresco", "donato" }, { "rubino", "brezza", "giusto" },
				{ "mister", "lancio", "amante" } };

		// Matrice 'Anagrafica' con oggetti della classe Anagrafica
		Anagrafica[][] matrAnag = new Anagrafica[2][3];

		matrAnag[0][0] = new Anagrafica("Luca", "Rossi", 'M', LocalDate.of(1981, 3, 15), "Roma", "RASSLU970X");
		matrAnag[0][1] = new Anagrafica("Sara", "Bianchi", 'F', LocalDate.of(1985, 7, 22), "Milano", "BNDRA2050Y");
		matrAnag[0][2] = new Anagrafica("Marco", "Verdi", 'M', LocalDate.of(1981, 12, 5), "Napoli", "VRCB8T439Z");

		matrAnag[1][0] = new Anagrafica("Giulia", "Neri", 'F', LocalDate.of(1995, 1, 10), "Torino", "NROIGL599W");
		matrAnag[1][1] = new Anagrafica("Paolo", "Ferrari", 'M', LocalDate.of(1988, 6, 30), "Genova", "FC2RA8D96K");
		matrAnag[1][2] = new Anagrafica("Anna", "Costa", 'F', LocalDate.of(1979, 11, 3), "Bologna", "CSAL5N044J");

		// Stampa matrice
		Anagrafica.stampMatrStr(matrAnag);

		MatrixMethods objmat = new MatrixMethods();
		objmat.stampMatrInt(matrice1);
		objmat.stampMatrInt(matrice2);
		objmat.stampMatrInt(matrice3);
		objmat.stampMatrInt(matrice4);
		objmat.stampMatrScacchiera(matriceScacchiera);
		objmat.stampMatrScacchieraInvertita(matriceScacchieraInvertita);
		objmat.stampMatrInt(matriceDiagonaliUguali);
		objmat.stampMatrInt(matrice5X5);
		objmat.stampMatrInt(matrice6X6);
		objmat.stampMatrInt(matriceBordi1);
		objmat.stampMatrInt(matriceA);
		objmat.stampMatrInt(matriceB);
		objmat.stampMatrInt(matriceA2);
		objmat.stampMatrInt(matriceB2);
		objmat.stampMatrInt(matrice7X7ConZero);
		objmat.stampMatrInt(matrice8X8);
		objmat.stampMatrInt(matrice1A4X4);
		objmat.stampMatrInt(matrice2A4X4);
		objmat.stampMatrInt(matriceBinaria);
		objmat.stampMatrInt(matricePerRiga);
		objmat.stampMatrInt(matriceIdentita);
		objmat.stampMatrInt(matrice7);
		objmat.stampMatrInt(matriceProdInd);
		objmat.stampMatrInt(matriceUniPariPerRiga);
		objmat.stampMatrStr(matrStr);
		objmat.stampMatrStr(matrStr2);
		objmat.stampMatrStr(matrStr3);
		objmat.stampMatrStr(matrStr4);

		objmat.verificaElemArrInMatr(arr3, matrice1);
		objmat.verificaElemArrInMatr(arr1, matrice2);
		objmat.verificaElemArrInMatr(arr2, matrice3);
		objmat.verificaElemArrInMatr(arr3, matrice4);
		//
		objmat.contOccStrMatr(matrStr, "Ciao");
		objmat.contOccCharMatr(matrStr2, 'o');
		System.out.println();
		objmat.confrontoPariDispari(matrice1);
		objmat.confrontoPariDispari(matrice2);
		objmat.confrontoPariDispari(matrice3);
		objmat.confrontoPariDispari(matrice4);

		/*
		 * ArrayMethods objnum = new ArrayMethods(); objnum.rappCoppieNum(100,5);
		 * objnum.rappCoppieNum(40,10); objnum.rappCoppieNum(750,2);
		 * objnum.rappCoppieNum(1000,10);
		 */

		objmat.stampMatrInt(matrice6);
		objmat.tavolaPitagora(matricePitagora);
		objmat.verificaElemArrInMatr(arr4, matrice5);
		objmat.verificaElemMatr9x9(matrice5, 59);
		objmat.verificaElemMatr9x9(matrice5, 259);
		objmat.contZeroMatr(matrice6);
		objmat.trovaMaxSumRowCol(matrice1);
		objmat.verificaIntervalloCelle(matrice1, 0, 300);
		objmat.creaDiagonaleMatrice();
		System.out.println(objmat.verificaScacchiera(matriceScacchiera));
		System.out.println(objmat.verificaScacchieraInvertita(matriceScacchieraInvertita));
		System.out.println("- Le somme delle diagonali si equivalgono? " + "'"
				+ objmat.sommeDiagonaliUguali(matriceDiagonaliUguali) + "'");
		System.out.println("- La matrice è 'palindroma'? " +
				objmat.verificaMatrPalindroma(matricePalindroma));
		System.out.println("- Questa matrice è composta prevalentemente da '0'? "
				+ objmat.verificaPrevalenzaZero(matrice7X7ConZero));
		objmat.calcolaMaxRowElem(matrice6X6);
		objmat.trovaCordMinInt(matrice8X8);
		objmat.calcolaProdottoSottoDiagPrin(matrice8X8);
		objmat.sommaMatr4X4(matrice1A4X4, matrice2A4X4);
		objmat.calcoloMatrBin(matriceBinaria);
		String result = objmat.confrontaSommeDiagonale(matrice5X5);
		System.out.println(result);
		System.out.println("- I bordi sono uguali? '" +
				objmat.verificaStessoValoreBordi(matriceBordi1) + "'");
		System.out.println("- La matrice rispetta la CONDIZIONE? '" +
				objmat.verificaMatricePerRiga(matricePerRiga) + "'");
		System.out.println("- E' una matrice identità? '" +
				objmat.verificaIsMatrIdentita(matriceIdentita) + "'");
		System.out.println("- La matrice rispetta la proprietà data? '" +
				objmat.verificaCellaNonMagg(matrice7) + "'");
		System.out.println("- La matrice rispetta la condizione? '" +
				objmat.verificaProdIndMatr(matriceProdInd) + "'");
		System.out.println("- La matrice è corretta? '" +
				objmat.verificaUniPariPerRiga(matriceUniPariPerRiga) + "'");
		System.out.println(objmat.sommaDueMatrici(matriceA, matriceB));
		System.out.println(objmat.prodIndexPiuSumRowMatr(matriceA2));
		System.out.println(objmat.creaMatriceSpeciale(matriceA2, matriceB2));
		objmat.creaMatriceRandomSpeciale(matriceA2Bis, matriceB2Bis);
		System.out.println(objmat.stampaOccCharStr(matrStr3, matrStr4, 'a'));
	}

}
