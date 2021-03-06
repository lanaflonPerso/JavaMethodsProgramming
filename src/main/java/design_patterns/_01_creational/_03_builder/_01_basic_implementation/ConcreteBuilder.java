package design_patterns._01_creational._03_builder._01_basic_implementation;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    public Product getProduct() {
        return product;
    }

    public void buildPart1(int part1) {
        // implementation
        product.setPart1(part1);
    }

    public void buildPart2(String part2) {
        // implementation
        product.setPart2(part2);
    }
}
