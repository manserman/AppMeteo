import java.util.ArrayList;

public final class Pays extends Lieu {
     protected final ArrayList<Region> regions ;
    

    public Pays(int id, Alpha nom, String latitude, String longitude) {
        super( id,  nom, latitude,  longitude);
        this.regions= new ArrayList<Region>();
    }

    public String getnom() {
        return this.nom.getValue();
    }
      public boolean ajouterRegion(Region region) {
         for (Region region1 : regions) {
            if (region1.getLatitude().equals(region.getLatitude()) && region1.getLongitude().equals(region.getLongitude())) {
                return false;
            }
        }
        regions.add(region);
        return false;
    }

    public ArrayList<Region> consulterVilles() {
        return regions;
    }

    public Region consulterVilleParCoordonnees(String latitude, String longitude) {
        for (Region region : regions) {
            if (region.getLatitude().equals(latitude) && region.getLongitude().equals(longitude)) {
                return region;
            }
        }
        return null; // Si aucune  region correspondante n'est trouvée
    }
}