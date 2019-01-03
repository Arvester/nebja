package nebja.beans;

public class Review {
public Review(int reviewid, String moviereview) {
		super();
		this.reviewid = reviewid;
		this.moviereview = moviereview;
	}
private int reviewid;
private String moviereview;
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
	return true;
}
@Override
public String toString() {
	return "Review [reviewid=" + reviewid + ", moviereview=" + moviereview + "]";
};

}
