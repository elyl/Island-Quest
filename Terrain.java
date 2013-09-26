import java.util.LinkedList;

public class Terrain
{
    public static final int	MAP_WIDTH = 200;
    public static final int	MAP_HEIGHT = 200;

    public static LinkedList[][]	map;

    public Terrain(int nbIsland)
    {
	Terrain.map = new LinkedList[Terrain.MAP_WIDTH][Terrain.MAP_HEIGHT];
	init(nbIsland);
    }

    public void init(int nbIsland)
    {
	int	i;
	int	j;

	i = 0;
	while (i < Terrain.MAP_WIDTH)
	    {
		j = 0;
		while (j < Terrain.MAP_HEIGHT)
		    {
			Terrain.map[i][j] = new LinkedList<Entite>();
			if ((int)Math.random() * 100 > 50 && nbIsland > 0)
			    {
				Terrain.map[i][j].add(new Ile(new Position(i, j), null));
			    }
			j++;
		    }
		i++;
	    }
    }

	
}