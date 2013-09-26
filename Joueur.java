import java.util.Map;
import java.util.HashMap;

public abstract class Joueur
{
    protected String			nom;
    protected Map<Integer, Bateau>	bateaux;
    protected Map<Integer, Ile>		iles;
    
    public Joueur(String nom)
    {
	this.nom = nom;
	this.bateaux = new HashMap<Integer, Bateau>();
	this.iles = new HashMap<Integer, Ile>();
    }

    public void addBoat(Bateau b)
    {
	this.bateaux.put(new Integer(b.getId()), b);
    }

    public void removeBoat(Bateau b)
    {
	this.bateaux.remove(new Integer(b.getId()));
    }
}