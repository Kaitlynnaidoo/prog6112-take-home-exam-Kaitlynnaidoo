public class EstateAgent implements IEstateAgent {

    static double[][] propertySales = {
        {800000, 1500000, 2000000},  // Joe Bloggs
        {700000, 1200000, 1600000}   // Jane Doe
    };

    @Override
    public double EstateAgentSales(double[] propertySales) {
        double totalSales = 0;
        for (double monthlySales : propertySales) {
            totalSales += monthlySales;
        }
        return totalSales;
    }

    @Override
    public double EstateAgentCommission(double propertySales) {
        // Assuming 2% commission
        return 0.02 * propertySales;
    }

    @Override
    public int TopEstateAgent(double[] totalSales) {
        double maxSales = 0;
        int topAgent = 0;

        for (int i = 0; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topAgent = i + 1;
            }
        }
        return topAgent;
    }

    public static void main(String[] args) {
        EstateAgent estateAgent = new EstateAgent();

        for (int i = 0; i < propertySales.length; i++) {
            double totalSales = estateAgent.EstateAgentSales(propertySales[i]);
            System.out.println("Total sales for Agent " + (i + 1) + ": R " + totalSales);

            double commission = estateAgent.EstateAgentCommission(totalSales);
            System.out.println("Total commission for Agent " + (i + 1) + ": R " + commission);
        }

        int topAgent = estateAgent.TopEstateAgent(new double[]{
            estateAgent.EstateAgentSales(propertySales[0]),
            estateAgent.EstateAgentSales(propertySales[1])
        });
        System.out.println("Top-Selling Estate Agent: Agent " + topAgent);
    }
}
