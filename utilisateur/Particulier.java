package utilisateur;
public final class Particulier extends Utilisateur{
    public Particulier( int id, String username, String password, PreferencesUtilisateur preference, Profil profil){
        super(id, username, password, preference, profil);
        }
}
