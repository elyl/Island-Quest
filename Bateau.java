public abstract class Bateau
{
    protected Position	position;
    protected int	id;
    protected int	or;
    protected boolean	deplacable;
    protected Joueur	joueur;
    
    public Bateau(Position position, int id, Joueur joueur)
    {
	this.position = position;
	this.id = id;
	this.or = 0;
	this.deplacable = false;
	this.joueur = joueur;
    }
    
    public boolean canMove()
    {
	return (deplacable);
    }

    public int getId()
    {
	return (id);
    }

    public int getOr()
    {
	return (or);
    }

    public void chargerOr(int or)
    {
	this.or += or;
    }
}