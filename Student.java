import java.util.ArrayList;
public class Student{
    private String nom;
    private int numIns;
    private Major major;
    private ArrayList<Course> courses;

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public int getNumIns() {
        return numIns;
    }
    public Student(String nom,int n) {
        this.nom = nom;
        numIns = n;
    }
    public Major getMajor() {
        return major;
    }
    public void setMajor(Major major) {
        this.major = major;
    }
    public void enroll(Course c){
        courses.add(c);
    }
    public void displayEnrollments(){
        System.out.println(nom+" is enrolled in:\n");
        for(int i =0;i<courses.size();i++){
            System.out.println(courses.get(i));
        }
    }
}