package helloWorld.models;
import lombok.Data;

@Data
public class Response<S,T> {
    private final S data;
    private final T error;
}
