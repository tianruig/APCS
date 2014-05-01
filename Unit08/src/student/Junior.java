package student;

/**
 * Created by tianrui on 3/11/14.
 */
public class Junior extends Student {
    private int satScore;
    private boolean offCampusPass;

    public Junior(String name, int id, double gpa) {
        super(name, id, gpa);
        offCampusPass = false;
    }

    public void setSatScore(int s) {
        satScore = s;
    }

    public void changeOffCampusPass() {
        offCampusPass = !offCampusPass;
    }

    @Override
    public String getYear() {
        return "Junior";
    }
}
