package Chapter03;

import net.jcip.annotations.GuardedBy;

public class SynchronizedInteger {

    @GuardedBy("this") private int value;

    public synchronized int getValue(){return value;}
    public synchronized void setValue(int value){this.value = value;}
}
