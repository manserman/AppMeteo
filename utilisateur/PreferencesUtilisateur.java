package utilisateur;
public final class PreferencesUtilisateur {
    private int id;
    private short seuilTemperature;
    private NiveauEnum seuilVitesseVent;
    private NiveauEnum seuilNiveauPrecipitation;
    //mettre les catégories de catastrophes
    private boolean tsunami;
    private boolean seisme;
    private boolean catastropheAquatique;

    public PreferencesUtilisateur(int id, short seuilTemperature, NiveauEnum seuilVitesseVent, NiveauEnum seuilNiveauPrecipitation, boolean tsunami, boolean seisme) {
        this.id = id;
        this.seuilTemperature = seuilTemperature;
        this.seuilVitesseVent = seuilVitesseVent;
        this.seuilNiveauPrecipitation = seuilNiveauPrecipitation;
        this.tsunami = tsunami;
        this.seisme = seisme;
    }

    // Ajoutez ici des méthodes pour accéder et modifier les attributs (getters/setters)

    public int getId() {
        return id;
    }

    public int getSeuilTemperature() {
        return seuilTemperature;
    }

    public void setSeuilTemperature(short seuilTemperature) {
        this.seuilTemperature = seuilTemperature;
    }

    public NiveauEnum getSeuilVitesseVent() {
        return seuilVitesseVent;
    }

    public void setSeuilVitesseVent(NiveauEnum seuilVitesseVent) {
        this.seuilVitesseVent = seuilVitesseVent;
    }

    public NiveauEnum getSeuilNiveauPrecipitation() {
        return seuilNiveauPrecipitation;
    }

    public void setSeuilNiveauPrecipitation(NiveauEnum seuilNiveauPrecipitation) {
        this.seuilNiveauPrecipitation = seuilNiveauPrecipitation;
    }

    // Compléter avec les catastrophes
}
