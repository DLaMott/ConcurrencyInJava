package ChapterOne;

public class UnsafeSequence {

    private int value;

    public int getNext(){
        return value++;
    }

    public int getValue(){
        return this.value;
    }

    public static void main(String[] args) {


        UnsafeSequence unsafeSequence = new UnsafeSequence();

        new Thread(new MyThreads(unsafeSequence)).start();
        new Thread(new MyThreads(unsafeSequence)).start();

    }
}

class MyThreads implements Runnable{

    private UnsafeSequence unsafeSequence;

    public MyThreads(UnsafeSequence unsafeSequence){
        this.unsafeSequence = unsafeSequence;
    }

    @Override
    public void run() {

        while (unsafeSequence.getValue() < 100) {

            System.out.println(String.format(Thread.currentThread().toString() + unsafeSequence.getValue()));

            unsafeSequence.getNext();
        }

    }
}
