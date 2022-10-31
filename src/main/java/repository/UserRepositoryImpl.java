package repository;

import domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepositoryImpl implements UserRepository {

    List<User> user = new ArrayList<>();

    @Override
    public void add(User user) {
        this.user.add(user);
    }

    @Override
    public void modify(User user) {
        for (User user1 : this.user) {
            if (user1.getId().equals(user.getId())) {
                user1.setPassward();
            }

        }

    }

    @Override
    public User remove(String id) {
        for (User user1 : user) {
            if (user1.getId().equals(id)) {
                user.remove(user1);
            }
        }
        return null;
    }

    @Override
    public User getUser(String id) {
        for (User user1 : user) {
            if (user1.getId().equals(id)) {
                return user1;
            }
        }
        return null;
    }

    @Override
    public List<User> getUser() {
        return user;
    }

}
