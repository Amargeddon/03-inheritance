package de.thro.inf.prg3.a03;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    public static final Logger logger= LogManager.getLogger();
    protected int time;
    protected int duration;
    protected State(int duration){
        this.duration=duration;
    }
    final State tick(Cat cat){
        if(duration < 0)
            return this;

        // time goes by...
        time = time + 1;

        if(time < duration) {
            logger.info("Still in {}", getClass().getSimpleName());
            return this;
        } else {
            return successor(cat);
        }
    }



    public abstract State successor(Cat cat);
}
