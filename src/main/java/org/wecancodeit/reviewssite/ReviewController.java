package org.wecancodeit.reviewssite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/reviews")
    public String findAllReviews(Model model) {
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "reviewsTemplate";

    }

    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value = "id") Long id, Model model) throws  ReviewNotFoundException {
        if (reviewRepo.findOne(id) == null) {
            throw new ReviewNotFoundException();
        }

        model.addAttribute("reviewModel", reviewRepo.findOne(id));
        return "reviewTemplate";
    }
}