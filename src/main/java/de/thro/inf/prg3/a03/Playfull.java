package de.thro.inf.prg3.a03;

public class Playfull extends State {
    Playfull(int duration){
        super(duration);
    }

    @Override
    public State successor(Cat cat) {
        return new SleepingState(cat.getSleep());
    }
}
