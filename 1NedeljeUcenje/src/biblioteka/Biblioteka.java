package biblioteka;

import java.util.List;

import biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {
	private List<Knjiga> knjige;
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		
		
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		
		
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		
		return null;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		
		return null;
	}
	
}
