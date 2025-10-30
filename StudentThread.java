class StudentThread extends Thread {
    private final Student student;
    private final ScoreLogger logger;

    public StudentThread(Student student, ScoreLogger logger) {
        this.student = student;
        this.logger = logger;
    }

    @Override
    public void run() {
        try {
            logger.writeScore(student);
        } catch (IOException e) {
            System.out.println("Error writing score for " + student);
            e.printStackTrace();
        }
    }
}