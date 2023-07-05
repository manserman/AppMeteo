package utilisateur;
public class EntrepriseTransport extends Profil {
    private final NiveauEnum verglas;
    private final NiveauEnum neige;
    private final float precipitation;

    public EntrepriseTransport(NiveauEnum verglas, NiveauEnum neige, float precipitation) {
        super();
        this.verglas = verglas;
        this.neige = neige;
        this.precipitation = precipitation;
    }

    public NiveauEnum getVerglas() {
        return verglas;
    }


    public NiveauEnum getNeige() {
        return neige;
    }


    public float getPrecipitation() {
        return precipitation;
    }

}
