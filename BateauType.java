public class BateauType
{
    private int		moveDistance;
    private int		cost;
    private boolean	canHaveGold;
    private String	name;

    public BateauType(int moveDistance, int cost, boolean canHaveGold, String name)
    {
	this.moveDistance = moveDistance;
	this.cost = cost;
	this.canHaveGold = canHaveGold;
	this.name = name;
    }

    public int getMoveDistance()
    {
	return (this.moveDistance);
    }

    public int getCost()
    {
	return (this.cost);
    }

    public boolean canHaveGold()
    {
	return (this.canHaveGold);
    }

    public String toString()
    {
	return (name);
    }
}