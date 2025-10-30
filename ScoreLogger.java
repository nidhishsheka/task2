class ScoreLogger {
    private final String filePath;

    public ScoreLogger(String filePath) {
        this.filePath = filePath;
    }

    
    public synchronized void writeScore(Student student) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(student.toCSV());
            writer.newLine();
            System.out.println(student + " has been logged successfully.");
        }
    }
}