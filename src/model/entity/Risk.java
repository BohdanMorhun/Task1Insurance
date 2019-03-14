package model.entity;

public enum  Risk {

    RISK_OF_CUTS(2, 12, InsuranceCategories.MEDICAL_INSURANCE, 3200, 10000),

    RISK_OF_DISEASE(2.1, 10, InsuranceCategories.MEDICAL_INSURANCE, 1500, 15000),
    RISK_OF_POISONING(2.2, 11, InsuranceCategories.MEDICAL_INSURANCE, 3500, 18000),

    RISK_OF_FIRE(3, 15, InsuranceCategories.PROPERTY_INSURANCE, 6000, 30000),
    RISK_OF_EXPLOSION(3.1, 20, InsuranceCategories.PROPERTY_INSURANCE, 5500, 25000),

    RISK_OF_COLLISION(1, 30, InsuranceCategories.VEHICLE_INSURANCE, 4000, 40000),
    RISK_OF_STEALING(1.1, 31, InsuranceCategories.VEHICLE_INSURANCE, 4500, 50000);

    private double riskIndicator;
    private InsuranceCategories kindOfInsurance;

    Risk(double riskIndicator,double interestRate,InsuranceCategories kindOfInsurance, double costOfInsurance, double insurancePayment){

        this.riskIndicator = riskIndicator;
       this.kindOfInsurance = kindOfInsurance;

   }

    public double getRiskIndicator() {
        return riskIndicator;
    }

    public InsuranceCategories getKindOfInsurance() {
        return kindOfInsurance;
    }
}


