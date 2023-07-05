import java.util.ArrayList;

public abstract class Lieu {
    protected final int id;
    protected final Alpha nom;
    protected final Coordonnee latitude;
    protected final Coordonnee longitude;
    protected final ArrayList<Meteo> meteos;

     public Lieu(int id, Alpha nom, String latitude, String longitude) {
        this.id = id;
        this.nom = nom;
        this.latitude = new Coordonnee(longitude);
        this.longitude = new Coordonnee(longitude);
        meteos= new ArrayList<Meteo>();
    }


    public int getId() {
        return id;
    }

    public Alpha getNom() {
        return nom;
    }
   
    public String getLatitude() {
        return latitude.getValue();
    }

    public String getLongitude() {
        return latitude.getValue();
    }
    public boolean ajouterMeteo(Meteo meteo) {
        if (meteos.contains(meteo)) {
            return false; // La météo est déjà présente
        } else {
            meteos.add(meteo);
            return true;
        }
    }

    public Meteo trouverMeteoParId(int id) {
        for (Meteo meteo : meteos) {
            if (meteo.getId() == id) {
                return meteo;
            }
        }
        return null; // Aucune météo correspondante trouvée
    }

    public ArrayList<Meteo> obtenirToutesMeteos() {
        return meteos;
    }
}



