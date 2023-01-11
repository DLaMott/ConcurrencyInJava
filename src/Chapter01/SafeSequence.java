package Chapter01;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class SafeSequence {

    @GuardedBy("this") private int value;

    public synchronized int getNext(){
        return value++;
    }

    public synchronized int getValue(){
        return this.value;
    }

    public static void main(String[] args) {

        SafeSequence safeSequence = new SafeSequence();

        new Thread(new MySafeThreads(safeSequence)).start();
        new Thread(new MySafeThreads(safeSequence)).start();

    }
}

class MySafeThreads implements Runnable{

    private SafeSequence safeSequence;

    public MySafeThreads(SafeSequence safeSequence){
        this.safeSequence = safeSequence;
    }

    @Override
    public void run() {

        while (safeSequence.getValue() < 100) {

            System.out.println(String.format(Thread.currentThread().toString() + safeSequence.getValue()));

            safeSequence.getNext();
        }

    }
}
