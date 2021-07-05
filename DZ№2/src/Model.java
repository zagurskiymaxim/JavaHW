import java.util.ArrayList;
import java.util.List;


public class Model {

    private int min;
    private int max;

    private int Value;

    private List<Integer> yourWay = new ArrayList<Integer>();


    public void setSecretValue(){
        Value = (int)Math.ceil(Math.random()*
                (max - min - 1) + min);
    }

    public boolean checkValue (int value){
        yourWay.add(value);
        if (value == Value){
            return false;
        } else if (value > Value){
            max = value;
        } else {
            min = value;
        }
        return true;
    }

    public void setPrimaryBarrier(int minBarrier, int maxBarrier){
        this.min = minBarrier;
        this.max = maxBarrier;
    }

    public int getSecretValue() {
        return Value;
    }
    public int getMinBarrier() {
        return min;
    }
    public int getMaxBarrier() {
        return max;
    }
    public List<Integer> getYourWay() {
        return yourWay;
    }

}
