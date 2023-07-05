package utilisateur;
public final class Entreprise extends Utilisateur {
    private final String siret;
    public Entreprise( int id, String username, String password, PreferencesUtilisateur preference, String siret, Profil profil){
        super(id, username, password, preference, profil);
        this.siret=siret;

    }

    public String getSiret() {
        return this.siret;
    }
    
}
