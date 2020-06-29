package org.wecancodeit.reviewssite;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review houseOf1000Corpses = new Review(1l, "House of 1000 Corpses", "movie.png", "Horror Film", "\"House of 1000 Corpses\" An empty fuel tank and a flat tire lead two couples down a terror-riddled road to the House of 1000 Corpses. \"House of 1000 Corpses\" is at its core a story of family - a cast of twisted individuals who, with each slash of a throat or stab thru the chest, add bodies to their sick human menagerie.");
        Review theDevilsRejects = new Review(2l, "The Devil's Rejects", "./images/devilsrejects.jpg", "Horror Film", "\"The Devil's Rejects\"DescriptionAfter a raid on the rural home of the psychopathic Firefly family, two members of the clan, Otis (Bill Moseley) and Baby (Sheri Moon Zombie), manage to flee the scene. Heading to a remote desert motel, the killers reunite with Baby's father, Capt. Spaulding (Sid Haig), who is equally demented and intent on maintaining their murder spree. While the trio continues to torment and kill various victims, the vengeful Sheriff Wydell (William Forsythe) slowly closes in on them.");
        Review halloween = new Review(3l, "Halloween", "./images/halloween.jpg", "Horror Film", "\"Nearly two decades after being committed to a mental institution for killing his stepfather and older sister, Michael Myers (Tyler Mane) breaks out, intent on returning to the town of Haddonfield, Ill. He arrives in his hometown on Halloween with the indomitable purpose of hunting down his younger sister, Laurie (Scout Taylor-Compton). The only thing standing between Michael and a Halloween night of bloody carnage is psychologist Dr. Samuel Loomis (Malcolm).");
        Review halloweenII = new Review(4l, "Halloween II", "./images/halloween2.jpg", "Horror Film", "\"A year after narrowly escaping death at the hands of Michael Myers (Tyler Mane), Laurie Strode is at the breaking point, pushed to the edge by Dr. Loomis' (Malcolm McDowell) revelation that she's Michael's sister. Little does she know, the unstoppable killer is back in Haddonfield and, driven by visions of their dead mother (Sheri Moon Zombie), he is determined to bring about a bloody family reunion.");

        reviewList.put(houseOf1000Corpses.getId(), houseOf1000Corpses);
        reviewList.put(theDevilsRejects.getId(), theDevilsRejects);
        reviewList.put(halloween.getId(), halloween);
        reviewList.put(halloweenII.getId(), halloweenII);
    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}