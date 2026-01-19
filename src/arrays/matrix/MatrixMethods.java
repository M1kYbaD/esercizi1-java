package arrays.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrixMethods {

	// STAMPA matrice 'int'
	public void stampMatrInt(int[][] matrice) {
		System.out.println("___________________________________");
		System.out.println("Matrice 'Int' | Dimensione: " + matrice.length + " x " + matrice[0].length);
		System.out.println();

		for (int row = 0; row < row; row++) {
			for (int col = 0; col < col; col++) {
				System.out.print(matrice[row][col] + "\t");
			}
			System.out.println("|");
		}
		System.out.println("___________________________________");
		System.out.println();
	}

	// semplice stampa matrice a 'scacchiera'
	public void stampMatrScacchiera(int[][] matriceScacchiera) {
		System.out.println("________________________________________");
		System.out.println(
				"Matrice 'Scacchiera' | Dimensione: " + matriceScacchiera.length + " x " + matriceScacchiera[0].length);
		System.out.println();

		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				System.out.print(matriceScacchiera[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("________________________________________");
		System.out.println();
	}

	// semplice stampa matrice a 'scacchiera invertita'
	public void stampMatrScacchieraInvertita(int[][] matriceScacchieraInvertita) {
		System.out.println("__________________________________________________");
		System.out.println("Matrice 'Scacchiera invertita' | Dimensione: " + matriceScacchieraInvertita.length + " x "
				+ matriceScacchieraInvertita[0].length);
		System.out.println();

		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				System.out.print(matriceScacchieraInvertita[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("__________________________________________________");
		System.out.println();
	}

	// semplice stampa matrice 'String'
	public void stampMatrStr(String[][] matrice) {
		System.out.println("______________________________________");
		System.out.println("Matrice 'String' | Dimensione: " + matrice.length + " x " + matrice[0].length);
		System.out.println();

		for (int colonne = 0; colonne < matrice.length; colonne++) {
			for (int righe = 0; righe < matrice[colonne].length; righe++) {
				System.out.println("[" + colonne + "][" + righe + "] -> " + matrice[colonne][righe]);
			}

		}
		System.out.println("______________________________________");
		System.out.println();
	}

	// VERIFICA presenza elemento nell'array (di int) in una 'matrice'
	public void verificaElemArrInMatr(int[] array, int[][] matrice) {

		for (int i = 0; i < array.length; i++) {
			boolean elementoTrovato = false;
			int row = 0; // righe matrice

			do {
				int col = 0; // colonne matrice

				do {
					if (matrice[row][col] == array[i]) {
						elementoTrovato = true;
						break;
					}
					col++;

				} while (col < matrice[row].length);
				row++;

			} while (row < matrice.length);

			if (elementoTrovato)
				System.out.println("- Elemento '" + array[i] + "' trovato.");
			else
				System.out.println("- Elemento '" + array[i] + "' assente.");
		}
		System.out.println();

	}

	// PARTE 2: Es 0 - DA RIVEDERE!
	public void verificaElemMatr9x9(int[][] matrice, int n) {
		boolean elementoVerificato = false;

		for (int row = 0; row < matrice.length; row++) {
			for (int col = 0; col < matrice[row].length; col++) {
				if (matrice[row][col] == n) {
					elementoVerificato = true;
					break;
				}

			}
		}

		if (elementoVerificato) {
			System.out.println("- L'elemento '" + n + "' è presente nella matrice.");
		} else {
			System.out.println("- L'elemento '" + n + "' NON è presente nella matrice.");
		}
	}

	// CONFRONTA somme di int 'pari' e 'dispari'
	public void confrontoPariDispari(int[][] matrice) {

		int sommaPari = 0;
		int sommaDisp = 0;

		for (int row = 0; row < matrice.length; row++) {
			for (int col = 0; col < matrice[row].length; col++) {
				if (matrice[row][col] % 2 != 0) {
					sommaDisp += matrice[row][col];
				} else {
					sommaPari += matrice[row][col];
				}
			}
		}

		System.out.println("- Somma interi 'pari': " + "[" + sommaPari + "]");
		System.out.println("- Somma interi 'dispari': " + "[" + sommaDisp + "]");

		if (sommaDisp == sommaPari) {
			System.out.println("Le SOMME si equivalgono!");
		} else if (sommaDisp > sommaPari) {
			System.out.println("I DISPARI valgono di più!");
		} else {
			System.out.println("I PARI valgono di più!");
		}
		System.out.println();
	}

	// CONTA OCCORRENZE di una 'stringa' in una matrice 'String'
	public void contOccStrMatr(String[][] matriceS, String s) {

		int countS = 0;

		for (int row = 0; row < matriceS.length; row++) {
			for (int col = 0; col < matriceS[row].length; col++) {
				if (matriceS[row][col] == s) {
					countS++;
				}
			}
		}
		System.out.println("'" + s + "'" + " in matrice: " + countS);
	}

	// CONTA OCCORRENZE di un 'char' in una matrice 'String'
	public void contOccCharMatr(String[][] matriceS, char c) {
		int countChar = 0;

		for (int row = 0; row < matriceS.length; row++) {
			for (int col = 0; col < matriceS[row].length; col++) {

				String cella = matriceS[row][col];

				for (int i = 0; i < cella.length(); i++) {
					if (cella.charAt(i) == c) {
						countChar++;
					}
				}
			}
		}

		System.out.println("'" + c + "'" + " in matrice: " + countChar);
	}

	// PARTE 2: Es 2
	public void contZeroMatr(int[][] matriceI) {
		int countZero = 0;

		for (int row = 0; row < matriceI.length; row++) {
			for (int col = 0; col < matriceI[row].length; col++) {
				if (matriceI[row][col] == 0) {
					countZero++;
				}
			}
		}
		System.out.println("- Zeri (0) nella matrice: '" + countZero + "'");
	}

	// PARTE 2: Es 1
	public void tavolaPitagora(int[][] matrTabelline) {
		System.out.println("TABELLINE PITAGORICHE");
		System.out.println("___________________________________");
		System.out.println("   |  1  2  3  4  5  6  7  8  9 10");
		System.out.println("---+-------------------------------");

		for (int row = 0; row < matrTabelline.length; row++) {
			System.out.printf("%2d |", row + 1); // intestazione riga
			for (int col = 0; col < matrTabelline[row].length; col++) {
				System.out.printf("%3d", matrTabelline[row][col]);
			}
			System.out.println();
		}
	}

	// PARTE 2: Es 5
	public void trovaMaxSumRowCol(int[][] matrice) {
		if (matrice.length != 4 || matrice[0].length != 4) {
			throw new IllegalArgumentException("!!Errore: la matrice DEVE essere 4x4!!");
		}

		int maxSum = Integer.MIN_VALUE;
		String type = "";
		int index = -1;

		// Somme delle righe
		for (int i = 0; i < 4; i++) {
			int rowSum = 0;
			for (int j = 0; j < 4; j++) {
				rowSum += matrice[i][j];
			}
			if (rowSum > maxSum) {
				maxSum = rowSum;
				type = "Riga";
				index = i;
			}
		}
		// Somme delle colonne
		for (int j = 0; j < 4; j++) {
			int colSum = 0;
			for (int i = 0; i < 4; i++) {
				colSum += matrice[i][j];
			}
			if (colSum > maxSum) {
				maxSum = colSum;
				type = "Colonna";
				index = j;
			}
		}

		System.out.println("- " + type + " con somma massima: [" + index + "] ('" + maxSum + "')");
		System.out.println();
	}

	// PARTE 2: Es 6
	public void verificaIntervalloCelle(int[][] matrice, int n, int m) {
		if (m < n) {
			throw new ArithmeticException("!!Il valore 'm' deve essere MAGGIORE di 'n'!!");
		}

		int countValCompr = 0;
		int totalCelle = matrice.length * matrice[0].length;

		for (int row = 0; row < matrice.length; row++) {
			for (int col = 0; col < matrice[row].length; col++) {
				if (matrice[row][col] >= n && matrice[row][col] <= m) {
					countValCompr++;
				}
			}
		}

		if (countValCompr == totalCelle) {
			System.out.println("- TUTTE le celle hanno numeri compresi tra 'n' (" + n + ") e 'm' (" + m + ").");
		} else {
			System.out.println("- NON tutti gli elementi sono compresi tra 'n' (" + n + ") e 'm' (" + m + ").");
		}
	}

	// PARTE 2: Es 3
	public void creaDiagonaleMatrice() {
		int[][] matrice = new int[5][5];

		if (matrice.length != 5 || matrice[0].length != 5) {
			throw new IllegalArgumentException("!!Errore: la matrice DEVE essere 5x5!!");
		}
		for (int row = 0; row < matrice.length; row++) {
			for (int col = 0; col < matrice[row].length; col++) {
				if (matrice[row] == matrice[col]) {
					matrice[row][col] = 1;
				} else {
					matrice[row][col] = 0;
				}
			}
		}
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

	// PARTE 2: Es 7
	public String verificaScacchiera(int[][] matrice) {
		// Controllo dimensione
		if (matrice.length != 8 || matrice[0].length != 8) {
			return "!La scacchiera NON è 8x8!";
		}

		// Il primo elemento deve essere 0
		if (matrice[0][0] != 0) {
			return "!Layout iniziale errato!";
		}

		// Controllo pattern
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				int valore = matrice[i][j];

				// Deve essere solo 0 o 1
				if (valore != 0 && valore != 1) {
					return "!Valori NON accettati!";
				}

				// Calcolo valore atteso
				int atteso = ((i + j) % 2 == 0) ? 0 : 1;

				if (valore != atteso) {
					return "!Valore inaspettato!";
				}
			}
		}

		return "La scacchiera è corretta.";
	}

	// PARTE 2: Es 7.1
	public String verificaScacchieraInvertita(int[][] matrice) {
		// Controllo dimensione
		if (matrice.length != 8 || matrice[0].length != 8) {
			return "!La scacchiera NON è 8x8!";
		}

		// Il primo elemento deve essere 0
		if (matrice[0][0] != 1) {
			return "!Layout iniziale errato!";
		}

		// Controllo pattern
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				int valore = matrice[i][j];

				// Deve essere solo 0 o 1
				if (valore != 0 && valore != 1) {
					return "!Valori NON accettati!";
				}

				// Calcolo valore atteso
				int atteso = ((i + j) % 2 == 0) ? 1 : 0;

				if (valore != atteso) {
					return "!Valore inaspettato!";
				}
			}
		}

		return "la scacchiera invertita è corretta.";
	}

	// PARTE 2: Es 8 - DA RIVEDERE
	public boolean sommeDiagonaliUguali(int[][] matrice) {
		int n = matrice.length;

		// Calcolo somma diagonale principale
		int sommaDiagPrincipale = 0;
		for (int i = 0; i < n; i++) {
			sommaDiagPrincipale += matrice[i][i];
		}

		// Calcolo somma diagonale secondaria
		int sommaDiagSecondaria = 0;
		for (int i = 0; i < n; i++) {
			sommaDiagSecondaria += matrice[i][n - 1 - i];
		}

		// Confronto
		return sommaDiagPrincipale == sommaDiagSecondaria;
	}

	// PARTE 2: Es 4
	public boolean verificaMatrPalindroma(int[][] matrice) {
		int n = matrice.length; // in questo caso '6'
		for (int i = 0; i < n / 2; i++) {
			int sommaInizio = 0;
			int sommaFine = 0;

			// Somma riga (i)
			for (int j = 0; j < matrice[i].length; j++) {
				sommaInizio += matrice[i][j];
			}

			// Somma riga (n-1-i)
			for (int j = 0; j < matrice[n - 1 - i].length; j++) {
				sommaFine += matrice[n - 1 - i][j];
			}

			// Se le somme non coincidono → NON palindroma (false)
			if (sommaInizio != sommaFine) {
				return false;
			}
		}
		return true;
	}

	// PARTE 2: Es 24
	public boolean verificaPrevalenzaZero(int[][] matrice) {
		if (matrice.length != 7 || matrice[0].length != 7) {
			throw new IllegalArgumentException("!!Errore: la matrice DEVE essere 7x7!!");
		}
		int contNumZero = 0;
		int contElem = 0;

		for (int row = 0; row < matrice.length; row++) {
			for (int col = 0; col < matrice[row].length; col++) {
				if (matrice[row][col] == 0) {
					contNumZero++;
				} else {
					contElem++;
				}
			}
		}
		if (contNumZero > contElem) {
			return true;
		} else {
			return false;
		}

	}

	// PARTE 2: Es 25
	public void calcolaMaxRowElem(int[][] matrice) {
		if (matrice.length != 6 || matrice[0].length != 6) {
			throw new IllegalArgumentException("!!Errore: la matrice DEVE essere 6x6!!");
		}
		int somma = 0;

		for (int row = 0; row < matrice.length; row++) {
			int max = matrice[row][0];
			for (int col = 1; col < matrice[row].length; col++) {
				if (matrice[row][col] > max) {
					max = matrice[row][col];
				}
			}
			somma += max; // aggiungo il massimo della riga alla somma totale
		}
		System.out.println("- Gli interi più grandi della matrice sommati fanno: '" + somma + "'");
	}

	// PARTE 2: Es 27
	public void trovaCordMinInt(int[][] matrice) {
		if (matrice.length != 8 || matrice[0].length != 8) {
			throw new IllegalArgumentException("!!Errore: la matrice DEVE essere 8x8!!");
		}
		int minInt = matrice[0][0];
		List<String> coordinateMinInt = new ArrayList<>();

		for (int row = 0; row < matrice.length; row++) {
			for (int col = 0; col < matrice[row].length; col++) {
				if (matrice[row][col] < minInt) {
					minInt = matrice[row][col];
					coordinateMinInt.clear(); // Rimuove le vecchie coordinate
					coordinateMinInt.add("(" + row + "," + col + ")");
				} else if (matrice[row][col] == minInt) {
					coordinateMinInt.add("(" + row + "," + col + ")");
				}
			}
		}

		System.out.println("- Elemento più piccolo trovato: '" + minInt + "'");
		System.out.println("- Coordinate in cui si trova: " + coordinateMinInt);
	}

	// PARTE 2: Es 26
	public void calcolaProdottoSottoDiagPrin(int[][] matrice) {
		if (matrice.length != 8 || matrice[0].length != 8) {
			throw new IllegalArgumentException("!!Errore: la matrice DEVE essere 8x8!!");
		}
		long prodottoElem = 1;
		for (int row = 0; row < matrice.length; row++) {
			for (int col = 0; col < matrice[row].length; col++) {
				if (row > col) { // SOLO sotto la diagonale principale
					prodottoElem *= matrice[row][col];
				}
			}
		}
		System.out.println("- Prodotto interi sotto la 'diagonale principale': " + prodottoElem);

	}

	// PARTE 2: Es 10
	public boolean verificaProprietaCelle(int[][] matrice) {

		return false;

	}

	// PARTE 2: Es 15
	public void sommaMatr4X4(int[][] matrice1, int[][] matrice2) {
		int[][] matriceSomma = new int[4][4];

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				matriceSomma[row][col] = matrice1[row][col] + matrice2[row][col];
			}
		}
		System.out.println("__________________________________________________");
		System.out.println(
				"Matrice 'Somma di due matrici' | Dimensione: " + matriceSomma.length + " x " + matriceSomma[0].length);
		System.out.println();

		for (int colonne = 0; colonne < matriceSomma.length; colonne++) {
			for (int righe = 0; righe < matriceSomma[colonne].length; righe++) {
				System.out.println("[" + colonne + "][" + righe + "] -> " + matriceSomma[colonne][righe]);
			}

		}
		System.out.println("__________________________________________________");
		System.out.println();
	}

	// PARTE 2: Es 28 - Data una matrice 'binaria' (0 e 1), calcolare e ritornare la
	// somma binaria di ogni riga
	public void calcoloMatrBin(int[][] matriceBinaria) {
		for (int row = 0; row < matriceBinaria.length; row++) {
			int somma = 0;
			for (int col = 0; col < matriceBinaria[row].length; col++) {
				somma = somma * 2 + matriceBinaria[row][col];
			}
			System.out.println("- Somma binaria della riga " + "[" + row + "]" + ": '" + somma + "'");
		}
	}

	// PARTE 2: Es 16
	public String confrontaSommeDiagonale(int[][] matrice) {
		if (matrice.length != 5 || matrice[0].length != 5) {
			throw new IllegalArgumentException("!!Errore: la matrice DEVE essere 5x5!!");
		}
		int sommaSopra = 0;
		int sommaSotto = 0;

		int n = matrice.length;

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (col > row) {
					sommaSopra += matrice[row][col];
				} else if (col < row) {
					sommaSotto += matrice[row][col];
				}
			}
		}

		if (sommaSopra > sommaSotto) {
			return "- La somma SOPRA la diagonale è maggiore.";
		} else if (sommaSopra < sommaSotto) {
			return "- La somma SOTTO la diagonale è maggiore.";
		} else {
			return "- Le somme sopra e sotto la diagonale sono UGUALI!";
		}
	}

	// PARTE 2: Es 14
	public boolean verificaStessoValoreBordi(int[][] matrice) {
		if (matrice.length != 6 || matrice[0].length != 6) {
			throw new IllegalArgumentException("!!Errore: la matrice DEVE essere 6x6!!");
		}

		int valoreBordo = matrice[0][0];

		// Riga superiore e inferiore
		for (int col = 0; col < 6; col++) {
			if (matrice[0][col] != valoreBordo || matrice[5][col] != valoreBordo) {
				return false;
			}
		}

		// Colonna sinistra e destra (escludendo angoli già controllati)
		for (int row = 1; row < 5; row++) {
			if (matrice[row][0] != valoreBordo || matrice[row][5] != valoreBordo) {
				return false;
			}
		}

		return true;
	}

	// PARTE 2: Es 13
	public boolean verificaMatricePerRiga(int[][] matrice) {
		if (matrice.length != 5 || matrice[0].length != 5) {
			throw new IllegalArgumentException("La matrice deve essere 5x5");
		}

		for (int row = 0; row < 5; row++) {
			int sommaPrecedentiRiga = 0;
			for (int col = 0; col < 5; col++) {
				if (col != 0) { // dalla seconda cella in poi
					if (matrice[row][col] != sommaPrecedentiRiga) {
						return false;
					}
				}
				sommaPrecedentiRiga += matrice[row][col];
			}
		}
		return true;
	}

	// PARTE 2: Es 11
	public boolean verificaIsMatrIdentita(int[][] matrice) {
		if (matrice.length != 6 || matrice[0].length != 6) {
			throw new IllegalArgumentException("La matrice DEVE essere 6x6");
		}
		for (int row = 0; row < matrice.length; row++) {
			for (int col = 0; col < matrice[row].length; col++) {
				if (row == col) {
					// Sulla diagonale principale deve esserci 1
					if (matrice[row][col] != 1) {
						return false;
					}
				} else {
					// Fuori dalla diagonale deve esserci 0
					if (matrice[row][col] != 0) {
						return false;
					}
				}
			}
		}
		return true;

	}

	// PARTE 2: Es 10
	public boolean verificaCellaNonMagg(int[][] matrice) {
		if (matrice.length != 5 || matrice[0].length != 5) {
			throw new IllegalArgumentException("La matrice deve essere 5x5");
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int valoreCorrente = matrice[i][j];

				// Controlla celle nelle righe successive
				for (int r = i + 1; r < 5; r++) {
					if (valoreCorrente > matrice[r][j]) {
						return false;
					}
				}

				// Controlla celle nelle colonne successive
				for (int c = j + 1; c < 5; c++) {
					if (valoreCorrente > matrice[i][c]) {
						return false;
					}
				}
			}
		}

		return true;
	}

	// PARTE 2: Es 12
	public boolean verificaProdIndMatr(int[][] matrice) {
		if (matrice.length != 5 || matrice[0].length != 5) {
			throw new IllegalArgumentException("La matrice deve essere 5x5");
		}
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (matrice[row][col] != row * col) {
					return false;
				}
			}
		}
		return true;

	}

	// PARTE 2: Es 19
	public boolean verificaUniPariPerRiga(int[][] matrice) {
		if (matrice.length != 8 || matrice[0].length != 8) {
			throw new IllegalArgumentException("La matrice deve essere 8x8");
		}

		// Conta gli 1 nella prima riga
		int countPrev = 0;
		for (int col = 0; col < 8; col++) {
			if (matrice[0][col] == 1) {
				countPrev++;
			}
		}

		// Confronta con le righe successive
		for (int row = 1; row < 8; row++) {
			int countCurrent = 0;
			for (int col = 0; col < 8; col++) {
				if (matrice[row][col] == 1) {
					countCurrent++;
				}
			}

			if (countCurrent != countPrev) {
				return false;
			}

			countPrev = countCurrent; // aggiorna per la prossima iterazione
		}

		return true;
	}

	// ESERCIZIO AGGIUNTIVO - Definite due matrici (A e B), produci in output una
	// matrice (C) dove ogni cella contiene la somma delle celle corrispondenti:
	// C[i, j] = A[i, j] + B[i, j]
	public int[][] sommaDueMatrici(int[][] matriceA, int[][] matriceB) {
		int[][] matriceC = new int[matriceA.length][matriceA[0].length];

		for (int row = 0; row < matriceA.length; row++) {
			for (int col = 0; col < matriceA[row].length; col++) {
				matriceC[row][col] = matriceA[row][col] + matriceB[row][col];
			}
		}
		System.out.println("__________________________________________________");
		System.out
				.println("MatriceC di ('matriceA' + 'matriceB') | Dimensione: " + matriceC.length + " x " + matriceC[0].length);
		System.out.println();

		for (int row = 0; row < matriceC.length; row++) {
			for (int col = 0; col < matriceC[row].length; col++) {
				System.out.print(matriceC[row][col] + "\t");
			}
			System.out.println("|");
		}
		System.out.println("__________________________________________________");
		System.out.println();
		return matriceC; // !DA RIDEFINIRE PER IL TIPO DI RITORNO!
	}

	// ESERCIZIO AGGIUNTIVO 2 - Data una matrice ('A'), produci in output una
	// matrice ('B')
	// dove ogni cella contiene il prodotto fra l'indice della cella stessa e la
	// somma della riga corrispondente
	public int[][] prodIndexPiuSumRowMatr(int[][] matriceA) {
		int righe = matriceA.length;
		int colonne = matriceA[0].length;
		int[][] matriceB = new int[righe][colonne];

		for (int row = 0; row < righe; row++) {
			// Calcolo la somma della riga
			int sommaRiga = 0;
			for (int col = 0; col < colonne; col++) {
				sommaRiga += matriceA[row][col];
			}

			// Calcolo ogni cella di B
			for (int col = 0; col < colonne; col++) {
				matriceB[row][col] = col * sommaRiga;
			}
		}

		System.out.println("__________________________________________________");
		System.out.println("MatriceB | Dimensione: " + matriceB.length + " x " + matriceB[0].length);
		System.out.println();

		for (int row = 0; row < matriceB.length; row++) {
			for (int col = 0; col < matriceB[row].length; col++) {
				System.out.print(matriceB[row][col] + "\t");
			}
			System.out.println();

		}
		System.out.println("__________________________________________________");
		System.out.println();
		return matriceB;
	}

	// ESERCIZIO AGGIUNTIVO 3 - Date due matrici ('A2' e 'B2') di dimensioni 6x5,
	// applicare un algoritmo che produce una matrice ('C2') dove per ogni cella:
	// - Se A[i, j] < 0 allora: C[i, j] = A[i, j] * B[i, j];
	// - Se A[i, j] > 0 allora: C[i, j] = A[i, j] / B[i, j];
	// - Se A[i, j] = 0 allora: C[i, j] = 1;
	public int[][] creaMatriceSpeciale(int[][] matriceA2, int[][] matriceB2) {
		int righe = matriceA2.length;
		int colonne = matriceA2[0].length;
		int[][] matriceC = new int[righe][colonne];

		for (int row = 0; row < righe; row++) {
			for (int col = 0; col < colonne; col++) {
				int a = matriceA2[row][col];
				int b = matriceB2[row][col];

				if (a < 0) {
					matriceC[row][col] = a * b;
				} else if (a > 0) {
					// Evita divisione per zero
					matriceC[row][col] = (b != 0) ? a / b : 0;
				} else {
					matriceC[row][col] = 1;
				}
			}
		}

		System.out.println("__________________________________________________");
		System.out.println("MatriceC 'Speciale' | Dimensione: " + righe + " x " + colonne);
		System.out.println();

		for (int row = 0; row < righe; row++) {
			for (int col = 0; col < colonne; col++) {
				System.out.print(matriceC[row][col] + "\t");
			}
			System.out.println();
		}

		System.out.println("__________________________________________________");
		System.out.println();

		return matriceC;
	}

	// ESERCIZIO AGGIUNTIVO 4 - Stessa traccia dell'esercizio 3, ma valorizzando in
	// modo 'randomico' le matrici ('A2Bis' e 'B2Bis').
	public int[][] creaMatriceRandomSpeciale(int[][] matriceA2Bis, int[][] matriceB2Bis) {
		int righe = matriceA2Bis.length;
		int colonne = matriceA2Bis[0].length;
		int[][] matriceC2 = new int[righe][colonne];
		Random random = new Random();

		for (int row = 0; row < matriceA2Bis.length; row++) {
			for (int col = 0; col < matriceA2Bis[row].length; col++) {

				matriceA2Bis[row][col] = random.nextInt(501) - 251;

			}
		}
		// STAMPA PRIMA MATRICE RANDOM
		System.out.println("_________________________________________");
		System.out
				.println("MatriceA2Bis 'Random' | Dimensione: " + matriceA2Bis.length + " x " + matriceA2Bis[0].length);
		System.out.println();

		for (int row = 0; row < matriceA2Bis.length; row++) {
			for (int col = 0; col < matriceA2Bis[row].length; col++) {
				System.out.println("[" + row + "][" + col + "] -> " + matriceA2Bis[row][col]);
			}

		}
		System.out.println("_________________________________________");
		System.out.println();

		for (int row = 0; row < matriceB2Bis.length; row++) {
			for (int col = 0; col < matriceB2Bis[row].length; col++) {

				matriceB2Bis[row][col] = random.nextInt(501) - 251;

			}
		}
		// STAMPA SECONDA MATRICE RANDOM
		System.out.println("_________________________________________");
		System.out
				.println("MatriceB2Bis 'Random' | Dimensione: " + matriceB2Bis.length + " x " + matriceB2Bis[0].length);
		System.out.println();

		for (int row = 0; row < matriceB2Bis.length; row++) {
			for (int col = 0; col < matriceB2Bis[row].length; col++) {
				System.out.println("[" + row + "][" + col + "] -> " + matriceB2Bis[row][col]);
			}

		}
		System.out.println("_________________________________________");
		System.out.println();

		for (int row = 0; row < righe; row++) {
			for (int col = 0; col < colonne; col++) {
				int a = matriceA2Bis[row][col];
				int b = matriceB2Bis[row][col];

				if (a < 0) {
					matriceC2[row][col] = a * b;
				} else if (a > 0) {
					// Evita divisione per zero
					matriceC2[row][col] = (b != 0) ? a / b : 0;
				} else {
					matriceC2[row][col] = 1;
				}
			}
		}

		System.out.println("_____________________________________________");
		System.out.println("MatriceC2 'A2Bis & B2Bis' | Dimensione: " + righe + " x " + colonne);
		System.out.println();

		for (int row = 0; row < righe; row++) {
			for (int col = 0; col < colonne; col++) {
				System.out.print(matriceC2[row][col] + "\t");
			}
			System.out.println("|");
		}

		System.out.println("_____________________________________________");
		System.out.println();

		return matriceC2;

	}

	// PARTE 2: Es 29 - Date due matrici 'String' (matrA e matrB) di uguali
	// dimensioni, e un carattere 'char' (c), restituisca una nuova matrice di 'int'
	// (matrC) di pari dimensioni.
	// Ogni cella di matrC[i][j] deve contenere il numero di occorrenze del
	// carattere 'c'
	// nella stringa ottenuta dalla concatenazione di matrA[i][j] + matrB[i][j].
	public int[][] stampaOccCharStr(String matrA[][], String matrB[][], char c) {
		int riga = matrA.length;
		int colonna = matrA[0].length;
		int[][] matrC = new int[riga][colonna];

		for (int row = 0; row < matrC.length; row++) {
			for (int col = 0; col < matrC[row].length; col++) {
				String strConcat = matrA[row][col] + matrB[row][col];
				int countC = 0;
				for (int i = 0; i < strConcat.length(); i++) { // ciclo per ogni 'char' della 'string'
					if (strConcat.charAt(i) == c) {
						countC++;
					}
				}
				matrC[row][col] = countC;
			}
		}
		System.out.println("_____________________________________________");
		System.out.println("MatrC 'Occorrenze char '" + c + "' | Dimensione: " + riga + " x " + colonna);
		System.out.println();

		for (int row = 0; row < riga; row++) {
			for (int col = 0; col < colonna; col++) {
				System.out.print(matrC[row][col] + "\t");
			}
			System.out.println("|");
		}

		System.out.println("_____________________________________________");
		System.out.println();
		return matrC;

	}

}
