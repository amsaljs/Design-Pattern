package cor;

public class TempatTidur extends Activity {
    public TempatTidur(int level) {
        this.level=level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println ("Activitas kedua Bersihkan Tempat Tidur  "+msg);
    }
}
