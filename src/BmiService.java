import java.lang.module.FindException;

public class BmiService {
    public int calculate(double weightInKilograms, double heightInMeters){
        double exactResult = weightInKilograms / (heightInMeters * heightInMeters);
        int result = (int) exactResult;
        return result;
    }
}
