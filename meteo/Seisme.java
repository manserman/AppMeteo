
package meteo;
import datatypes.DateDataType;

public final class Seisme extends Catastrophe{
    private NiveauEnum magnitude;

    public Seisme(int id, CatastropheEnum nom, DateDataType date, NiveauEnum magnitude ) {
        super( id,  nom, date);
        this.magnitude = magnitude;
    }

    public NiveauEnum getMagnitude() {
        return this.magnitude;
    }

}