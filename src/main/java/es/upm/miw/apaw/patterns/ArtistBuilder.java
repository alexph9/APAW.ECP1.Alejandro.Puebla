package es.upm.miw.apaw.patterns;

import es.upm.miw.apaw.entities.Artist;

public class ArtistBuilder {

    private Artist artist;

    public ArtistBuilder(String id, String name, boolean isSoloSinger){
        this.artist = new Artist(id, name, isSoloSinger);
    }

    public ArtistBuilder name(String name){
        artist.setName(name);
        return this;
    }

    public ArtistBuilder isSoloSinger(boolean isSoloSinger){
        artist.setSoloSinger(isSoloSinger);
        return this;
    }

    public Artist build(){
        return artist;
    }

}
