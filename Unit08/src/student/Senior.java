package student;

/**
 * Created by tianrui on 3/11/14.
 */
public class Senior extends Student {

    private String postGradPlan;
    private boolean isLegal;

    public Senior(String name, int id, double gpa, boolean legal) {
        super(name, id, gpa);
        isLegal = legal;
    }

    public void setPostGradPlan(String p) {
        postGradPlan = p;
    }

    @Override
    public String getYear() {
        return "Senior";
    }
}
