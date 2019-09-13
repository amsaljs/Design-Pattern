package cor;

public class Main {
    private static Activity doChain(){
        Activity berdoaActivity = new Berdoa (Activity.berdoa);
        Activity tempatTidurActivity = new TempatTidur (Activity.tempatTidur);
        berdoaActivity.setNextActivity (tempatTidurActivity);
        Activity mandiActivity = new Mandi (Activity.mandi);
        tempatTidurActivity.setNextActivity (mandiActivity);

        return berdoaActivity;
    }

    public static void main(String[] args) {
        Activity activityLogger = doChain ();
        activityLogger.activityMessage (Activity.mandi, "Dilaksanakan");
        activityLogger.activityMessage (Activity.berdoa, "Mantull");
        activityLogger.activityMessage (Activity.tempatTidur, "Wajebb");
    }
}
