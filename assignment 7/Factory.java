package assignment7;

interface Cycle {
    public void ride();
}

class UniCycle implements Cycle {
    public void ride() {
        System.out.println("riding a unicycle");
    }
}

class BiCycle implements Cycle {
    public void ride() {
        System.out.println("riding a BiCycle");
    }
}

class TriCycle implements Cycle {
    public void ride() {
        System.out.println("riding a tricycle");
    }
}

interface CycleFactory {
    Cycle getCycle();
}

class UniCycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new UniCycle();
    }
}

class BiCycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new BiCycle();
    }
}

class TriCycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new TriCycle();
    }
}

public class Factory {
    public static void ridingCycle(CycleFactory factory) {
        Cycle f = factory.getCycle();
        f.ride();
    }

    public static void main(String[] args) {
        ridingCycle(new UniCycleFactory());
        ridingCycle(new BiCycleFactory());
        ridingCycle(new TriCycleFactory());
    }
}