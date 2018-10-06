package es.upm.miw.apaw.patterns;

public abstract class SongComponent {

    private String name;

    public SongComponent(String name){
        this.name = name;
    }

    public abstract boolean isComposite();

    public abstract void add(SongComponent songComponent);

    public abstract void remove(SongComponent songComponent);
}
