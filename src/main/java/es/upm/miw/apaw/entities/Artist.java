package es.upm.miw.apaw.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Artist {

    private String id;

    private String name;

    private boolean isSoloSinger;

}
