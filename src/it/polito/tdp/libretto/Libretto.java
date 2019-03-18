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
	

}
