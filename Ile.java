public abstract class Ile extends Entite
{
    protected int	income;

    public Ile(Position position, Joueur joueur, int type)
    {
	super(position, joueur, type);
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