package de.thro.inf.prg3.a03;

public class DeathState extends State {

    DeathState(){
        super(-1);
    }
    @Override
    public State successor(Cat cat) {
        return this;
    }
}
