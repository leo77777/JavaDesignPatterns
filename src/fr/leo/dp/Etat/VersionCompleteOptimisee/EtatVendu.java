package fr.leo.dp.Etat.VersionCompleteOptimisee;

public class EtatVendu extends Etat {

	Distributeur distributeur;

	public EtatVendu(Distributeur distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("Veuillez patienter, le bonbon va tomber");
	}

	@Override
	public void ejecterPiece() {
		System.out.println("Vous avez d�j� tourn� la poign�e");
	}

	@Override
	public void tournerPoignee() {
		System.out.println("Inutile de tourner deux fois !");
	}

	@Override
	public void delivrer() {
		distributeur.liberer();
		if (distributeur.getNombre() > 0)
			distributeur.setEtat(new EtatSansPiece(distributeur));
		else {
			System.out.println("A�e, plus de bonbons !");
			distributeur.setEtat(new EtatEpuise(distributeur));
		}
	}

	@Override
	public void remplir(int nombre) {
		distributeur.setNombre(distributeur.getNombre() + nombre);
		System.out.println("Bonbons ajout�s," + " il y a maintenant " + distributeur.getNombre()
				+ " bonbons dans le distributeur");
	}

	@Override
	public String toString() {
		return "Etat vendu";
	}
}
