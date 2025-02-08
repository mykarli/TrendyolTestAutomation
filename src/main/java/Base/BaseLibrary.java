package Base;

public class BaseLibrary extends Data {

    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}
