package re.edu.kha2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.kha2.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
