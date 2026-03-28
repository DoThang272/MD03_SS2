package re.edu.kha2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Component
public class User {
    private int id;
    private String username;
    private String email;
    private String role;

}
