import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import lombok.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Comment> comments = new ArrayList<>();

        Post p = new Post();

        Comment comm = new Comment();
                comm.setId("1");
                comm.setUser("Zoli");
                comm.setDate("2021/09/28");
                comm.setDescription("Alma");

        comments.add(comm);
        Post post = new Post();
             post.setId("1");
             post.setTitle("Alma");
             post.setUser("Soviet");
             post.setDate("2021/09/28");
             post.setStatus(Status.IN_PROGRESS);
             post.setDescription("Sample Post");
             post.setComments(comments);

        String serialized = new ObjectMapper().writeValueAsString(post);

        objectMapper.writeValue(new File("car.json"), serialized);

/*
        Item myItem = new Item();
        User user = new User();
        user.id = 2;
        user.name = "TheUser";
        myItem.id=1;
        myItem.itemName="item";
        myItem.owner = user;

        String serialized = new ObjectMapper().writeValueAsString(myItem);

        objectMapper.writeValue(new File("car.json"), serialized);
*/
    }
}
