package model.entity;

public class PropertyInsurance extends InsurancePolicy{

    private String typeOfBuilding;

    public PropertyInsurance(String policyName, double costOfInsurance, double insurancePayment, double interestRate,
                           String typeOfBuilding, Risk risk) {

        super(policyName, costOfInsurance, insurancePayment, interestRate, risk);
        this.typeOfBuilding = typeOfBuilding;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    @Override
    public String toString() {
        return "Property Insurance -> " +"Insurance name: " + super.getPolicyName()+ "\n"+ "Cost: "+super.getCostOfInsurance()
                +"\n"+"Insurance type: "+ super.getRisk().getKindOfInsurance()+"\n"
                 + "Risk index: "+super.getRisk().getRiskIndicator() +"\n"+
                "typeOfBuilding = " + typeOfBuilding+"\n";
    }
}

