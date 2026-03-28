package re.edu.kha2.repository;

import org.springframework.stereotype.Repository;
import re.edu.kha2.model.Task;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        tasks.add(new Task(1, "Fix login bug", "Fix lỗi đăng nhập", "high", "1"));
        tasks.add(new Task(2, "Update UI", "Cập nhật giao diện", "medium", "1"));
        tasks.add(new Task(3, "Write API", "Viết API backend", "high", "2"));
        tasks.add(new Task(4, "Test feature", "Test chức năng", "low", "2"));
        tasks.add(new Task(5, "Deploy server", "Deploy lên server", "high", "3"));
        tasks.add(new Task(6, "Optimize DB", "Tối ưu database", "medium", "1"));
        tasks.add(new Task(7, "Fix CSS", "Sửa lỗi CSS", "low", "2"));
        tasks.add(new Task(8, "Write docs", "Viết tài liệu", "medium", "3"));
        tasks.add(new Task(9, "Code review", "Review code", "high", "1"));
        tasks.add(new Task(10, "Meeting", "Họp team", "low", "3"));
    }

    public List<Task> findAll(){
        return tasks;
    }
}
