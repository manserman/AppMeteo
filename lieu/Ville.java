public final class Ville extends Lieu{

    public Ville(int id, Alpha nom, String latitude, String longitude) {
        super( id,  nom, latitude,  longitude);
    }

    public String getnom() {
        return this.nom.getValue();
    }
}