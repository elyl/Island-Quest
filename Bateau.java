public class Bateau
{
    public static final int TYPE_CARAVELLE = 1;
    public static final int TYPE_GALION = 2;
    public static final int TYPE_DEFAULT = Bateau.TYPE_CARAVELLE;

    private static int	nextId = 0;

    private Position	position;
    private Joueur	joueur;
    private int		or;
    private int		id;
    private int		type;
    private int		moveDistance;
    private boolean	canMove;

    public Bateau(Position position, Joueur joueur)
    {
	this(position, joueur, Ile.TYPE_DEFAULT);
    }

    public Bateau(Position position, Joueur joueur, int type)
    {
	this.position = position;
	this.joueur = joueur;
	this.type = type;
	this.or = 0;
	this.id = nextId++;
	this.canMove = false;
    }
    
    private void init()
    {
	switch (type)
	    {
	    case Bateau.TYPE_CARAVELLE :
		moveDistance = 7;
		break;
	    case Bateau.TYPE_GALION :
		moveDistance = 5;
		break;
	    }
    }

    public int getOr()
    {
	return (this.or);
    }

    public void setOr(int or)
    {
	this.or = or;
    }

    public Position getPosition()
    {
	return (this.position);
    }

    public void setPosition(Position p)
    {
	this.position = p;
    }

    public Joueur getJoueur()
    {
	return (this.joueur);
    }

    public void setJoueur(Joueur j)
    {
	this.joueur = j;
    }

    public boolean canMove()
    {
	return (this.canMove);
    }

    public boolean move(Position p)
    {
	if (canMove && position.distance(p) <= moveDistance && !position.equals(p))
	    {
		canMove = false;
		return (true);
	    }
	return (false);
    }

    public boolean equals(Bateau b)
    {
	return (b.id == this.id);
    }
}