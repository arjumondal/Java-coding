// Telephone Class

package phone;
public class Telephone {
    private int mobile_id;
    private String model_name;
    private int available_quantity;

    public Telephone(int mobile_id, String model_name, int available_quantity) {
        this.mobile_id = mobile_id;
        this.model_name = model_name;
        this.available_quantity = available_quantity;
    }

    public int getMobile_id() {
        return mobile_id;
    }

    public void setMobile_id(int mobile_id) {
        this.mobile_id = mobile_id;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }
}
