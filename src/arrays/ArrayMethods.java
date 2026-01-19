package arrays;

public class ArrayMethods {

	// STAMPA array 'int'
	public static void stampIntArr(int[] array) {
		System.out.print("Array Int -> ");
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	// STAMPA array 'float'
	public static void stampFltArr(float[] array) {
		System.out.print("Array Float -> ");
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	// STAMPA array 'String'
	public static void stampStrArr(String[] arst) {
		System.out.print("Array String -> ");
		System.out.print("[");
		for (int i = 0; i < arst.length; i++) {
			System.out.print(arst[i]);
			if (i < arst.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}

	// Calcola SOMMA degli 'int' nell'array - Es 1
	public static void sumIntArray(int[] arr) {

		int somma = 0;

		for (int i = 0; i < arr.length; i++) {
			somma += arr[i];
		}
		System.out.println("- Somma TOTALE dell'array: " + somma);
	}

	// Trova l'int MAGGIORE nell'array - Es 2
	public static void maxIntArray(int[] arr) {

		int maxVal = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println("- Valore MASSIMO dell'array: " + maxVal);
	}

	// Trova l'int MINORE nell'array - Es 3
	public static void minIntArray(int[] arr) {

		int minVal = arr[0];
		int i = 0;

		while (i < arr.length) {
			if (arr[i] < minVal) {
				minVal = arr[i];
			}
			i++;
		}
		System.out.println("- Valore MINIMO dell'array: " + minVal);
	}

	// Calcola MEDIA array di 'int' - Es 4.1
	public static void medIntArray(int[] arr) {

		int somma = 0;
		float media = 0;

		for (int i = 0; i < arr.length; i++) {
			somma += arr[i];
		}
		media = somma / arr.length;
		System.out.println("- MEDIA array 'int': " + media);

	}

	// Calcola MEDIA array di 'float' - Es 4
	public static void medFloatArray(float[] arfl) {

		float somma = 0;
		float media = 0;

		for (int i = 0; i < arfl.length; i++) {
			somma += arfl[i];
		}
		media = somma / arfl.length;
		System.out.println("- MEDIA array 'float': " + media);

	}

	// COPIA elementi di un array in un nuovo array - Es 6
	public static int[] copyElementInNewArray(int[] array) {

		int[] newArr = new int[array.length];

		for (int j = 0; j < array.length; j++) {
			newArr[j] = array[j];
		}

		System.out.print("- Array da copiare: ");
		for (int n = 0; n < array.length; n++) {
			System.out.print(array[n] + "  ");
		}

		System.out.println();

		System.out.print("- Copia dell'array: ");
		for (int m = 0; m < newArr.length; m++) {
			System.out.print(newArr[m] + "  ");
		}
		System.out.println();
		System.out.println();
		return newArr;
	}

	// VERIFICA presenza di un elemento specifico in array - Es 7
	public static void verificaElementoArray(int[] array, int a) {
		boolean elementoVerificato = false;

		for (int z = 0; z < array.length; z++) {
			if (array[z] == a) {
				elementoVerificato = true;
				break;
			}
		}

		if (elementoVerificato) {
			System.out.println("- L'elemento '" + a + "' è presente nell'array.");
		} else {
			System.out.println("- L'elemento '" + a + "' NON è presente nell'array.");
		}
	}

	// INVERTIRE l'ordine degli elementi di un array - Es 8
	public static void invertElementsArray(int[] array) {
		int[] newArr = new int[array.length];

		for (int l = 0; l < array.length; l++) {
			newArr[l] = array[array.length - 1 - l]; // ordine inverso
		}

		System.out.print("- Array selezionato: ");
		for (int n = 0; n < array.length; n++) {
			System.out.print(array[n] + "  ");
		}

		System.out.println();

		System.out.print("- Array invertito: ");
		for (int j = 0; j < newArr.length; j++) {
			System.out.print(newArr[j] + "  ");
			;
		}
		System.out.println();
		System.out.println();
	}

	// Calcola SOMMA di due array ELEMENTO per ELEMENTO - Es 9
	public static void sommaDuePerVolta(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			System.out.println(" !Errore: gli array non hanno lunghezza uguale!");
			return;
		}

		int[] sommaCoppie = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			sommaCoppie[i] = array1[i] + array2[i];
		}

		System.out.print("- Somma dei due array dati, elemento per elemento: ");
		for (int j = 0; j < array1.length; j++) {
			System.out.print(sommaCoppie[j] + "  ");
			;
		}
		System.out.println();
	}

	// TROVA la POSIZIONE di un elemento in un array - Es 10
	public static void trovaPosElement(int[] array, int e) {

		int posEl = -1;

		for (int h = 0; h < array.length; h++) {
			if (array[h] == e) {
				posEl = h;
				break;
			}
		}
		if (posEl != -1) {
			System.out.println("- L'elemento '" + e + "' si trova in posizione " + "[" + posEl + "]");
		} else {
			System.out.println("- L'elemento '" + e + "' non c'è.");
		}

	}

	// CALCOLA rapporto tra 'a' e 'b'
	public void rappCoppieNum(int a, int b) {
		if (a == 0 || b == 0) {
			System.out.println(" !Errore: 'a' o 'b' non può essere zero!");
			return;
		}

		int rapporto = a / b;
		System.out.println("- Rapporto (a / b) -> " + "'" + rapporto + "'");
	}

}
