package fr.leo.dp.Command_5;

public class Jouer implements Commande {
	Recepteur2 recepteur;

	public Jouer(Recepteur2 recepteur) {
		this.recepteur = recepteur;
	}

	@Override
	public void executer() {
		recepteur.jouer();
		;
	}
}
