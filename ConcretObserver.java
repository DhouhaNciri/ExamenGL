// ConcretObserver
class ObservateurConcret implements TacheObserver {
    @Override
    public void update(Tache tache) {
        System.out.println("Notification pour la tâche " +
                tache.getTitre() + ": La tâche est maintenant " + tache.getEtat());
    }
}
