public abstract class Bateau extends Entite
{
    protected int	portee;

    public Bateau(Position position, Joueur joueur, int type)
    {
	super(position, joueur, type);
    }

    public boolean move(Position newPos)
    {
	if (position.distance(newPos) <= portee && deplacable)
	    {
		this.deplacable = false;
		return true;
	    }
	return false;
    }
}