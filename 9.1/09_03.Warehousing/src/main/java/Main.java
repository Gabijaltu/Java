

public class Main {

    public static void main(String[] args) {


        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 988.7);
        juice.addToWarehouse(11.3);
        juice.takeFromWarehouse(1.0);

        juice.printAnalysis();

    }

}