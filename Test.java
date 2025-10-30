import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;
import java.nio.file.*;

public class Test {

    
    @Test
    public void testFileWrite() throws IOException {
        String testFile = "test_scores.csv";
        Files.deleteIfExists(Paths.get(testFile));

        ScoreLogger logger = new ScoreLogger(testFile);
        Student testStudent = new Student("TestUser", 999, 100);
        logger.writeScore(testStudent);

        String content = Files.readString(Paths.get(testFile));
        assertTrue("File should contain student's CSV data", content.contains("999,TestUser,100"));
    }

    
    @Test
    public void testThreadCompletion() throws InterruptedException, IOException {
        String testFile = "thread_test.csv";
        Files.deleteIfExists(Paths.get(testFile));

        ScoreLogger logger = new ScoreLogger(testFile);
        Thread t1 = new StudentThread(new Student("A", 1, 50), logger);
        Thread t2 = new StudentThread(new Student("B", 2, 60), logger);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        assertFalse("Thread 1 should have completed", t1.isAlive());
        assertFalse("Thread 2 should have completed", t2.isAlive());
    }
}