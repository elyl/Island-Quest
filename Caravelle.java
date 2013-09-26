public class Caravelle extends Bateau
{
    public Caravelle(Position position, Joueur joueur)
    {
	super(position, joueur, Entites.CARAVELLE);
    }

    public boolean canHaveGold()
    {
	return true;
    }
}