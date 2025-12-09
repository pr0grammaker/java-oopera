import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }


    public void printListOfActors() {
        if (!listOfActors.isEmpty()) {
            for (Actor actor : listOfActors) {
                System.out.println(actor.toString());
            }
        } else {
            System.out.println("Список пуст!");
        }

    }


    public void addActor(String name, String surname, Gender gender, int height) {
        Actor newActor = new Actor(name, surname, gender, height);
        for (Actor actor : listOfActors) {
            if (listOfActors.contains(actor)) {
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
            if (actor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актер " + actor.getSurname() + " заменен на " + newActor.getSurname());
                return;
            }
        }
        System.out.println("Данного актера нет!");
    }


    public void infoAboutDirector() {
        System.out.println(director.toString());
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}
