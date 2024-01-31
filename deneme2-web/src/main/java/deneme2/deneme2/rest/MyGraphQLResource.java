package deneme2.deneme2.rest;


import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.ApplicationPath;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@ApplicationPath("/test")
@GraphQLApi
@RequestScoped
public class MyGraphQLResource {

    @Query
    public String hello() {
        return "Hello, GraphQL!";
    }
}