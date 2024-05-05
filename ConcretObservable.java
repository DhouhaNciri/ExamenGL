// ConcretObservable (Projet)
class Projet extends Tache {
    private String id_projet;
    private String nom_projet;
    private Float budget;

    public Projet(String id_projet, String nom_projet, String description, String date_debut, String date_fin,
            String etat, Float budget, Employe responsable) {
        super(nom_projet, description, date_debut, date_fin, etat, responsable);
        this.id_projet = id_projet;
        this.nom_projet = nom_projet;
        this.budget = budget;
    }

    public String getIdProjet() {
        return id_projet;
    }

    public Float getBudget() {
        return budget;
    }
}
