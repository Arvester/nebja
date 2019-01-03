package nebja.beans;

import java.io.File;

public class User {
public User(String username, String password, File picture, String profileinfo) {
		super();
		this.username = username;
		this.password = password;
		this.picture = picture;
		this.profileinfo = profileinfo;
	}

public User(String username, String password,String profileinfo) {
	super();
	this.username = username;
	this.password = password;
	this.profileinfo = profileinfo;
}

private String username;
private String password;
private File picture;
private String profileinfo;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public File getPicture() {
	return picture;
}
public void setPicture(File picture) {
	this.picture = picture;
}
public String getProfileinfo() {
	return profileinfo;
}
public void setProfileinfo(String profileinfo) {
	this.profileinfo = profileinfo;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((picture == null) ? 0 : picture.hashCode());
	result = prime * result + ((profileinfo == null) ? 0 : profileinfo.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
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
	User other = (User) obj;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (picture == null) {
		if (other.picture != null)
			return false;
	} else if (!picture.equals(other.picture))
		return false;
	if (profileinfo == null) {
		if (other.profileinfo != null)
			return false;
	} else if (!profileinfo.equals(other.profileinfo))
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", profileinfo=" + profileinfo + "]";
}

}
