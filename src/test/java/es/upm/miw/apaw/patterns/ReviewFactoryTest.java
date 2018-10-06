package es.upm.miw.apaw.patterns;

import es.upm.miw.apaw.entities.Review;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReviewFactoryTest {

    private static ReviewFactory reviewFactory;
    private static Review review1;

    @BeforeAll
    static void before() {
        reviewFactory = reviewFactory.getReviewFactory();
        review1 = new Review("1", false, "Fantastic Song!");
    }

    @Test
    void testGetReview(){
        reviewFactory.setReview(review1);
        Review testReview = reviewFactory.getReview("1");
        assertEquals("1", testReview.getId());
        assertEquals(false, testReview.isNegative());
        assertEquals("Fantastic Song!", testReview.getDescription());
    }

   @Test
    void testRemoveReview(){
       reviewFactory.setReview(review1);
       reviewFactory.removeReview("1");
       assertNull(reviewFactory.getReview("1"));
    }

}
