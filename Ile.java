public class Ile
{
    public static final int DEFAULT_INCOME = 5;
    public static final int TYPE_ISLAND = 1;
    public static final int TYPE_VOLCANO = 2;
    public static final int TYPE_DEFAULT = Ile.TYPE_ISLAND;

    private Position	position;
    private Joueur	joueur;
    private int		or;
    private int		income;
    private int		type;

    public Ile(Position position)
    {
	this(position, Joueur.NULL);
    }

    public Ile(Position position, Joueur joueur)
    {
	this(position, joueur, Ile.TYPE_DEFAULT);
    }

    public Ile(Position position, Joueur joueur, int type)
    {
	this.position = position;
	this.joueur = joueur;
	this.type = type;
	this.or = 0;
	this.income = Ile.DEFAULT_INCOME;
    }

    public int getOr()
    {
	return (this.or);
    }

    public void setOr(int or)
    {
	this.or = or;
    }

    public int getIncome()
    {
	return (this.income);
    }

    public Position getPosition()
    {
	return (this.position);
    }

    public Joueur getJoueur()
    {
	return (this.joueur);
    }

    public void setJoueur(Joueur j)
    {
	this.joueur = j;
    }

    public boolean equals(Ile i)
    {
	return (i.position.equals(this.position));
    }
}