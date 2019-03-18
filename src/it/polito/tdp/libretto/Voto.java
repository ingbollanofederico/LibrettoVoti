package it.polito.tdp.libretto;

import java.time.LocalDate; //per lavorare con le date in modo corretto

public class Voto {
	private int punti;
	private String nomeCorso;
	private LocalDate data;             //DATE & CALENDAR = GESTIONE DATA FINO JAVA 6
	
	//COSTRUTTORE
	public Voto(int voto, String nomeCorso, LocalDate data) {
		this.punti = voto;
		this.nomeCorso = nomeCorso;
		this.data = data;
	}


	//GET&SETTER
	public int getPunti() {
		return punti;
	}

	public void setPunti(int voto) {
		this.punti = voto;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Voto [punti=" + punti + ", nomeCorso=" + nomeCorso + ", data=" + data + "]";
	}
	
	
	
	
	
	
	
	
}
