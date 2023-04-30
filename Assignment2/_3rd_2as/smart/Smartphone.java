// SmartPhone Class


package smart;
import phone.Telephone;
public class Smartphone extends Telephone {
    private boolean enabled_5G;
    private boolean foldable;
    private boolean dual_screen;

    public Smartphone(int mobile_id, String model_name, int available_quantity, boolean enabled_5G, boolean foldable, boolean dual_screen) {
        super(mobile_id, model_name, available_quantity);
        this.enabled_5G = enabled_5G;
        this.foldable = foldable;
        this.dual_screen = dual_screen;
    }

    public boolean isEnabled_5G() {
        return enabled_5G;
    }

    public void setEnabled_5G(boolean enabled_5G) {
        this.enabled_5G = enabled_5G;
    }

    public boolean isFoldable() {
        return foldable;
    }

    public void setFoldable(boolean foldable) {
        this.foldable = foldable;
    }

    public boolean isDual_screen() {
        return dual_screen;
    }

    public void setDual_screen(boolean dual_screen) {
        this.dual_screen = dual_screen;
    }

    public void displayDetails() {
        System.out.println("Mobile ID: " + getMobile_id());
        System.out.println("Model Name: " + getModel_name());
        System.out.println("Available Quantity: " + getAvailable_quantity());
        System.out.println("5G Enabled: " + isEnabled_5G());
        System.out.println("Foldable: " + isFoldable());
        System.out.println("Dual Screen: " + isDual_screen());
    }

    public void updateQuantity(int purchase) {
        int updated_quantity = getAvailable_quantity() - purchase;
        setAvailable_quantity(updated_quantity);
        System.out.println("New Available Quantity: " + getAvailable_quantity());
    }
}