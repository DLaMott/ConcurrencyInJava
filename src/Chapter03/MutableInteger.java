package Chapter03;

// Not Thread Safe
public class MutableInteger {

    private int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
}
