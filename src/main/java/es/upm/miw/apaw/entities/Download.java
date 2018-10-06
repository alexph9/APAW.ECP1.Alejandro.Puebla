package es.upm.miw.apaw.entities;

import java.time.LocalDateTime;

public class Download {

    private Integer price;

    private LocalDateTime date;

    public Download(Integer price, LocalDateTime date) {
        this.price = price;
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
