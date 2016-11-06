package myspring;

import lombok.ToString;

import java.util.Random;

/**
 * Created by Evegeny on 06/11/2016.
 */
@ToString
public class Dragon {
    @InjectRandomInt(min = 500, max = 700)
    private int power;

    @InjectRandomInt(min = 50, max = 70)
    private int speed;


}
