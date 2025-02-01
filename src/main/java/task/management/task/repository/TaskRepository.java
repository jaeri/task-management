package task.management.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import task.management.task.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
