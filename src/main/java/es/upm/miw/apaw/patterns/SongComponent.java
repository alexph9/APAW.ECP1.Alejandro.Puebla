package es.upm.miw.apaw.patterns;

public abstract class SongComponent {

    private String id;

    public SongComponent(String id){
        this.id = id;
    }

    public abstract boolean isComposite();

    public abstract void add(SongComponent songComponent);

    public abstract void remove(SongComponent songComponent);
}
