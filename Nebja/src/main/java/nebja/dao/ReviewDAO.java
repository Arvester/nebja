package nebja.dao;

import java.util.List;

import nebja.beans.Review;
import nebja.beans.User;

public interface ReviewDAO {
public List<Review> getAllReviews();
public String getUserReview(int id);
public void createUserReview(Review review);
}
