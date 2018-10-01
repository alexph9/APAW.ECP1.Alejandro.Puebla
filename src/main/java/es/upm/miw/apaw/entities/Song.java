package es.upm.miw.apaw.entities;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Song {

    private String id;

    private String duration;

    private LocalDateTime date;

    private Artist artist;

    private Genre genre;

    private List<Download> downloads;

}
