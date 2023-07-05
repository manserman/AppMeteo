import java.util.ArrayList;

public final class Region extends Lieu {
    protected final ArrayList<Ville> villes ;

    public Region(int id, Alpha nom, String latitude, String longitude) {
        super( id,  nom, latitude,  longitude);
        this.villes= new ArrayList<Ville>();
    }

    public String getnom() {
        return this.nom.getValue();
    }
    
     public void ajouterVille(Ville ville) {
         for (Ville ville1 : villes) {
            if (ville1.getLatitude().equals(ville.getLatitude()) && ville.getLongitude().equals(ville.getLongitude())) {
                return ville;
            }
        }
        villes.add(ville);
    }

    public ArrayList<Ville> consulterVilles() {
        return villes;
    }

    public Ville consulterVilleParCoordonnees(String latitude, String longitude) {
        for (Ville ville : villes) {
            if (ville.getLatitude().equals(latitude) && ville.getLongitude().equals(longitude)) {
                return ville;
            }
        }
        return null; // Si aucune ville correspondante n'est trouvée
    }
}