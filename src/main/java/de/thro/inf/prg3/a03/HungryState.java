package de.thro.inf.prg3.a03;

public class HungryState extends State {
         HungryState(int duration){
                super(duration);
        }

        public State feed(Cat cat){
                return new DigestingState(cat.getDigest(),duration-time);
        }


        @Override
        public State successor(Cat cat) {
                return new DeathState();
        }
}
