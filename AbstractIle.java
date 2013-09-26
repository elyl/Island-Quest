public abstract class AbstractIle extends Entite
{
    protected static int	c;
    protected int		income;

    static
    {
	c = 0;
    }

    public AbstractIle(Position position, Joueur joueur, int type)
    {
	super(position, joueur, type);
	this.id = c++;
    }
    
    public boolean canHaveGold()
    {
	return (true);
    }
    
    public boolean canMove()
    {
	return (false);
    }

    public void increaseIncome(int bonus)
    {
	this.income += bonus;
    }
}