package ratingData;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {
@RequestMapping("/{movieId}")
public Rating getRating(@PathVariable("movieId") String movieId) {
	return new Rating(movieId,4);
}
@RequestMapping("/users/{userId}")
public UserRating getUserRating(@PathVariable("userId") String userId) {
	List<Rating> ratings= Arrays.asList(
			new Rating("100",3),
			new Rating("101",5)
			);
	UserRating userRating=new UserRating();
	userRating.setUserRating(ratings);
	return userRating;
}
}
