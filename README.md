# Student Exam Score Logger 



## Description

This is a simple Java program that simulates multiple students submitting their exam marks at the same time. The scores (name, roll number, marks) get written into a .csv file safely even when many threads run at once.

-----

## Setup

1.Clone this repository:

     
     git clone https://github.com/nidhishsheka/task2.git  
     cd task2  

2.Make sure Java (JDK 8 or later) is installed. Check with:

     java -version  

## Usage

Compile and run the program:
  
     javac *.java  
     java StudentScoreLogger

You’ll see output like:

     Ramesh (Roll No: 278, Marks: 87) has been logged successfully.
     Bharat (Roll No: 245, Marks: 94) has been logged successfully.
     Smaran (Roll No: 118, Marks: 85) has been logged successfully.

     All students have submitted their scores successfully!

And you’ll get a file student_scores.csv with lines such as:

     278,Ramesh,87
     245,Bharat,94
     118,Smaran,85

## Running Tests

     javac -cp .:libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar *.java  
     java -cp .:libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore StudentScoreLoggerTest  


You should see something like: 
      
     JUnit version 4.13.2
     ..
     OK (2 tests)


## Project Structure

     ├── StudentScoreLogger.java      
     ├── StudentScoreLoggerTest.java  
     ├── Student.java
     ├── StudentThread.java
     ├── student.csv
     ├── README.md                    
     └── .gitignore                   


## Author

H NIDHISH SHEKA

NNM24IS289
    


     

