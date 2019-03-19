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


	//HASH CODE + EQUALS CON PARAMETRO CHE VOGLIO CHE SIA VERIFICATO QUANDO LANCIATO EQUALS!
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCorso == null) ? 0 : nomeCorso.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) { //HO COSTRUITO UN EQUALS DICENDO CHE LA COSA CHE VOGLIO CHE SIA VERIFICATA SIA SOLO NOME CORSO!!
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (nomeCorso == null) {
			if (other.nomeCorso != null)
				return false;
		} else if (!nomeCorso.equals(other.nomeCorso))
			return false;
		return true;
	}


	public Voto clone() {
		return new Voto(this.punti,this.nomeCorso,this.data);
	}
	
	
	
	
	
	
	
}
