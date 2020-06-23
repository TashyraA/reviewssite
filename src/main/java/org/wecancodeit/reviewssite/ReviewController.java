package org.wecancodeit.reviewssite;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviewssite.ReviewNotFoundException;
import org.wecancodeit.reviewssite.ReviewRepository;

import javax.annotation.Resource;

@RequestMapping("/show-reviews")
@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @GetMapping("")
    public String findAllReviews(Model model) {

        model.addAttribute("reviewsModel", reviewRepo.findAllReviews());
        return "reviews-template";

    }

    @GetMapping("/{Id}")
    public String findOneReview(@PathVariable(value = "Id") Long Id, Model model) throws ReviewNotFoundException {

        if (reviewRepo.findOneReview(Id) == null) {
            throw new ReviewNotFoundException();
        }

        model.addAttribute("reviewModel", reviewRepo.findOneReview(Id));
        return "review-template";
    }
}
