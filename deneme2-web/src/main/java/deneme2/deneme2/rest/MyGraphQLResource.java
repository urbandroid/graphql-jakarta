package deneme2.deneme2.rest;

import javax.ws.rs.ApplicationPath;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@ApplicationPath("/graphql")
@GraphQLApi
public class MyGraphQLResource {

    @Query
    public String hello() {
        return "Hello, GraphQL!";
    }
}