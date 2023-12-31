import java.time.LocalDate;
import java.util.ArrayList;
public class University {
    private String name;
    private ArrayList<Club> clubs;
    private ArrayList<Staff> staff;
    private ArrayList<Teacher> teachers;
    private ArrayList<Event> events;
    private ArrayList<Classroom> classes;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Major> majors;
    public University(String name) {
        this.name = name;
        this.clubs = new ArrayList<>();
        this.staff = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.events = new ArrayList<>();
        this.classes = new ArrayList<>();
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.majors = new ArrayList<>();
    }
    public ArrayList<Club> geClubs(){
        return clubs;
    }
    public String getName(){
        return name;
    }
    public void addClub(Club club) {
        if(findClub(club.getClubName())){
            System.out.println("This club already exists.");
        }
        else{
            clubs.add(club);
        }
    }
    private boolean findClub(String c){
        for(int i =0;i<clubs.size();i++){
            if(clubs.get(i).getClubName()==c){
                return true;
            }
        }
        return false;
    }
    public void removeClub(String clubName) {
        boolean found = false;
        for(int i =0;i<clubs.size();i++){
            if(clubs.get(i).getClubName()==clubName){
                clubs.remove(clubs.get(i));
                found = true;
            }
        }
        if(!found){
            System.out.println("The club "+clubName+" is not among "+getName()+" Clubs.");
        }
    }
    public void listClubs(){
        for(int i =0;i<clubs.size();i++){
            System.out.println(clubs.get(i).getClubName());
            System.out.println(clubs.get(i).getDescreption());
        }
    }
    public void addStaff(Staff staffMember) {
        if(findStaff(staffMember)){
            System.out.println("This Staff Member already exists.");
        }
        else{
            staff.add(staffMember);
        }
    }

    public void removeStaff(int sidr) {
        boolean found = false;
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).getID() == sidr) {
                staff.remove(i);
                found = true;
                break;  
            }
        }
        if (!found) {
            String s = String.format("The Staff Member with the ID %d does not exist.", sidr);
            System.out.println(s);
        }
    }
    private boolean findStaff(Staff s){
        for(int i=0;i<staff.size();i++){
            if((staff.get(i).getID())==s.getID()){
                return true;
            }
        }
        return false;
    }
    public void listStaff(){
        for (int i = 0; i < staff.size(); i++) {
            System.out.println(staff.get(i).getID()+":"+staff.get(i).getNom()+"\nSalary: "+staff.get(i).getSalaire());
        }
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public boolean findTeacher(Teacher t){
        for(int i=0;i<teachers.size();i++){
            if((teachers.get(i).getId())==t.getId()){
                return true;
            }
        }
        return false;
    }

    public void removeTeacher(int d) {
        boolean teacherFound = false;
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == d) {
                students.remove(i);
                teacherFound = true;
                break;  
            }
        }
        if (!teacherFound) {
            String s = String.format("The Teacher with the ID %d does not exist.", d);
            System.out.println(s);
        }
    }
    public void listTeachers(){
        for(int i=0;i<teachers.size();i++){
            System.out.println((i+1)+"**Teachers ID: "+teachers.get(i).getId());
            System.out.println("Student's name: "+teachers.get(i).getName());
            System.out.println("Field: "+teachers.get(i).getfield());
        }

    }

    public void addEvent(Event event) {
        if(findEventdate(event)){
            System.out.println("Sorry can't add an event in the same date as another existing event");
        }
        events.add(event);
    }
    private boolean findEventdate(Event event){
        for(int i = 0;i<events.size();i++){
            if(events.get(i).getDate().equals(event.getDate())){
                return true;
            }
        }
        return false;
    }
    public void removeEvent(LocalDate date) {
        boolean found=false;
        for(int i = 0;i<events.size();i++){
            if(events.get(i).getDate().equals(date)){
                events.remove(events.get(i));
                found = true;
            }
        }
        if(!found){
            System.out.println("There is no event on "+date);
        }
    }
    public void listEvents(){
        for(int i = 0;i<events.size();i++){
            System.out.print(events.get(i).getEventName()+"\nOrganizer: "+events.get(i).getOrganizer()+"\nDate: "+events.get(i).getDate());
            System.out.print("\n"+events.get(i).getDescreption());
        }
    }
    public void addClassroom(Classroom classroom) {
        if(findClassroom(classroom)){
            System.out.print("This Classroom already exists");
        }
        else{
        classes.add(classroom);
        }
    }
    public void removeClassroom(int b) {
        boolean classFound = false;
        for(int i =0;i<classes.size();i++){
            if(classes.get(i).getID()==b){
                classes.remove(classes.get(i));
                classFound = true;
            }
        }
        if(!classFound){
            String s = String.format("Sorry the classroom %d doesn't exist.",b);
            System.out.println(s);
        }
    }
    private boolean findClassroom(Classroom c){
        for(int i =0;i<classes.size();i++){
            if(classes.get(i).getID()==c.getID()){
                return true;
            }
        }
        return false;
    }
    public void listClassrooms(){
        for(int i = 0;i<classes.size();i++){
            System.out.println("Class: "+classes.get(i).getID());
            System.out.println("Size: "+classes.get(i).getSize());
        }
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        boolean studentFound = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getNumIns() == id) {
                students.remove(i);
                studentFound = true;
                break;  
            }
        }
        if (!studentFound) {
            String s = String.format("The student with the registration number %d does not exist.", id);
            System.out.println(s);
        }
    }
    public boolean findStudent(Student s){
        for(int i=0;i<students.size();i++){
            if((students.get(i)).getNumIns()==s.getNumIns()){
                return true;
            }
        }
        return false;
    }
    public void listStudents(){
        for(int i=0;i<students.size();i++){
            System.out.println((i+1)+"**Student's Registration Number: "+students.get(i).getNumIns());
            System.out.println("Student's name: "+students.get(i).getNom());
            System.out.println("Major: "+students.get(i).getMajor().getName());
        }
    }
    public void addCourse(Course course) {
        if(findCourse(course)){
            System.out.println("This course already exists.");
        }
        else{
            courses.add(course);
        }
    }
    private boolean findCourse(Course c){
        for(int i = 0;i<courses.size();i++){
            if(courses.get(i).getCourseId() == c.getCourseId()){
                return true;
            }
        }
        return false;
    }
    
    public void removeCourse(int id) {
        boolean found = false;
        for(int i = 0;i<courses.size();i++){
            if(courses.get(i).getCourseId() == id){
                courses.remove(courses.get(i));
                found  =true;
            }
        }
        if(!found){
            System.out.println("This course doesn't exist");
        }
    }
    public void listCourses(){
        for(int i =0;i<courses.size();i++){
            System.out.println(courses.get(i).getCourseId()+":"+courses.get(i).getCourseName());
        }
    }
    public void addMajor(Major m){
        majors.add(m);
    }
    public void removeMajor(Major m){
        majors.remove(m);
    }
    public void listMajors(){
        for(int i = 0;i<majors.size();i++){
            String str = (i+1) +":"+ majors.get(i).getName();
            System.out.println(str);
        }
    }

}
