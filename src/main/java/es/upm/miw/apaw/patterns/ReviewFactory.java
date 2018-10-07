package es.upm.miw.apaw.patterns;

import es.upm.miw.apaw.entities.Review;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class ReviewFactory extends Observable {

    private static final ReviewFactory reviewFactory = new ReviewFactory();

    private Map<String, Review> reviews;

    public ReviewFactory(){
        this.reviews = new HashMap<>();
    }

    public static ReviewFactory getReviewFactory() {
        return reviewFactory;
    }

    public void setReview(Review review){
        reviews.put(review.getId(), review);
        this.notifyObservers();
    }

    public Review getReview(String id){
        return reviews.get(id);
    }

    public void removeReview(String id){
        this.reviews.remove(id);
    }

}
