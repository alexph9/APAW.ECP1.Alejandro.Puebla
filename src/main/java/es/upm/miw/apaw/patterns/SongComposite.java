package es.upm.miw.apaw.patterns;

import java.util.ArrayList;
import java.util.List;

public class SongComposite extends SongComponent {

    List<SongComponent> songComponentList;

    public SongComposite(String genre){
        super(genre);
        songComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite(){ return true;}

    @Override
    public void add(SongComponent songComponent) {
        songComponentList.add(songComponent);
    }

    @Override
    public void remove(SongComponent songComponent) {
        songComponentList.remove(songComponent);
    }

    @Override
    public String view() {
        return null;
    }
}
