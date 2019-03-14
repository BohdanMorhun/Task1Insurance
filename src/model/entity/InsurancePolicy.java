package model.entity;

public abstract class InsurancePolicy {

     private String policyName;
     private double costOfInsurance;
     private double insurancePayment;
     private double interestRate;
     private Risk risk;


     public InsurancePolicy(String policyName, double costOfInsurance, double insurancePayment, double interestRate, Risk risk) {
        this.policyName = policyName;
        this.costOfInsurance = costOfInsurance;
        this.insurancePayment = insurancePayment;
        this.interestRate = interestRate;
        this.risk = risk;

    }

    public Risk getRisk(){return this.risk;}

    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public double getCostOfInsurance() {
        return costOfInsurance;
    }

    public void setCostOfInsurance(double costOfInsurance) {
        this.costOfInsurance = costOfInsurance;
    }

    public double getInsurancePayment() {
        return insurancePayment;
    }

    public void setInsurancePayment(double insurancePayment) {
        this.insurancePayment = insurancePayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "policyName='" + policyName + '\'' +
                ", risk=" + risk +
                '}';
    }
}

