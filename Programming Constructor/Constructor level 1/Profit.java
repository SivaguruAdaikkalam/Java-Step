class ProfitCalculator {
    public static void main(String[] args) {
        // Given values
        double costPrice = 129;
        double sellingPrice = 191;


        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;


        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                           "\n\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}
