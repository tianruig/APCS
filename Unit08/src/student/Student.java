package student;

/**
 * Created by tianrui on 3/11/14.
 */
public abstract class Student {
    private String name;
    private int id;
    private double gpa;

    protected Student(String n, int i, double g) {
        name = n;
        id = i;
        gpa = g;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public abstract String getYear();
}
