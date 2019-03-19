package it.polito.tdp.libretto;

import java.util.List;
import java.util.*;

public class Libretto {
	
	private List<Voto> voti;

	public Libretto() {
		this.voti= new ArrayList<Voto>();
	}
	
	
	/***
	 * AGGIUNGE UN NUOVO VOTO AL LIBRETTO
	 * @param voto il {@link Voto} da aggiungere
	 */
	public void add(Voto voto) {
		this.voti.add(voto);
		
	}
	

	/***
	 * RICERCA VOTI CON DETERMINATO VALORE
	 * @param voto da cercare
	 * @return lista voti/esami trovati
	 */
	public List<Voto> CercaVoti(int voto) {
		List<Voto> result = new ArrayList<Voto>();
		
		for(Voto v: this.voti) {
			if(v.getPunti()==voto) {  //in questo caso è stato aggiunto un riferimento all'oggetto 25, MA NON SI STA COPIANDO L'OGGETTO
				result.add(v);       //NON C'E' NEW = SOLO COPIATO RIFERIMENTI
			}
		}
		
		return result;
		
	}
	
	/***
	 * RICERCO VOTO CON DETERMINATO NOME CORSO
	 * @param nome da cercare
	 * @return Voti con quel nome corso
	 */
	public Voto CercaVoto(String nome) {
		Voto voto = new Voto(0, nome, null); //CREO UN OGGETTO NULLO A PARTE IL CAMPO CHE VOGLIO CERCARE = NOME ESAME
		int pos = this.voti.indexOf(voto);  //Lista ritorna l'indice della posizione e vuole l'oggetto da cercare (ANCHE SE PARZIALMENTE)!!
		
		if(pos==-1)
			return null;
		else
			return this.voti.get(pos);
		
		
		
		
		/*for(Voto v : this.voti) {
			if(v.getNomeCorso().equals(nome)) { // == confronta gli oggetti sul riferimento
				return v;                      //equals verifica se il CONTENUTO è lo stesso
			}
		}
		
		return null;*/
		
	}
	
	/**
	 * Dato un {@link Votot}, determina se esiste già un voto con uguale corso ed uguale punteggio
	 * @param v
	 * @return {@code true}, se ha trovato un corso e punteggio uguali,
	 *         {@code false} se non ha trovato il corso, o con voto diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
		Voto trovato = this.CercaVoto(v.getNomeCorso());
		
		if(trovato==null) {
			return false;
		}
		
		if(trovato.getPunti()==v.getPunti()) {
			return true;
		}else {
			return false; 
		}
	}

}
