import java.util.ArrayList;

public class MusicalShow {
    private Person musicAuthor;
    private String librettoText;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public MusicalShow(Person musicAuthor, String librettoText) {
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }

    public void printListOfActors() {
        if (!listOfActors.isEmpty()) {
            for (Actor actor : listOfActors) {
                System.out.println(actor.getName() + " " + actor.getSurname());
            }
        } else {
            System.out.println("Список пуст!");
        }

    }


    public void addActor(String name, String surname, Gender gender, int height) {
        Actor newActor = new Actor(name, surname, gender, height);
        for (Actor actor : listOfActors) {
            if (listOfActors.equals(actor)) {
                System.out.println("Актер уже есть в спектакле!");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println("Актер добавлен!");

    }

    public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surname)){
                listOfActors.set(i,newActor);
                System.out.println("Актер " + actor.getSurname() + " заменен на " + newActor.getSurname());
                return;
            }
        }
        System.out.println("Данного актера нет!");
    }


    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
}
