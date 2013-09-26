public class Ile extends AbstractIle
{
    public static final int DEFAULT_INCOME = 5;

    public Ile(Position position, Joueur joueur)
    {
	super(position, joueur, Entites.ILE);
	this.income = Ile.DEFAULT_INCOME;
    }
}