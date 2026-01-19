package arrays.matrix;

import java.time.LocalDate;

public class Anagrafica {

	private String nome;
	private String cognome;
	private char sesso;
	private LocalDate data_nascita;
	private String luogo_nascita;
	private String Cod_Fisc;

	public Anagrafica(String nome, String cognome, char sesso, LocalDate data_nascita, String luogo_nascita,
			String cod_Fisc) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.data_nascita = data_nascita;
		this.luogo_nascita = luogo_nascita;
		Cod_Fisc = cod_Fisc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	public LocalDate getData_nascita() {
		return data_nascita;
	}

	public void setData_nascita(LocalDate data_nascita) {
		this.data_nascita = data_nascita;
	}

	public String getLuogo_nascita() {
		return luogo_nascita;
	}

	public void setLuogo_nascita(String luogo_nascita) {
		this.luogo_nascita = luogo_nascita;
	}

	public String getCF() {
		return Cod_Fisc;
	}

	public void setCF(String cF) {
		Cod_Fisc = cF;
	}

	@Override
	public String toString() {
		return nome + " " + cognome + " | '" + sesso + "' | data_nascita (" + data_nascita + ") | luogo_nascita ("
				+ luogo_nascita + ") | Cod_Fisc [" + Cod_Fisc + "]";
	}

	// STAMPA matrice
	public static void stampMatrStr(Anagrafica[][] matriceAnagrafica) {
		System.out.println("__________________________________________");
		System.out.println("Matrice 'Anagrafica' | Dimensione: (" + matriceAnagrafica.length + " x "
				+ matriceAnagrafica[0].length + ")");
		System.out.println();

		for (int colonne = 0; colonne < matriceAnagrafica.length; colonne++) {
			for (int righe = 0; righe < matriceAnagrafica[colonne].length; righe++) {
				System.out.println("[" + colonne + "][" + righe + "] -> " + matriceAnagrafica[colonne][righe]);
			}
		}

		System.out.println("__________________________________________");
		System.out.println();
	}

	// TROVA gli uomini ('M') nati nel 1981
	public static void trovaUomini1981(Anagrafica[][] matriceAnagrafica) {

	}
}
