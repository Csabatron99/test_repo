

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
public class Post {
    private String id;
    private String title;
    private String user;
    private String date;
    private Status status;
    private String description;
    private List<Comment> comments;

}
