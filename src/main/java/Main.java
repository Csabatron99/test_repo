import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Comment> comments = new ArrayList<>();

        Comment comm = new Comment();
                comm.setId("1");
                comm.setUser("Zoli");
                comm.setDate("2021/09/28");
                comm.setDescription("Alma");

        comments.add(comm);

        Post post = new Post();
             post.setId(1);
             post.setTitle("Alma");
             post.setUser("Soviet");
             post.setDate("2021/09/28");
             post.setStatus(Status.IN_PROGRESS);
             post.setDescription("Sample Post");
             post.setComments(comments);


        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        //objectMapper.configure(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS, false);
        //objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        /*DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(new DefaultIndenter());

        String serialized = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(post);*/


        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("car.json"), post);

    }
}
