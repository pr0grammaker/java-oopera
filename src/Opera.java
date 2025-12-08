public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(Person musicAuthor, String librettoText, int choirSize) {
        super(musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }


}
