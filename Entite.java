public abstract class Entite
{
    protected int	or;
    protected int	type;
    protected int	id;
    protected boolean	deplacable;
    protected Position	position;
    protected Joueur	joueur;
    
    public Entite(Position position, Joueur joueur, int type)
    {
	this.position = position;
	this.type = type;
	this.or = 0;
	this.deplacable = false;
	this.joueur = joueur;
    }

    public abstract boolean canHaveGold();
    
    public boolean canMove()
    {
	return (deplacable);
    }

    public int getId()
    {
	return (id);
    }

    public int getGold()
    {
	return (or);
    }

    public Joueur getJoueur()
    {
	return (joueur);
    }

    public Position getPosition()
    {
	return (position);
    }

    public int getType()
    {
	return (type);
    }
}