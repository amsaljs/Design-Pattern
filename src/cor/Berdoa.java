package cor;

public class Berdoa extends Activity {

    public Berdoa(int level) {
        this.level=level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println ("Aktivitas pertama berdoa :)   " + msg);
    }
}
