import java.util.Scanner;
import java.util.List;

public class IslandQuest
{
    public static final int	ROUND_TO_END = 10;

    private Joueur		j1;
    private Joueur		j2;
    private Terrain		t;
    private Scanner		sc;

    public IslandQuest()
    {
	sc = new Scanner(System.in);
    }

    public void start()
    {
	int	tour;
	
	tour = 0;
	System.out.println("Generation du terrain");
	t = new Terrain();
	System.out.println("Terrain genere");
	j1 = new Joueur("Norbert");
	j2 = new Joueur("Fernand");
	t.getIles().get((int)(Math.random() * Terrain.DEFAULT_ISLAND_NUMBER)).setJoueur(j1); 
	t.getIles().get((int)(Math.random() * Terrain.DEFAULT_ISLAND_NUMBER)).setJoueur(j2); 
	t.addBateau(new Bateau(new Position(10, 10), j1));
	while (tour++ < IslandQuest.ROUND_TO_END)
	    {
		System.out.println(t);
		play(j1);
		System.out.println(t);
		play(j2);
	    }
    }

    public void play(Joueur j)
    {
	
    }

    public static void main(String args[])
    {
	new IslandQuest().start();
    }
}