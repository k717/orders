package k717.orders;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Sergey Mischenko
 * @since 04.09.13
 */
@Path("/")
public class TestResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Hello World!";
    }

}
