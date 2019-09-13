package cor;

public class Mandi extends Activity {
    public Mandi(int level) {
        this.level=level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println ("Aktivitas ketiga Mandi  "+msg);
    }
}
