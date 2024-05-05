import java.util.ArrayList;
import java.util.List;

//  Observable (Tache)
class Tache {
    private String titre;
    private String description;
    private String date_debut;
    private String date_fin;
    private String etat;
    private Employe responsable;
    private List<TacheObserver> observers = new ArrayList<>();

    public Tache(String titre, String description, String date_debut, String date_fin, String etat,
            Employe responsable) {
        this.titre = titre;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.etat = etat;
        this.responsable = responsable;
    }

    public void addObserver(TacheObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TacheObserver observer) {
        observers.remove(observer);
    }

    public void setEtat(String etat) {
        this.etat = etat;
        notifyObservers();
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public String getDateDebut() {
        return date_debut;
    }

    public String getDateFin() {
        return date_fin;
    }

    public String getEtat() {
        return etat;
    }

    public Employe getResponsable() {
        return responsable;
    }

    private void notifyObservers() {
        for (TacheObserver observer : observers) {
            observer.update(this);
        }
    }
}
