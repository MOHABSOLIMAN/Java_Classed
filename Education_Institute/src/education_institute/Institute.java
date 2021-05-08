package education_institute;
import java.util.List;

public class Institute extends Person {
	public class Educational_Institute {

	    private String Name ;
	    private List<Person> Students ;
	    private List<Person> Instructors ;
	    private List<Person> Admins ;
	    public Educational_Institute(String Name, List<Person> Students , List<Person> Instructors , List<Person> Admins){
	        this.Name=Name;
	        this.Students=Students;
	        this.Instructors=Instructors;
	        this.Admins=Admins;

	    }

	    public String getName() {
	        return Name;
	    }
	    public void setName (String name){
	        Name = name ;
	    }

	    public List<Person> getAdmins() {
	        return Admins;
	    }

	    public List<Person> getInstructors() {
	        return Instructors;
	    }

	    public List<Person> getStudents() {
	        return Students;
	    }
	}
}
