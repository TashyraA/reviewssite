package org.wecancodeit.reviewssite;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    private Map<Long, Review> reviewList = new HashMap<>();
    private Review reviewOne = new Review(1l, "Halloween", "Halloween.jpg", "Horror Film", 1978);
    private Review reviewTwo = new Review(2l, "Slender Man", "slender_man.0.jpeg", "Horror Film", 2018);
    private Review reviewThree = new Review(3l, "The Devil's Rejects", "the-devils-rejects.jpg", "Horror Film", 2005);

    public ReviewRepository() {
        reviewList.put(reviewOne.getId(), reviewOne);
        reviewList.put(reviewTwo.getId(), reviewTwo);
        reviewList.put(reviewThree.getId(), reviewThree);

    }

    public ReviewRepository(Review... reviews) {
        for (Review review : reviews) {
            reviewList.put(review.getId(), review);
        }

    }

    public Review findOneReview(Long Id) {
        return reviewList.get(Id);
    }

    public Collection<Review> findAllReviews() {
        return reviewList.values();
    }


}
