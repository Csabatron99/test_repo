import lombok.Data;

@Data
public class Item {
    public int id;
    public String itemName;
    public User owner;
}