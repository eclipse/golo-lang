package golo.test.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface WithArrayArg {
  String[] strings();
}
