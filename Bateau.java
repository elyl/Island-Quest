public class Bateau
{
    public static final BateauType CARAVELLE = new BateauType(5, 3, true, "caravelle");
    public static final BateauType GALION = new BateauType(7, 1, false, "galion");
    public static final BateauType DEFAULT = Bateau.CARAVELLE;

    private static int	nextId = 0;

    private Position	position;
    private Joueur	joueur;
    private BateauType	type;
    private int		or;
    private int		id;
    private boolean	canMove;

    public Bateau(Position position, Joueur joueur)
    {
	this(position, joueur, Bateau.DEFAULT);
    }

    public Bateau(Position position, Joueur joueur, BateauType type)
    {
	this.position = position;
	this.joueur = joueur;
	this.type = type;
	this.or = 0;
	this.id = nextId++;
	this.canMove = false;
    }
    
    public int getOr()
    {
	return (this.or);
    }

    public void setOr(int or)
    {
	this.or = or;
    }

    public int getId()
    {
	return (this.id);
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

    public void setCanMove(boolean c)
    {
	this.canMove = c;
    }

    public boolean canHaveGold()
    {
	return (this.type.canHaveGold());
    }

    public boolean move(Position p)
    {
	if (canMove && position.distance(p) <= type.getMoveDistance() && !position.equals(p))
	    {
		position = p;
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