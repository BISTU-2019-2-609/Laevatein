package test02;

/**
 * @author Laevatein
 */
public class BMI {
    private String name;
    private int age;
    private double weight, height;
    final private double BMI_1 = 18.5, BMI_2 = 25, BMI_3 = 30;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    public double getBMI() {
        return weight/(height*height);
    }

    public String getStatus() {
        double BMI = getBMI();
        if (BMI < BMI_1) {
            return "低重";
        } else if (BMI < BMI_2) {
            return "正常";
        } else if (BMI < BMI_3) {
            return "超重";
        } else {
            return "肥胖";
        }
    }
}