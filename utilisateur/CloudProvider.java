package utilisateur;
public final class CloudProvider extends Profil{
    private final int seuilTemperature;
    private final int seuilVitesseVent;
    private final NiveauEnum seuilEnsoleiment;

    public CloudProvider (int seuilTemperature, int seuilVitesseVent, NiveauEnum seuilEnsoleiment) {
        super();
        this.seuilTemperature = seuilTemperature;
        this.seuilVitesseVent = seuilVitesseVent;
        this.seuilEnsoleiment = seuilEnsoleiment;
    }

    public int getSeuilTemperature() {
        return seuilTemperature;
    }


    public int getSeuilVitesseVent() {
        return seuilVitesseVent;
    }

    public NiveauEnum getSeuilEnsoleiment() {
        return seuilEnsoleiment;
    }
    
}
