package org.wecancodeit.reviewssite;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1l, "House of 1000 Corpses", "url", "category", "content");
    private Review reviewTwo = new Review(2l, "The Devil's Rejects", "url", "category", "content");

    @Test
    public void t1ShouldFindReviewOne() {
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1l);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void t2shouldFindReviewOneAndReviewTwo() {
        underTest = new ReviewRepository(reviewOne);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }

}