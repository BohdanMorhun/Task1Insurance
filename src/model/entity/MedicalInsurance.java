package model.entity;

public class MedicalInsurance extends InsurancePolicy {

    private int period;

    public MedicalInsurance(String policyName, double costOfInsurance, double insurancePayment, double interestRate,
                            int period, Risk risk) {

        super(policyName, costOfInsurance, insurancePayment, interestRate, risk);
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Medical Insurance -> "+"Insurance name: "+ super.getPolicyName()+ "\n"+ "Cost: "+super.getCostOfInsurance() +"\n"+"Insurance type: "+ super.getRisk().getKindOfInsurance()+"\n"
                +"Period = " + period + "\n"+ "Risk index: "+super.getRisk().getRiskIndicator() +"\n"+
                "Interest rate: " + super.getInterestRate()+"\n"+"Interest payment: "+ super.getInsurancePayment()+ "\n";
    }
}


