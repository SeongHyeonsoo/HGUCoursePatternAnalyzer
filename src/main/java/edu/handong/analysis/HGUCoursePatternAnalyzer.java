package edu.handong.analysis;

import edu.handong.analysis.datamodel.Course;
import edu.handong.analysis.datamodel.Student;

public class HGUCoursePatternAnalyzer {
	
	String[] lines = {	"1999-1, JC Nam, Java Programming",
						"1999-2, JC Nam, Programming Language Theory",
						"1999-1, JC Nam, Data Structures",
						"2001-1, JC Nam, Database Systems",
						"2018-1, SB Lim, Java Programming",
						"2018-2, SB Lim, Programming Language Theory",
						"2019-1, SB Lim, Data Structures",
						"2019-1, SB Lim, Algorithm Analysis",
						"2018-1, SJ Kim, Java Programming",
						"2018-2, SJ Kim, Programming Language Theory",
						"2019-1, SJ Kim, Logic Design",
						"2019-1, SJ Kim, Algorithm Analysis",
						};

	int numOfStudents;
	int numOfCourses;
	Student[] students;
	Course[] courses;
	
	/**
	 * This method runs our analysis logic to get the list of student and course names from lines.
	 * @param args
	 */
	public void run(String[] args) {
		
		numOfStudents = Integer.parseInt(args[0]);
		numOfCourses = Integer.parseInt(args[1]);
	
		students = initiateStudentArrayFromLines(lines);
		
		System.out.println("Number of All Students: " + numOfStudents);
		for(Student student: students) {
			if(studentExist(students, student) == false) {
				
			}else if(studentExist(students, student) == true) {
				System.out.println(student.getName());
			}
		}
		
		courses = initiateCourseArrayFromLines(lines);
		System.out.println("Number of All Courses: " + numOfCourses);
		for(Course course: courses) {
			if(courseExist(courses, course) == false) {
				
			}else if(courseExist(courses, course) == true) {
				System.out.println(course.getCourseName());
			}		
		}
		
	}

	/**
	 * This method returns a Student array to initiate the field, students, from lines.
	 * @param lines
	 * @return
	 */
	private Student[] initiateStudentArrayFromLines(String[] lines) {
		
		// TODO: implement this method

		for(int i=0;i<numOfStudents;i++){
	        String[] stringNames = lines[i].split(",");
	        String sName = stringNames[i].substring(stringNames[i].lastIndexOf(" "));
			sName.trim();
	        
	        Student Name = new Student(sName);
			
			students[i] = Name;
		}
		
		return null;
	}

	/**
	 * This method check if there is the same name of the second arguement in the array, students
	 * @param students
	 * @param student
	 * @return boolean
	 */
	private boolean studentExist(Student[] students, Student student) {
		
		// TODO: implement this method
		for(int check = numOfStudents;check>0;check--) {		
			if(student.equals(students[check]) == true) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * This method returns a Course array to initiate the field, courses, from lines.
	 * @param lines
	 * @return
	 */
	private Course[] initiateCourseArrayFromLines(String[] lines) {
		
		// TODO: implement this method
		for(int j=0;j<numOfCourses;j++){
	        String[] stringcNames = lines[j].split(",");
	        String cName = stringcNames[j].substring(15);
	        cName.trim();
	        
	        Course Name = new Course(cName);
			
			courses[j] = Name;
		}
	
		return null;
	}

	/**
	 * This method check if there is the same name of the second argument in the array, courses.
	 * @param courses
	 * @param course
	 * @return boolean
	 */
	private boolean courseExist(Course[] courses, Course course) {
		
		// TODO: implement this method
		for(int check = numOfCourses;check>0;check--) {      
	         if(course.equals(courses[check]) == true) {
	            return false;
	         }
	      }
	      
	      return true;
	}

}
