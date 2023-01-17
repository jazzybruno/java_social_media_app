package rca.ac.rw.orm;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private int phone;
    private String email;
    private String profilePic;
    private ArrayList<User> followers = new ArrayList<User>();

    public User(int id, String name, int phone, String email, String profilePic) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.profilePic = profilePic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }
}
