import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Car {
    private String brand;

    public void setBrand(String brand){
        String brnadModel = brand.toLowerCase();
        Pattern brandNamePattern= Pattern.compile("[a-z]{1,5}");
        Matcher matcher = brandNamePattern.matcher(brand);
        if(brnadModel.equals("rolce royce") || matcher.matches()){
            this.brand=brand;
        }
        else{
            this.brand="unknown";
        }
    }

    public String getBrand(){
        return this.brand;
    }
}
