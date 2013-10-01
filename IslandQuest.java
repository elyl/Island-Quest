public class IslandQuest
{
    public static final int	ROUND_TO_END = 10;

    private Joueur		j1;
    private Joueur		j2;
    private Terrain		t;

    public void start()
    {
	int	tour;
	
	tour = 0;
	t = new Terrain();
	j1 = new Joueur("Norbert");
	j2 = new Joueur("Fernand");
	while (tour++ < IslandQuest.ROUND_TO_END)
	    {
		System.out.println(t);
		j1.play();
		System.out.println(t);
		j2.play();
	    }
    }
}