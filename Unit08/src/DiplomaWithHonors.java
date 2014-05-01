public class DiplomaWithHonors extends Diploma {

    public DiplomaWithHonors(String name, String course) {
        super(name, course);
    }

    @Override
    public String toString() {
        return super.toString() + "\n*** with honors ***";
    }
}
