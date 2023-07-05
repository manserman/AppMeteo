import java.util.List;



public final class Meteo {
    private final int id;
    private final short temperature;
    private final NiveauEnum vitesseVent;
    private final NiveauEnum niveauPrecipitation;
    private List<Catastrophe> catastrophes;

    public Meteo(int id, short temperature, NiveauEnum vitesseVent, NiveauEnum niveauPrecipitation, List<Catastrophe> catastrophes) {
        this.id = id;
        this.temperature = temperature;
        this.vitesseVent = vitesseVent;
        this.niveauPrecipitation = niveauPrecipitation;
        this.catastrophes = catastrophes;
    }

    public int getId() {
        return id;
    }

    public short getTemperature() {
        return temperature;
    }

    public NiveauEnum getVitesseVent() {
        return vitesseVent;
    }

    public NiveauEnum getNiveauPrecipitation() {
        return niveauPrecipitation;
    }

    public List<Catastrophe> getCatastrophes() {
        return catastrophes;
    }

    public void setCatastrophes(List<Catastrophe> catastrophes) {
        this.catastrophes = catastrophes;
    }
}
