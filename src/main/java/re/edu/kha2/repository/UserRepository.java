package re.edu.kha2.repository;

import org.springframework.stereotype.Repository;
import re.edu.kha2.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1, "Thang", "doanhtahng16@gmail.com", "admin"));
        users.add(new User(2, "Quyet", "Quyets123@gmail.com", "user"));
        users.add(new User(1, "Thanh", "abc1232@gmail.com", "user"));
    }

    public List<User> findAll(){
        return users;
    }
}
