package cor;

public abstract class Activity {
    static int berdoa =1;
    static int tempatTidur =2;
    static int mandi=3;

    protected int level;
    protected Activity nextActivity;

    void setNextActivity(Activity activity){
        this.nextActivity=activity;
    }

    void activityMessage(int level, String msg){
        if(this.level <= level){
            displayLogInfo (msg);
        }
        if(nextActivity!=null){
            nextActivity.activityMessage (level,msg);
        }
    }

    protected abstract void displayLogInfo(String msg);
}
