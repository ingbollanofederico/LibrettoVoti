package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

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
		
		List<Voto> venticinque = lib.CercaVoti(25);
		System.out.println(venticinque);
		
		Voto votoCercatoa1 = lib.CercaVoto("Analisi I");
		Voto votoCercatoa2 = lib.CercaVoto("Analisi III");
		System.out.println(votoCercatoa1);
		System.out.println(votoCercatoa2);
		
		Voto giusto = new Voto(18, "Geometria", LocalDate.now());
		Voto sbagliato = new Voto(28, "Geometria", LocalDate.now());
		Voto mancante = new Voto(30, "Merendine", LocalDate.now());
		System.out.format("Il voto %s è %s\n", giusto.toString(), lib.esisteGiaVoto(giusto));
		System.out.format("Il voto %s è %s\n", sbagliato.toString(), lib.esisteGiaVoto(sbagliato));
		System.out.format("Il voto %s è %s\n", mancante.toString(), lib.esisteGiaVoto(mancante));
		
		System.out.format("Il voto %s è in conflitto %s\n", giusto.toString(), lib.votoConflitto(giusto));
		System.out.format("Il voto %s è in conflitto %s\n", sbagliato.toString(), lib.votoConflitto(sbagliato));
		System.out.format("Il voto %s è in conflitto %s\n", mancante.toString(), lib.votoConflitto(mancante));
		
		
		lib.add(giusto);
		lib.add(sbagliato);
		lib.add(mancante);
		
		System.out.println(lib.toString());
		
	}

}
