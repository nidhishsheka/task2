public class StudentScoreLogger {
    public static void main(String[] args) {
        String filePath = "student_scores.csv";
        ScoreLogger logger = new ScoreLogger(filePath);


        Thread student1 = new StudentThread(new Student("Ramesh", 278, 87), logger);
        Thread student2 = new StudentThread(new Student("Bharat", 245, 94), logger);
        Thread student3 = new StudentThread(new Student("Smaran", 118, 85), logger);

        
        student1.start();
        student2.start();
        student3.start();

        
        try {
            student1.join();
            student2.join();
            student3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nAll students have submitted their scores successfully!");
    }
}