public class Ballet extends MusicalShow {
    private Person choreographer;


    public Ballet(Person musicAuthor, String librettoText, Person choreographer) {
        super(musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}
