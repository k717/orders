package k717.orders;

import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Sergey Mischenko
 * @since 04.09.13
 */
public class MyApplication extends Application {
    private final Set<Class<?>> classes;

    public MyApplication() {
        HashSet<Class<?>> c = new HashSet<>();
        c.add(TestResource.class);
        classes = Collections.unmodifiableSet(c);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
