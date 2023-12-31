import java.time.*;
public class Event {
    private String organizer;
    private  LocalDate date;
    private String descreption;
    private String name;

    public Event(String name,String c,LocalDate date,String d){
        organizer = c;
        this.name = name;
        this.date = date;
        descreption = d;
    }
    public String getEventName(){
        return name;
    }
    public String getOrganizer() {
        return organizer;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescreption() {
        return descreption;
    }
    
}
