package es.upm.miw.apaw.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Review {

    private String id;

    private boolean isNegative;

    private String description;

}
