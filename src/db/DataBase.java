package db;

import models.Announcement;
import models.Favorite;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Announcement> announcements= new ArrayList<>();
    private List<User>users= new ArrayList<>();
    private List<Favorite>favorites= new ArrayList<>();

    public DataBase() {
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }
}
