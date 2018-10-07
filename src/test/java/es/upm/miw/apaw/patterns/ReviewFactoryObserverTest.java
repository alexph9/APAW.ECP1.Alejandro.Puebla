package es.upm.miw.apaw.patterns;

import es.upm.miw.apaw.entities.Review;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReviewFactoryObserverTest {

    private static ReviewFactory reviewFactory;
    private static Review review1;

    @BeforeAll
    static void before() {
        reviewFactory = ReviewFactory.getReviewFactory();
        review1 = new Review("1", false, "Fantastic Song!");
    }

    @Test
    void testObserverUpdate(){
        ReviewFactoryObserver observer = new ReviewFactoryObserver(reviewFactory);
        reviewFactory.setReview(review1);
    }

}
