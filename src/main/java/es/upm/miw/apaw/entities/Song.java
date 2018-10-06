package es.upm.miw.apaw.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Song {

    private String id;

    private String duration;

    private LocalDateTime date;

    private Artist artist;

    private Genre genre;

    private List<Download> downloads;

    public Song(String id, String duration, LocalDateTime date, Artist artist, Genre genre) {
        this.id = id;
        this.duration = duration;
        this.date = date;
        this.artist = artist;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public String getDuration() {
        return duration;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Artist getArtist() {
        return artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public List<Download> getDownloads() {
        return downloads;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void addDownload(Download download){
        this.downloads.add(download);
    }
}
