package re.edu.kha2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.kha2.model.User;


public interface UserRepository extends  JpaRepository<User, Long> {
}
