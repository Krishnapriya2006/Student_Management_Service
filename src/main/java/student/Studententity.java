package student;

public class Studententity {
      private int stud_id;
      private String name;
      private String dept;
      private String phone_no;
	Studententity(int stud_id, String name, String dept, String phone_no) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.dept = dept;
		this.phone_no = phone_no;
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "Studententity [stud_id=" + stud_id + ", name=" + name + ", dept=" + dept + ", phone_no=" + phone_no
				+ "]";
	}
      
}
