// Base Class
abstract class Consumer {
    protected int unitsConsumed;

    public Consumer(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    abstract double calculateBill();
}

// Domestic Consumer
class DomesticConsumer extends Consumer {

    public DomesticConsumer(int unitsConsumed) {
        super(unitsConsumed);
    }

    @Override
    double calculateBill() {
        if (unitsConsumed <= 100) {
            return unitsConsumed * 3;
        } else {
            return (100 * 3) + ((unitsConsumed - 100) * 5);
        }
    }
}

// Commercial Consumer
class CommercialConsumer extends Consumer {

    public CommercialConsumer(int unitsConsumed) {
        super(unitsConsumed);
    }

    @Override
    double calculateBill() {
        return unitsConsumed * 8;
    }
}

// Main Class
public class ElectricityBill2 {
    public static void main(String[] args) {

        Consumer[] consumers = new Consumer[4];

        consumers[0] = new DomesticConsumer(80);
        consumers[1] = new DomesticConsumer(150);
        consumers[2] = new CommercialConsumer(50);
        consumers[3] = new CommercialConsumer(120);

        double totalRevenue = 0;

        for (int i = 0; i < consumers.length; i++) {
            double bill = consumers[i].calculateBill();
            System.out.println("Consumer " + (i + 1) + " Bill: ₹" + bill);
            totalRevenue += bill;
        }

        System.out.println("Total Revenue: ₹" + totalRevenue);
    }
}