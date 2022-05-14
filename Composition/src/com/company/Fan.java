package com.company;

public class Fan {
    private String manufacturer;
    private String model;

    public Fan(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void powerOnFan(int regulator){
        if(regulator>5 || regulator<0){
            System.out.println("Invalid regulator setting");
            System.out.println("Fan turned ON with regulator set at default 3");
            return;
        }
        System.out.println("Fan turned ON with regulator set at "+regulator);
    }

}
