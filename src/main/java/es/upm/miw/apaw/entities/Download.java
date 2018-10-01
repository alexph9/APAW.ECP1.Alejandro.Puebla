package es.upm.miw.apaw.entities;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Download {

    private Integer price;

    private LocalDateTime date;

}
