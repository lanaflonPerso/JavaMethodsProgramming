package design_patterns._02_behavioral._03_iterator._01_basic_implementation;

public class ConcreteAggregate implements Aggregate {
    public Iterator createIterator() {
        System.out.println("Creating concrete iterator for concrete aggregate.");
        Iterator iterator = new ConcreteIterator(this);
        return iterator;
    }
}
