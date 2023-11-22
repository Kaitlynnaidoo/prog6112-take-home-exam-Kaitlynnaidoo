/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112;

/**
 *
 * @author st10083262
 */
public class EstateAgent implements IEstateAgent {

    @Override
    public double CalculateCommission(String propertyPrice, String agentCommission) {
        double price = Double.parseDouble(propertyPrice);
        double commisionPercentage = Double.parseDouble(agentCommission);

        return price * (commisionPercentage / 100);
    }

    @Override
    public boolean ValidateData(Data data) {

        if (data.AgentLocation.isEmpty()) {
            return false;
        }

        if (data.AgentName.isEmpty()) {
            return false;
        }

        try {
            double price = Double.parseDouble(data.PropertyPrice);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + data.PropertyPrice);
            return false;
        }

        try {
            double commissionP = Double.parseDouble(data.CommissionPercentage);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + data.CommissionPercentage);
            return false;
        }

        return true;

    }

}
