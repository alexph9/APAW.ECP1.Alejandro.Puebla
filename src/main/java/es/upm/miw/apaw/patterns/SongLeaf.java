package es.upm.miw.apaw.patterns;

import es.upm.miw.apaw.entities.Song;

public class SongLeaf extends SongComponent {

    private Song song;

    public SongLeaf(Song song){
        super(song.getId());
        this.song = song;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(SongComponent songComponent) {
        // Not implement because is a leaf
    }

    @Override
    public void remove(SongComponent songComponent) {
        // Not implement because is a leaf
    }

    public Song getSong(){
        return song;
    }
}
