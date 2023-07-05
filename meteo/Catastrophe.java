public abstract class Catastrophe {
    private final int id;
    private CatastropheEnum nom;
    private final DateDataType date;

    public Catastrophe(int id, CatastropheEnum nom, DateDataType date) {
        this.id = id;
        this.nom = nom;
        this.date = date;
    }

    // Ajoutez ici des méthodes pour accéder et modifier les attributs (getters/setters)

    public int getId() {
        return id;
    }

    public CatastropheEnum getNom() {
        return nom;
    }

    public void setNom(CatastropheEnum nom) {
        this.nom = nom;
    }

    public DateDataType getDate() {
        return date;
    }
}
