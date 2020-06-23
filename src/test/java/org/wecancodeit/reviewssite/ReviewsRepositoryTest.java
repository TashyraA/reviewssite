package org.wecancodeit.reviewssite;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.wecancodeit.reviewssite.Review;
import org.wecancodeit.reviewssite.ReviewRepository;

import javax.annotation.Resource;
import java.util.Collection;

public class ReviewsRepositoryTest {

    @Resource
    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "Review 1 title", "description", "imageURL", 1978);
    private Review reviewTwo = new Review(2L, "Review 2 title", "description", "imageUrl", 2015);



    @Test
    public void shouldReturnReviewOneById() {
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = (Review) underTest.findOneReview(1L);
        assertEquals(foundReview, reviewOne);
    }

    @Test
    public void shouldReturnReviewTwoById() {
        underTest = new ReviewRepository(reviewTwo);
        Review foundReview = (Review) underTest.findOneReview(2L);
        assertEquals(foundReview, reviewTwo);
    }


    @Test
    public void shouldFindAllReviews() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = (Collection<Review>) underTest.findAllReviews();
        assertTrue(foundReviews.contains(reviewOne));
        assertTrue(foundReviews.contains(reviewTwo));
    }
}
