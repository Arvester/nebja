package nebja.dao;

import java.io.File;
import java.util.List;

import nebja.beans.User;

public interface UserDAO {
	public List<User> getAllUsers();
	public void createUsernameandPassword(User username, String password);
	public void updateUsername(String username);
	public void updatePassword(String password);
	public void createProfilePhoto(File photo);
	public void createProfileInfo(String profileinfo);
	public void updateprofileInfo(String profileInfo);
	public void updateProfilePhoto(File photo);

}
