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
	t.addBateau(new Bateau(new Position(10, 9), j1));
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
	t.getBateaux().get(0).setCanMove(true);
	System.out.println(t.getBateaux().get(0).move(new Position(10, 5)));

    }

    public void charger(int id_bateau, int or)
    {
	Bateau	b;
	Ile	i;

	b = t.getBateauById(id_bateau);
	if (b == null)
	    return;
	i = t.getIleByPosition(b.getPosition());
	if (i == null)
	    return;
	if (i.getOr() < or)
	    return;
	if (b.canHaveGold())
	    {
		b.setOr(b.getOr() + or);
		i.setOr(i.getOr() - or);
	    }
    }

    public void decharger(int id_bateau, int or)
    {
	Bateau	b;
	Ile	i;

	b = t.getBateauById(id_bateau);
	if (b == null)
	    return;
	i = t.getIleByPosition(b.getPosition());
	if (i == null)
	    return;
	if (b.getOr() < or)
	    return;
	b.setOr(b.getOr() - or);
	i.setOr(i.getOr() + or);
    }

    public void transferer(int id_bateau, int id_bateau2, int or)
    {
	Bateau	b1;
	Bateau	b2;

	b1 = t.getBateauById(id_bateau);
	b2 = t.getBateauById(id_bateau2);
	if (b1 == null | b2 == null)
	    return;
	if (!(b1.canHaveGold() && b2.canHaveGold()))
	    return;
	if (b1.getOr() < or)
	    return;
	b1.setOr(b1.getOr() - or);
	b2.setOr(b2.getOr() + or);
    }

    public void construire(Joueur j, Position p, BateauType bateau_type)
    {
	Ile	i;

	i = t.getIleByPosition(p);
	if (i == null)
	    return;
	if (i.getOr() < bateau_type.getCost())
	    return;
	t.getBateaux().add(new Bateau(p, j, bateau_type));
	i.setOr(i.getOr() - bateau_type.getCost());
    }

    public static void main(String args[])
    {
	new IslandQuest().start();
    }
}