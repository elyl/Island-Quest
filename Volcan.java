public class Volcan extends Ile
{
    public static final int DEFAULT_INCOME = 10;

    public Volcan(Position position, Joueur joueur)
    {
	super(position, joueur, Entites.VOLCAN);
	this.income = Volcan.DEFAULT_INCOME;
    }

    
}