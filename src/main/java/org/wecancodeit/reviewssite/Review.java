package org.wecancodeit.reviewssite;

public class Review {
    private long Id;
    private String title;
    private String imageUrl;
    private String description;
    private long year;


    public long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public long getYear() {
        return year;
    }

    public Review(long Id, String title, String imageUrl, String description, long year) {
        this.Id = Id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.year = year;
    }

}

