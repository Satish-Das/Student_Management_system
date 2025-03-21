import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		
		// for input data or value from the user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// infinite Loop 
		while (true) {
			
			// Choice of type values in given number
			System.out.println("PRSSS 1 Add Student!");
			System.out.println("PRESS 2 Delete Student!");
			System.out.println("PRESS 3 Diplay Student!");
			System.out.println("PRESS 4 to Exit App");
			
			
			// using buffer reader then always get String that's here converted in Integer
			int c = Integer.parseInt(br.readLine());
			
			// check what is entered values via user 
			if (c == 1) {
				// Add Student
				System.out.println("Enter user name ");
				String name = br.readLine();
				
				System.out.println("Enter user phone ");
				String phone = br.readLine();
				
				System.out.println("Enter user city ");
				String city = br.readLine();
				
				// Create Student Object to store student
				Student st = new Student(name, phone, city);	
				
				// here get anthing after perform this statement
			    boolean answer = StudentDao.inserStudentToDB(st);
			    
			    if (answer) {
					System.out.println("Student Added Succesfully.....");
				}else {
					System.out.println("Something went wrong try again..");
				}
				
//				System.out.println(st);
			}
			else if (c == 2) {
				// Delete Student
				
				System.out.println("Enter Student i'd to delete: ");
				// here get anthing after perform this statement
				int userId = Integer.parseInt(br.readLine());
				boolean answer = StudentDao.deleteStudent(userId);
				
				if (answer) {
					System.out.println("Student Deleted Succesfully.....");
				}else {
					System.out.println("Something went wrong try again..");
				}
			}
			else if ( c == 3) {
				// Display Student
				StudentDao.showAllStudents();
				
			}
			else if (c == 4) {
				break;
			}
		}
		
		System.out.println("Thankyou for using my Application....");
		System.out.println("See you soon... bye bye");
	}

}
