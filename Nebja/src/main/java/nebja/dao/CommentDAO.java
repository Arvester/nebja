package nebja.dao;

import java.util.List;

import nebja.beans.Comment;
import nebja.beans.User;

public interface CommentDAO {
	public List<Comment> getAllComments();
	public List<Comment> getAllCommentsbyID(int id);
	public String makeAComment(User id, String comment);

}
