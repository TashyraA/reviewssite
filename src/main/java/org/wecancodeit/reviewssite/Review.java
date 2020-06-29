package org.wecancodeit.reviewssite;

public class Review {
    private long Id;
    private String title;
    private String imageUrl;
    private String reviewCategory;
    private String content;

    public Review(long Id, String title, String imageUrl, String reviewCategory, String content) {
        this.Id = Id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.content = content;

    }
        public long getId () {
            return Id;
        }

        public String getTitle () {
            return title;
        }

        public String getImageUrl () {
            return imageUrl;
        }

        public String getReviewCategory () {
            return reviewCategory;
        }


        public String getContent() {
            return content;
        }


    }



