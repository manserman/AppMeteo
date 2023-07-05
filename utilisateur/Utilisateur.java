import java.util.Objects;
import datatypes.Password;
import datatypes.Alpha;
package utilisateur;
public abstract class Utilisateur {
    protected int id;
    protected Alpha username;
    protected Password password;
    protected final PreferencesUtilisateur preference;
    protected final Profil profil;

    public Utilisateur(int id, String username, String password, PreferencesUtilisateur preference, Profil profil) {
        this.id = id;
        this.username = new  Alpha(username);
        this.password = new Password(password);
        this.preference=preference;
        this.profil=profil;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username.getValue();
    }

    public String getPassword() {
        return password.getValue();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password.setPassword( password );
    }

    public PreferencesUtilisateur getPreferencesUtilisateur(){
        return this.preference;
    }
    
   public Profil getProfil() {
    return this.profil;
   }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Utilisateur utilisateur = (Utilisateur) obj;
        return id == utilisateur.id &&
                Objects.equals(username, utilisateur.username) &&
                Objects.equals(password, utilisateur.password) &&
                Objects.equals(preference, utilisateur.preference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, preference);
    }
}
