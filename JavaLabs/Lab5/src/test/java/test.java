import com.*;

import java.io.IOException;

public class test {
    public static void main(String[] args)  throws IOException, IllegalAccessException, InstantiationException {
        SomeBean sb = (new Injector()).Inject(new SomeBean());
        sb.foo();
    }
}
