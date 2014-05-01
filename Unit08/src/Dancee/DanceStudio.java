package Dancee;

public class DanceStudio {
    public static void main(String[] args) {
        DanceFloor danceFloor = new DanceFloor();
        StudentGroup students = new DanceGroup(danceFloor);
        new DanceLesson(students, danceFloor);
    }
}
