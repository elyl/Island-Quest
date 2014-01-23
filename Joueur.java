import java.util.List;
import java.util.ArrayList;

public class Joueur
{
    public static final Joueur NULL = null;

    protected String		nom;
    protected List<Bateau>	bateaux;
    protected List<Ile>		iles;
    
    public Joueur(String nom)
    {
	this.nom = nom;
	this.bateaux = new ArrayList<Bateau>();
	this.iles = new ArrayList<Ile>();
    }

    public void addBoat(Bateau b)
    {
	this.bateaux.add(b);
    }

    public void removeBoat(Bateau b)
    {
	this.bateaux.remove(b);
    }

    public List<Bateau> getBoatList()
    {
	return(bateaux);
    }

    public List<Ile> getIslandList()
    {
	return (this.iles);
    }

    public void play()
    {
	System.out.println("pouet");
    }

    public String toString()
    {
	return (nom);
    }
}