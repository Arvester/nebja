package nebja.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Review {
public Review(int reviewid, String moviereview, int reviewscore) {
		super();
		this.reviewid = reviewid;
		this.moviereview = moviereview;
	}
@Id
@GeneratedValue(strategy= GenerationType.AUTO,generator="reviewSequence")
@SequenceGenerator(allocationSize=1, name="reviewSequence", sequenceName= "SQ_REVIEW_PK")
@Column
private int reviewid;
@Column
private String moviereview;
private int reviewscore;
public int getReviewid() {
	return reviewid;
}
public void setReviewid(int reviewid) {
	this.reviewid = reviewid;
}
public String getMoviereview() {
	return moviereview;
}
public void setMoviereview(String moviereview) {
	this.moviereview = moviereview;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((moviereview == null) ? 0 : moviereview.hashCode());
	result = prime * result + reviewid;
	result = prime * result + reviewscore;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Review other = (Review) obj;
	if (moviereview == null) {
		if (other.moviereview != null)
			return false;
	} else if (!moviereview.equals(other.moviereview))
		return false;
	if (reviewid != other.reviewid)
		return false;
	if (reviewscore != other.reviewscore)
		return false;
	return true;
}
@Override
public String toString() {
	return "Review [reviewid=" + reviewid + ", moviereview=" + moviereview + ", reviewscore=" + reviewscore + "]";
}

public int getReviewscore() {
	return reviewscore;
}
public void setReviewscore(int reviewscore) {
	this.reviewscore = reviewscore;
};

}
