package self.example.pos.domain;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Item {
    private Integer itemId;
    private String name;
    private String category;
    private double price;
}
