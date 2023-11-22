/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prog6112;

/**
 *
 * @author st10083262
 */
public interface IEstateAgent {
   double CalculateCommission(String propertyPrice, String agentCommission);
    boolean ValidateData(Data dataToValidate);
}
