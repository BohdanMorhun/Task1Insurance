package controller;

import service.Derivative;
import service.DerivRecepies;
import service.InsuranceCompany;
import view.View;

public class Controller {

    private View view = new View();

    public void processUser() {

        InsuranceCompany insuranceCompany = new InsuranceCompany();

        Derivative derivative = insuranceCompany.createDerivative(DerivRecepies.TOM);

        view.printMessage("Derivative cost is " + derivative.getCost() + ".");

        view.printMessage(derivative.policiesSortedByRisks());

        view.printMessage("InsurancePoliciesInCostRange: " +derivative.getInsurancePoliciesInCostRange(0,2000));


    }

}