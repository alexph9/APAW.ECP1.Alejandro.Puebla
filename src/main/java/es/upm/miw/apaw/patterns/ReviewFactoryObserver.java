package es.upm.miw.apaw.patterns;

import java.util.Observable;
import java.util.Observer;

public class ReviewFactoryObserver implements Observer {

    private ReviewFactory reviewFactory;

    public ReviewFactoryObserver(ReviewFactory reviewFactory){
        this.reviewFactory = reviewFactory;
        this.reviewFactory.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ReviewFactory says: " + arg);
    }
}
