import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler{
    private ResponseEntity<Map<String,Object>> build(HttpStatus status, Object message){
        Map<String,Object>body=new HashMap<>();
        body.put ("status",status.value());
        body.put ("message", message);
        return ResponseEntity.status(status).body(body);
    }
}

@ExceptionHandler({UserNotFoundException,ProductNotFoundException})
public Response Entity<Map<>>

void main() {
}