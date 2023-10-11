package deneme2.deneme2.rest;

import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Type;

@Type
public class MyType {
    private String message = "Hello, GraphQL!!!!";
    
    @Query
    public String getMessage() {
        return message;
    }
}
