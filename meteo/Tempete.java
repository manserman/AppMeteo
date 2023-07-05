
package meteo;
import datatypes.DateDataType;

public final class Tempete extends Catastrophe{
    private NiveauEnum intensite;

    public Tempete(int id, CatastropheEnum nom, DateDataType date, NiveauEnum intensite ) {
        super( id, nom, date);
        this.intensite = intensite;
    }

    public NiveauEnum getTempete() {
        return this.intensite;
    }

}