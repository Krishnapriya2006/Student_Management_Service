package student;

import java.util.Scanner;

public class Main {
	public static void main(String args[] ){
     Scanner sc=new Scanner(System.in);
     StudentService service =new StudentService();
     while(true)
     {
    	 System.out.println("--Student_Management_System--");
    	 System.out.println("1.Add Student");
    	 System.out.println("2.View all Student");
    	 System.out.println("3.Find student by id");
    	 System.out.println("4.Delete student");
    	 System.out.println("5.update student");
    	 System.out.println("Enter your choice:");
    	  int choice=sc.nextInt();
    	  sc.nextLine();
    	  switch(choice)
    	  {
    	  case 1:
    		  //add student
    		  System.out.print("enter the id:");
    		  int stud_id=sc.nextInt();
    		  sc.nextLine();
    		  System.out.print("enter the name:");
    		  String name=sc.nextLine();
    		  System.out.print("enter the dept:");
    		  String dept=sc.nextLine();
    		  System.out.print("enter the phone_no:");
    		  String phone_no =sc.nextLine();
    		  Studententity stud =new Studententity(stud_id,name,dept,phone_no);
    		  service.addstudent(stud);
    		  break;
    		  
    	  
    	  case 2:
    		  //view all students
    		  service.viewallstudents();
    		  break;
    	  case 3:
    		  //find student
    		  System.out.print("enter the student id:");
    		  int id=sc.nextInt();
    		  Studententity found=service.findstudentbyid(id);
    		  if(found!=null)
    		  {
    			  System.out.println(found);
    			  
    		  }
    		  else {
    			  System.out.println("student not found");
    		  }
    		  
    		  break;
    		  
    	  case 4:
    		  //delete student
    		  System.out.print("enter the studentid:");
    		  int id1=sc.nextInt();
    		  Studententity found1=service.deleteStudentbyid(id1);
    		  if(found1!=null)
    		  {
    			  System.out.println("succesfully deleted");
    		  }
    		  else
    		  {
    			  System.out.println("student not found");
    		  }
              break;
    	  case 5:
    		  //update student
    		  System.out.println("enter the student id:");
    		  int id2=sc.nextInt();
    		  sc.nextLine();
    		  System.out.println("enter the new name:");
    		  String newName =sc.nextLine();
    		  System.out.println("enter the new dept:");
    		  String newDept =sc.nextLine();
    		  System.out.println("enter the new number:");
    		  String newno =sc.nextLine();
    		  Studententity updated =service.updateStudentbyid(id2,newName,newDept,newno);
    		  if(updated!=null)
    		  {
    			  System.out.println("successfully updated"+updated);
    			  
    		  }else
    		  {
    			  System.out.println("Student not updated with this id");
    		  }
    		  
    		  break;
    	  case 6:
    		  System.out.println("exit");
    		  break;
    		  
    		  
    		  
    		  
    			  
    		  }
    	 
    	 
     }
     
     
}}
