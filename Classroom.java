
public class Classroom {
    private int size;
    private int placeVide;
    private int ID;
    public int getPlaceVide(){
        return placeVide;
    }
    public int getSize(){
        return size;
    } 
    public int getID(){
        return ID;
    }
    public void addStudents(int i){
        if((placeVide-i)<0){
            System.out.println("Il n'y a pas de place pour ces etudiants.");
        }
        else{
            placeVide = placeVide -i;
        }
    }
    public Classroom(int size,int ID){
        this.ID = ID;
        this.size = size;
        placeVide = size;
    }
}
