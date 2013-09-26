public class Galion extends Bateau
{
    public Galion(Position position, Joueur joueur)
    {
	super(position, joueur, Entites.GALION);
    }

    public boolean canHaveGold()
    {
	return false;
    }
}