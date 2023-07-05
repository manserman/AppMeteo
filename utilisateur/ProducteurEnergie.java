
package utilisateur;
public final class ProducteurEnergie extends Profil {
    private final short seuilTemperature;
    private final NiveauEnum seuilVitesseVent;
    private final NiveauEnum seuilEnsoleiment;

    public ProducteurEnergie(short seuilTemperature, NiveauEnum seuilVitesseVent, NiveauEnum seuilEnsoleiment) {
        super();
        this.seuilTemperature = seuilTemperature;
        this.seuilVitesseVent = seuilVitesseVent;
        this.seuilEnsoleiment = seuilEnsoleiment;
    }

    public int getSeuilTemperature() {
        return seuilTemperature;
    }


    public NiveauEnum getSeuilVitesseVent() {
        return seuilVitesseVent;
    }

 

    public NiveauEnum getSeuilEnsoleiment() {
        return seuilEnsoleiment;
    }

}
