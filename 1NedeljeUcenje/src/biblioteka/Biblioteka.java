package biblioteka;

import java.util.List;

import biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {
	private List<Knjiga> knjige;
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		
		if(true) return;
			
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		
		if(true) return;
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		
		return null;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		if(autor==null && ISBN<=0 && naslov==null && izdavac==null)
			throw new IllegalArgumentException("Morate uneti bar neki kriterijum za prettragu");
		return null;
	}
	
}
