package it.polito.tdp.libretto;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		//QUESTA CLASSE VIENE UTILIZZATA PER TESTARE IL MODEL PRIMA DI APPLICARCI LA VIEW (DATO CHE SONO INDIPENDENTI)
		
		//I TEST POSSONO ESSERE DIVERSI PER DIVERSE MODALITA' (MESSO DA PARTE QUANDO FUNZIONA)
		
		
		Libretto lib = new Libretto();
		
		lib.add(new Voto(30,"Analisi I", LocalDate.of(2017, 1, 15)));
		lib.add(new Voto(21,"Analisi II", LocalDate.of(2018, 1, 25)));
		lib.add(new Voto(25,"Fisica I", LocalDate.of(2017, 6, 10)));
		lib.add(new Voto(28,"Fisica I", LocalDate.of(2018, 9, 3)));
		lib.add(new Voto(18,"Geometria", LocalDate.of(2017, 9, 1)));
		lib.add(new Voto(20,"Economia", LocalDate.of(2018, 1, 28)));
		lib.add(new Voto(25,"RO", LocalDate.of(2018, 6, 5)));
		lib.add(new Voto(24,"Complementi di Economia", LocalDate.of(2018, 2, 15)));
		lib.add(new Voto(25,"Logistica", LocalDate.of(2019, 2, 1)));
		lib.add(new Voto(27,"PO", LocalDate.of(2017, 1, 25)));
		
		

	}

}
