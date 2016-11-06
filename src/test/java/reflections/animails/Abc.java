package reflections.animails;/**
 * Created by Evegeny on 06/11/2016.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.RetentionPolicy.SOURCE;

@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface Abc
{
}
