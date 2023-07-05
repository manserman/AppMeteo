import java.util.ArrayList;
package utilisateur;
public abstract class Profil {
    protected final ArrayList<Utilisateur> utilisateurs;
    public Profil(){
        this.utilisateurs= new ArrayList<Utilisateur>();
    }
    public boolean addUtilisateur(Utilisateur user)
    {
        for(Utilisateur utilisetur : utilisateurs)
        {
          if(utilisetur.equals(user))
          return false;
        }
        utilisateurs.add(user);
        return true;
    }
    public Utilisateur getUtilisateur(int id) {
         for(Utilisateur utilisetur : utilisateurs)
        {
          if(utilisetur.getId()==id)
          return utilisetur;
        }
        return null;
    }
}
