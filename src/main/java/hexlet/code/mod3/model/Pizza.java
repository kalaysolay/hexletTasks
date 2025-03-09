package hexlet.code.mod3.model;
import lombok.Data;
import lombok.Builder;

@Builder
@Data
public final class Pizza {
    private String size;
    private String dough;
    private String sauce;
    private String meatTopping;
    private String vegetableTopping;
    private String cheeseTopping;



}
