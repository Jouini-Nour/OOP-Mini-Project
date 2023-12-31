public class Teacher {
    private int id;
    private String name;
    private String field;

    public String getName(){
        return name;
    }
    public void setField(String f){
        field = f;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String nom) {
        this.name = nom;
    }
    public int getId() {
        return id;
    }
    public String getfield() {
        return field;
    }
    public Teacher(int id, String nom, String field) {
        this.id = id;
        this.name = nom;
        this.field = field;
    }
    
    
}
