package reflections;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by Evegeny on 06/11/2016.
 */
@ToString(exclude = "age")
@Data
@Getter
public class Person {
    private String name;
    private int age;
    private String address;
    private int salary;

    public Person(String name, int age, String address, int salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public Person() {
    }
}
