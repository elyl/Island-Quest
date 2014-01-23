public class Position
{
    public final int	x;
    public final int	y;

    public Position(int x, int y)
    {
	this.x = x;
	this.y = y;
    }

    public int distance(Position p)
    {
	return ((Math.max(x, p.x) - Math.min(x, p.x)) + (Math.max(y, p.y) - Math.min(y, p.y)));
    }

    public boolean equals(Position p)
    {
	return (this.x == p.x && this.y == p.y);
    }
}