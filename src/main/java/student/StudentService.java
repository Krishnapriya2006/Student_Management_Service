package student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
       //listing all the students
	private List<Studententity> students =new ArrayList<>();
	//adding students to the list

	public void addstudent(Studententity s)
	{
		students.add(s);
		System.out.println("Student was successfully added!");
		}
	public void viewallstudents()
	{
		if(students.isEmpty()) {
			System.out.println("No student is found");
			}
		for(Studententity s:students)
		{
			System.out.println(s);
		}
	}
	public Studententity findstudentbyid (int stud_id)
	{
		for(Studententity s:students)
		{
			if(s.getStud_id()==stud_id)
				return s;
		}return null;
	}
	public Studententity deleteStudentbyid(int stud_id)
	{
		for(int i=0;i<students.size();i++)
		{
			Studententity s=students.get(i);
		
		{
			if(s.getStud_id()==stud_id)
			{
				students.remove(i);
				return s;
			}
		}}return null;
		}
	public Studententity updateStudentbyid(int stud_id,String newName,String newDept,String newNo)
	{
		for(Studententity s : students ) {
			if(s.getStud_id()==stud_id)
			{
				s.setName(newName);
				s.setDept(newDept);
				s.setPhone_no(newNo);
				return s;
			}
			}return null;
		}
	}

