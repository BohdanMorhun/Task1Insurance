package model.entity;

public class VehicleInsurance extends InsurancePolicy {

     private String brand;
     private String plateNumber;
     private int year;
     private String driverLicence;


    public VehicleInsurance(String policyName, double costOfInsurance, double insurancePayment, double interestRate,
                             String brand, String plateNumber, int year, String driverLicence,Risk risk) {
        super(policyName, costOfInsurance, insurancePayment, interestRate, risk);
        this.brand = brand;
        this.plateNumber = plateNumber;
        this.year = year;
        this.driverLicence = driverLicence;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }


    @Override
    public String toString() {
        return "Vehicle Insurance -> " + "Insurance name: " + super.getPolicyName()+ "\n"+ "Cost: "+super.getCostOfInsurance()
                +"\n"+"Insurance type: "+ super.getRisk().getKindOfInsurance()+"\n"
                + "Risk index: "+super.getRisk().getRiskIndicator() +"\n" +
                "brand ='" + brand + '\'' +
                ", plateNumber = " + plateNumber +
                ", year = " + year +
                ", driverLicence = " + driverLicence +
                "\n";
    }
}
