public abstract class Bateau extends Entite
{
    protected static int	c;
    protected int		portee;

    static
    {
	c = 0;
    }

    public Bateau(Position position, Joueur joueur, int type)
    {
	super(position, joueur, type);
	this.id = 0;
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