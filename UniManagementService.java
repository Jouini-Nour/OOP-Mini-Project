import java.time.LocalDate;
import java.util.Scanner;

public class UniManagementService {
    public static void main(String[] args){
        University myUni = new University("INSAT");
        Major CH = new Major("Chemical Engineering",1);
        Major BIO = new Major("Biological Engineering",2);
        Major GL = new Major("Software Engineering",3);
        Major RT = new Major("Telecommunication Engineering",4);
        Major IIA = new Major("Industrial Automation Engineering",5);
        Major IMI = new Major("Instrumentation & Maintenance Engineering",6);
        myUni.addMajor(CH);
        myUni.addMajor(BIO);
        myUni.addMajor(GL);
        myUni.addMajor(RT);
        myUni.addMajor(IIA);
        myUni.addMajor(IMI);
        
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("WELCOME to "+myUni.getName()+" Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. List Students");
            System.out.println("4. Add Teacher");
            System.out.println("5. Remove Teacher");
            System.out.println("6. List Teachers");
            System.out.println("7. Add Club");
            System.out.println("8. Remove Club");
            System.out.println("9. List Clubs");
            System.out.println("10. Add Event");
            System.out.println("11. Remove Event");
            System.out.println("12. List Events");
            System.out.println("13. Add Classroom");
            System.out.println("14. Remove Classroom");
            System.out.println("15. List Classrooms");
            System.out.println("16. Add Course");
            System.out.println("17. Remove Course");
            System.out.println("18. List Courses");
            System.out.println("19. Add Staff");
            System.out.println("20. Remove Staff");
            System.out.println("21. List Staff");

            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("What's the Student's name: ");
                    String name = sc.nextLine();
                    System.out.print("Registration Number:");
                    int id = sc.nextInt();
                    Student s  = new Student(name,id);
                    System.out.println("What's his major ? ");
                    myUni.listMajors();
                    int maj = sc.nextInt();
                    switch(maj){
                        case 1:
                            s.setMajor(CH);
                            break;
                        case 2:
                            s.setMajor(BIO);
                            break;
                        case 3:
                            s.setMajor(GL);
                            break;
                        case 4:
                            s.setMajor(RT);
                            break;
                        case 5:
                            s.setMajor(IIA);
                            break;
                        case 6:
                            s.setMajor(IMI);
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                    }
                    
                    if(myUni.findStudent(s)){
                        System.out.println("Sorry this Student is already registered.");
                    }
                    else{
                        myUni.addStudent(s);
                    }
                    break;
                case 2:
                    System.out.print("Registration Number for the student to remove: ");
                    int reg = sc.nextInt();
                    myUni.removeStudent(reg);
                    break;
                case 3:
                    myUni.listStudents();
                    break;
                case 4:
                    System.out.print("What's the Teacher's name:");
                    String n =sc.nextLine();
                    System.out.print("What's his ID: ");
                    int ref = sc.nextInt();
                    sc.nextLine();
                    System.out.print("What's his Field: ");
                    String f =sc.nextLine();
                    Teacher t = new Teacher(ref, n, f);
                    if(myUni.findTeacher(t)){
                        System.out.println("Sorry this Teacher is already registered.");
                    }
                    else{
                        myUni.addTeacher(t);
                    }
                    break;
                case 5:
                    System.out.print("ID of the Teacher to remove: ");
                    int re = sc.nextInt();
                    myUni.removeStudent(re);
                    break;
                case 6:
                    myUni.listTeachers();
                    break;
                case 7:
                    System.out.print("Club Name: ");
                    String clubn = sc.nextLine();
                    System.out.print("A Brief Descreption: ");
                    String desc = sc.nextLine();
                    Club club = new Club(clubn, desc);
                    myUni.addClub(club);
                    break;
                case 8:
                    myUni.listClubs();
                    System.out.print("Give club name to remove:");
                    String rem = sc.nextLine();
                    myUni.removeClub(rem);
                    break;
                case 9:
                myUni.listClubs();
                    break;
                case 10:
                    int day,month;
                    System.out.print("Event's Name: "); 
                    String nameE = sc.nextLine();
                    do  {
                        System.out.print("Date of the Event(Month): ");
                        month = sc.nextInt();
                        sc.nextLine(); 
                    } while((month>12)||(month<1));
                    do  {
                        System.out.print("Date of the Event(Day): ");
                        day = sc.nextInt();
                        sc.nextLine(); 
                    } while((day>30)||(day<1));
                    LocalDate da = LocalDate.of(2024,month,day);
                    System.out.print("A brief descreprtion of the event");
                    String descrip= sc.nextLine();
                    System.out.print("Organizing Club: ");
                    myUni.listClubs();
                    int clubid = sc.nextInt();
                    sc.nextLine();
                    Event eve = new Event(nameE,myUni.geClubs().get(clubid-1).getClubName() , da, descrip);
                    myUni.addEvent(eve);
                    break;
                case 11:
                    do  {
                        System.out.print("Date of the Event to remove(Month): ");
                        month = sc.nextInt();
                        sc.nextLine(); 
                    } while((month>12)||(month<1));
                    do  {
                        System.out.print("Date of the Event to remove(Day): ");
                        day = sc.nextInt();
                        sc.nextLine(); 
                    } while((day>30)||(day<1));
                    LocalDate dateR= LocalDate.of(2024,month,day);
                    myUni.removeEvent(dateR);
                    break;
                case 12:
                    myUni.listEvents();
                    break;
                case 13:
                    System.out.print("What's the ID of the classroom you want to add:");
                    int c  = sc.nextInt();
                    sc.nextLine();
                    System.out.print("What's its size: ");
                    int d  = sc.nextInt();
                    sc.nextLine();
                    Classroom a = new Classroom(d, c);
                    myUni.addClassroom(a);
                    break;
                case 14:
                    System.out.print("ID of the class to remove:");
                    int cl = sc.nextInt();
                    sc.nextLine();
                    myUni.removeClassroom(cl);
                    break;
                case 15:
                    myUni.listClassrooms();
                    break;
                case 16:
                    System.out.print("Course Name: ");
                    String coursename = sc.nextLine();
                    System.out.print("Course ID: ");
                    int coursID = sc.nextInt();
                    sc.nextLine();
                    Course course = new Course(coursename, coursID);
                    myUni.addCourse(course);
                    break;
                case 17:
                    System.out.print("ID of Course to remove: ");
                    int courseR = sc.nextInt();
                    myUni.removeCourse(courseR); 
                    break;
                case 18:
                    myUni.listCourses();
                    break;
                case 19:
                    System.out.print("Staff ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Staff Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Salary: ");
                    float ssalry= sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Janitor 1,Administrator 2, Security 3");
                    int choix = sc.nextInt();
                    switch(choix){
                        case 1:
                            Staff st1 = new Janitor(sname, ssalry, sid);
                            myUni.addStaff(st1);
                            break;
                        case 2:
                            Staff st2 = new Adminastrator(sname, ssalry, sid);
                            myUni.addStaff(st2);
                            break;
                        case 3:
                            Staff st3 = new Security(sname, ssalry, sid);
                            myUni.addStaff(st3);
                            break;
                        default:
                            System.out.println("Please Enter a valid Choice: ");
                    }
                    break;
                case 20:
                    System.out.print("Staff ID to remove: ");
                    int sidr = sc.nextInt();
                    sc.nextLine();
                    myUni.removeStaff(sidr);
                    break;
                case 21:
                    myUni.listStaff();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        sc.close();
    
    }
}
