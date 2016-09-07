package pl.dbgsystem;

import org.jooby.Jooby;
import org.jooby.Results;
import org.jooby.jade.Jade;

/**
 * @author jooby generator
 */
public class App extends Jooby {
    {
        use(new Jade());
        assets("/assets/**").name("assets");

        get("/", () -> Results.html("views/index"));
    }

  public static void main(final String[] args) throws Throwable {
    run(App::new, args);
  }

}
