
package meteo;
import datatypes.DateDataType;

public final class CatastropheAquatique extends Catastrophe{
    private NiveauEnum hauteurVagueur;

    public CatastropheAquatique(int id, CatastropheEnum nom, DateDataType date, NiveauEnum hauteurVagueur ) {
        super( id,  nom, date);
        this.hauteurVagueur = hauteurVagueur;
    }

    public NiveauEnum getHauteurVagueur() {
        return hauteurVagueur;
    }

}