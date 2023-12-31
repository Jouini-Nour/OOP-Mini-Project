public class Staff {
    private String nom;
    private float salaire;
    private int ID;
    public String getNom() {
        return nom;
    }
    public float getSalaire() {
        return salaire;
    }
    public int getID() {
        return ID;
    }
    public Staff(String nom, float salaire, int iD) {
        this.nom = nom;
        this.salaire = salaire;
        ID = iD;
    }
    
}
