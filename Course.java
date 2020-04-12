
public class Course
{
	private List<Student> students;

	public Course()
	{ this.students = new ArrayList<>(); }

	public void addStudent(Student student)
	{ this.students.add(student); }

	public void removeStudent(Student student)
	{ this.students.remove(student); }

	public Student getStudent(Student student)
	{ return this.students.get(student); }
}
