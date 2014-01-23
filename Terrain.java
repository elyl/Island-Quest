import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Terrain
{
    public static final int	MAP_WIDTH =		100;
    public static final int	MAP_HEIGHT =		20;
    public static final int	DEFAULT_ISLAND_NUMBER =	10;

    private List<Bateau>	bateaux;
    private List<Ile>		iles;

    public Terrain()
    {
	this.bateaux = new LinkedList<Bateau>();
	this.iles = new LinkedList<Ile>();
	init();	
    }

    private void init()
    {
	Position	p;
	int		nb;

	nb = 0;
	while (nb < Terrain.DEFAULT_ISLAND_NUMBER)
	    {
		p = new Position((int)(Math.random() * Terrain.MAP_WIDTH), (int)(Math.random() * MAP_HEIGHT));
		if (getIleByPosition(p) == null)
		    {
			this.iles.add(new Ile(p));
			nb++;
		    }
	    }
    }

    public Ile getIleByPosition(Position p)
    {
	Iterator<Ile>	itr;
	Ile		tmp;

	itr = iles.iterator();
	while (itr.hasNext())
	    {
		tmp = itr.next();
		if (tmp.getPosition().equals(p))
		    return (tmp);
	    }
	return (null);
    }

    public List<Ile> getIles()
    {
	return (this.iles);
    }

    public void addBateau(Bateau b)
    {
	this.bateaux.add(b);
    }

    public String toString()
    {
	char			map[][];
	int			i;
	int			j;
	Iterator<Bateau>	itr;
	Position		tmp;
	String			str;

	map = new char[Terrain.MAP_HEIGHT][Terrain.MAP_WIDTH + 1];
	i = 0;
	while (i < Terrain.MAP_HEIGHT)
	    {
		j = 0;
		while (j < Terrain.MAP_WIDTH)
		    map[i][j++] = '.';
		map[i][j] = '\n';
		i++;
	    }
	itr = bateaux.iterator();
	while (itr.hasNext())
	       {
		   tmp = itr.next().getPosition();
		   map[tmp.x][tmp.y] = 'B';
	       }
	str = "";
	i = 0;
	while (i < Terrain.MAP_HEIGHT)
	    str += new String(map[i++]);
	return str;
    }
}