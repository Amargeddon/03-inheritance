package de.thro.inf.prg3.a03;

public class DigestingState extends State {
        private final int remainingAwakeTime;
    DigestingState(int duration,int remainingAwakeTime){
        super(duration);
        this.remainingAwakeTime=remainingAwakeTime;

    }


    @Override
    public State successor(Cat cat) {
        return new Playfull(remainingAwakeTime -cat.getDigest());

    }
}
