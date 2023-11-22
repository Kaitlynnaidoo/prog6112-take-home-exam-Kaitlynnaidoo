public class EstateAgentSales {

    // Two-dimensional array 
    static double[][] propertySales = {
        {800000, 1500000, 2000000},  
        {700000, 1200000, 1600000}   
    };

    //total property sales 
    public static void calculateTotalSales(double[][] sales) {
        for (int i = 0; i < sales.length; i++) {
            double totalSales = 0;
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
            }
            System.out.println("Total sales for the Agent " + (i + 1) + ": R " + totalSales);
        }
    }

    // 2% commission 
    public static void calculateCommission(double[][] sales) {
        for (int i = 0; i < sales.length; i++) {
            double totalCommission = 0;
            for (int j = 0; j < sales[i].length; j++) {
                totalCommission += 0.02 * sales[i][j];  
            }
            System.out.println("Total commission for the Agent " + (i + 1) + ": R " + totalCommission);
        }
    }

    
    public static void displayTopAgent(double[][] sales) {
        double maxSales = 0;
        int topAgent = 0;

        for (int i = 0; i < sales.length; i++) {
            double totalSales = 0;
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
            }
            if (totalSales > maxSales) {
                maxSales = totalSales;
                topAgent = i + 1;
            }
        }

        System.out.println("Top-Performing Estate Agent: Agent " + topAgent);
    }

    // Main method
    public static void main(String[] args) {
        
        calculateTotalSales(propertySales);
        calculateCommission(propertySales);
        displayTopAgent(propertySales);
    }
}
