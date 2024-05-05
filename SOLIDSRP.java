
public class Projet {

    private int idProjet;
    private String titre;
    private String description;
    private Date dateCreation;
    private Date dateDebut;
    private Date dateFin;

    // Constructor
    public Projet(int idProjet, String titre, String description, Date dateCreation, Date dateDebut, Date dateFin) {
        this.idProjet = idProjet;
        this.titre = titre;
        this.description = description;
        this.dateCreation = dateCreation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    // Getters for project data
    public int getIdProjet() {
        return idProjet;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }
}

// Separate class for Project Management functionalities
public class GestionProjet {

    private ProjetDao projetDao; // Assuming ProjetDao for data access

    public GestionProjet(ProjetDao projetDao) {
        this.projetDao = projetDao;
    }

    // Methods for adding, modifying, and deleting projects
    public void ajouterProjet(Projet projet) {
        projetDao.save(projet);
    }

    public void modifierProjet(Projet projet) {
        projetDao.update(projet);
    }

    public void supprimerProjet(int idProjet) {
        projetDao.delete(idProjet);
    }
}

// Separate class for Project Listing functionalities (assuming a Service
// approach)
public class ServiceListeProjet {

    private ProjetDao projetDao; // Assuming ProjetDao for data access

    public ServiceListeProjet(ProjetDao projetDao) {
        this.projetDao = projetDao;
    }

    // Methods for listing all projects or a specific project
    public List<Projet> listerProjets() {
        return projetDao.findAll();
    }

    public Projet listerProjet(int idProjet) {
        return projetDao.findById(idProjet);
    }
}

// Interface for Project Data Access (implementation details omitted for
// brevity)
public interface ProjetDao {

    void save(Projet projet);

    void update(Projet projet);

    void delete(int idProjet);

    List<Projet> findAll();

    Projet findById(int idProjet);
}