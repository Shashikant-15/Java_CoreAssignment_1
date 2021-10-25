package assign_20;



public class DuckSimulationGame {

    interface QuackBehavior {
        void quack();
    }

    interface FlyBehavior {
        void fly();
    }

    // below is defining each behaviour separately
    static class CantFly implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("I can't fly");
        }
    }

    static class FlyFast implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("flying fastly");
        }
    }

    static class FlySlow implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("flying slowly");
        }
    }

    static class QuackLoud implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("quack loudly");
        }
    }

    static class Squeak implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("squeaking....");
        }
    }

    static class QuackMild implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("quacking mild.....");
        }
    }

    // It will represent the type of Duck
    enum DuckType {
        RUBBER, MALLARD, REDHEAD
    }

    //This is the super class of all types of duck classes
    abstract static class Duck {
        FlyBehavior flyBehavior;
        QuackBehavior quackBehavior;

        Duck() {
        }

        void performFly() {
            this.flyBehavior.fly();
        }

        void performQuack() {
            this.quackBehavior.quack();
        }

        void showDetails() {
            System.out.println("I am duck");
        }
    }

    static class RubberDuck extends Duck {
        RubberDuck() {
            this.flyBehavior = new CantFly();
            this.quackBehavior = new Squeak();
        }

        @Override
        void showDetails() {
            System.out.println("I am " + DuckType.RUBBER + " Duck");
        }
    }

    static class MallardDuck extends Duck {
        MallardDuck() {
            this.flyBehavior = new FlyFast();
            this.quackBehavior = new QuackLoud();
        }

        @Override
        void showDetails() {
            System.out.println("I am " + DuckType.MALLARD + " Duck");
        }
    }

    static class RedheadDuck extends Duck {
        RedheadDuck() {
            this.flyBehavior = new FlySlow();
            this.quackBehavior = new QuackMild();
        }

        @Override
        void showDetails() {
            System.out.println("I am " + DuckType.REDHEAD + " Duck");
        }
    }

    public static class DuckSimulation {
        public static void main(String[] args) {
            Duck md = new MallardDuck();
            md.showDetails();
            md.performFly();
            md.performQuack();

            System.out.println("____________________________________________");
            System.out.println("____________________________________________");
            Duck rd = new RubberDuck();
            rd.showDetails();
            rd.performFly();
            rd.performQuack();

            System.out.println("____________________________________________");
            System.out.println("____________________________________________");
            Duck redhead_Duck = new RedheadDuck();
            redhead_Duck.showDetails();
            redhead_Duck.performFly();
            redhead_Duck.performQuack();
        }
    }
}