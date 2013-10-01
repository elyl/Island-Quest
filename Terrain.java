import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class Terrain
{
    public static final int	MAP_WIDTH =		100;
    public static final int	MAP_HEIGHT =		20;
    public static final int	DEFAULT_ISLAND_NUMBER =	10;

    private List<Bateau>		bateaux;
    private Map<Position, AbstractIle>	iles;

    public Terrain()
    {
	this.bateaux = new LinkedList<Bateau>();
	this.iles = new HashMap<Position, AbstractIle>();
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
		if (this.iles.get(p) == null)
		    {
			this.iles.put(p, new Ile(p, null));
			nb++;
		    }
	    }
    }

    public String toString()
    {
	char	map[][];
	int	i;
	int	j;
	String	str;

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
	
	str = "";
	i = 0;
	while (i < Terrain.MAP_HEIGHT)
	    str += new String(map[i++]);
	return str;
    }
}