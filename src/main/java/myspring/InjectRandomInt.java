package myspring;/**
 * Created by Evegeny on 06/11/2016.
 */

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface InjectRandomInt {
    int min();
    int max();
}
