package helloWorld.models;

import org.springframework.http.HttpStatus;

import lombok.Data;
@Data
public class Error {
    private String errorMessage;
    private HttpStatus errorCode;
}
