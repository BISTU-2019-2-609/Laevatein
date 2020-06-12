package test05;

public class Check {
    private String name;
    private int areaFrom;
    private double temperature;
    private final double CRITICAL_TEMPERATURE = 37.3;

    public Check(String name, int areaFrom, double temperature) {
        this.name = name;
        this.areaFrom = areaFrom;
        this.temperature = temperature;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAreaFrom() {
        return areaFrom;
    }
    public void setAreaFrom(int areaFrom) {
        this.areaFrom = areaFrom;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public String areaCheck(int areaFrom){
        if(areaFrom == 1)
            return "High Risk Area";
        else if(areaFrom == 2)
            return "Oversea Area";
        else if(areaFrom == 3)
            return "Normal Area";
        return null;
    }
    public String temperatureCheck(double temperature) {
        if (temperature < CRITICAL_TEMPERATURE)
            return "Normal Temperature";
        else
            return "High Temperature";
    }
    public String resultCheck(){
        if(areaFrom == 3 && temperature < CRITICAL_TEMPERATURE)
            return "Normal Group";
        else
            return "Focus Group";
    }
}