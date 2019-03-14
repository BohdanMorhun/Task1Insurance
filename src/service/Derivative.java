package service;

import model.entity.*;
import service.DerivRecepies;
import service.InsuranceRecipes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Derivative {

    private String userName;
    private double cost;
    private List<InsurancePolicy> insurancePolicies;

    public Derivative(List<InsurancePolicy> insurancePolicies) {
        this.insurancePolicies = insurancePolicies;

        for (InsurancePolicy ins : insurancePolicies) {
            this.cost += ins.getCostOfInsurance();
        }
    }

    public Derivative(DerivRecepies derivRecepies) {

        this.insurancePolicies  = new ArrayList<>();
        this.userName = derivRecepies.getUserName();

        for(InsuranceRecipes insuranceRecepie : derivRecepies.getInsuranceRecipes()){
            if(insuranceRecepie.getRisk().getKindOfInsurance() == InsuranceCategories.MEDICAL_INSURANCE){

                MedicalInsurance temp = new MedicalInsurance(insuranceRecepie.getName(),12000,30000,
                        4, 1, insuranceRecepie.getRisk());
                this.insurancePolicies.add(temp);
                    this.cost += temp.getCostOfInsurance();

            }
//            Risk riskOfCuts = Risk.RISK_OF_CUTS;
//            riskOfCuts.getKindOfInsurance();


            if(insuranceRecepie.getRisk().getKindOfInsurance() == InsuranceCategories.VEHICLE_INSURANCE){

                VehicleInsurance vehicleInsurance = new VehicleInsurance(insuranceRecepie.getName(),1000,45000,
                        9,"BMW", "AA1234BM",2010,"A23456",insuranceRecepie.getRisk());
             this.insurancePolicies.add(vehicleInsurance);
                this.cost += vehicleInsurance.getCostOfInsurance();
            }

            if(insuranceRecepie.getRisk().getKindOfInsurance() == InsuranceCategories.PROPERTY_INSURANCE){

                PropertyInsurance propertyInsurance = new PropertyInsurance(insuranceRecepie.getName(), 12000,50000,
                        15,"House", insuranceRecepie.getRisk());
                this.insurancePolicies.add(propertyInsurance);
                this.cost += propertyInsurance.getCostOfInsurance();
            }
        }
    }

    public List<InsurancePolicy> getInsurancePolicies() {
        return insurancePolicies;
    }

    public void setInsurancePolicies(List<InsurancePolicy> insurancePolicies) {
        this.insurancePolicies = insurancePolicies;
        for (InsurancePolicy ins : insurancePolicies) {
            this.cost += ins.getCostOfInsurance();
        }
    }
    public double getCost() {
        return cost;

    }


//    sort policies by risks indicator

    public String policiesSortedByRisks() {
        StringBuilder bld = new StringBuilder();
        insurancePolicies.stream().
                filter(p -> p.getRisk().getRiskIndicator() > 0).
                sorted(Comparator.comparingDouble(p -> p.getRisk().getRiskIndicator())).
                        forEach(bld::append);
        return new String(bld);
    }


//    sort policies in cost range

    public String getInsurancePoliciesInCostRange(double min, double max) {
        StringBuilder builder = new StringBuilder();
        insurancePolicies.stream().
                filter(p -> p.getCostOfInsurance() > min).
                filter(p -> p.getCostOfInsurance() < max).
                forEach(builder::append);
        return new String(builder);
    }
}









