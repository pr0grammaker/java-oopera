import java.util.ArrayList;

public class Show extends MusicalShow {
    private static String title;
    private int duration;
    private String director;
    private static ArrayList<Actor> listOfActors;

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors, Person musicAuthor,
                String librettoText) {
        super(musicAuthor, librettoText);
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Show.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public static ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public static void setListOfActors(ArrayList<Actor> listOfActors) {
        Show.listOfActors = listOfActors;
    }


}
