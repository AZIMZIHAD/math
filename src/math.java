public class math
{
    public static void main(String[] args)
    {
        final double KG_TO_LB = 2.20462;

        String customerName = "Stacey";
        double amountTendered = 40.00;

        int appleCount = 12;
        double applePrice = 0.60;
        double appleTotal = appleCount * applePrice;

        int pineappleCount = 2;
        double pineapplePrice = 3.59;
        double pineappleTotal = pineappleCount * pineapplePrice;

        int riceBagCount = 3;
        double riceBagWeightKg = 2.0;
        double ricePricePerPound = 1.39;
        double riceBagWeightLb = riceBagWeightKg * KG_TO_LB;
        double riceTotal = riceBagCount * riceBagWeightLb * ricePricePerPound;

        int totalItems = appleCount + pineappleCount + riceBagCount;
        double totalSpent = appleTotal + pineappleTotal + riceTotal;
        double averageCostPerItem = totalSpent / totalItems;
        double change = amountTendered - totalSpent;

        System.out.println("----- RECEIPT -----");
        System.out.println("Customer: " + customerName);
        System.out.println("Items purchased: " + totalItems);
        System.out.println("Total spent: $" + totalSpent);
        System.out.println("Average cost per item: $" + averageCostPerItem);
        System.out.println("Amount tendered: $" + amountTendered);
        System.out.println("Change: $" + change);
        System.out.println("--------------------");
    }
}

