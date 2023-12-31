public class Club {
    private String clubName;
    private String descreption;
    public Club(String clubName, String descreption) {
        this.clubName = clubName;
        this.descreption = descreption;
    }
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }
    public String getClubName() {
        return clubName;
    }
    public String getDescreption() {
        return descreption;
    }
}
