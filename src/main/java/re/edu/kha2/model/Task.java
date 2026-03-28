package re.edu.kha2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Component
public class Task {
    private int id;
    private String title;
    private String description;
    private String priority;
    private String assignedTo;

}
