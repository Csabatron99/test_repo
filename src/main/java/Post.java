

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.Data;

import java.util.List;


@Data

public class Post {
    private Integer id;
    private String title;
    private String user;
    private String date;
    private Status status;
    private String description;
    @JsonRawValue
    private List<Comment> comments;
}
