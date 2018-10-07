package es.upm.miw.apaw.patterns;

public abstract class SongComponent {

    private String genre;

    public SongComponent(String genre){
        this.genre = genre;
    }

    public abstract boolean isComposite();

    public abstract void add(SongComponent songComponent);

    public abstract void remove(SongComponent songComponent);
}
