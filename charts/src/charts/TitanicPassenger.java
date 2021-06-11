package charts;

public class TitanicPassenger {
	private int PassengerId;
	private String Survived;
	private String Pclass;
	private String Name;
	private String Sex;
	private Double Age;
	private String SibSp;
	private String Parch;
	private String Ticket;
	private Double Fare;
	private String Cabin;
	private String Embarked;
	public TitanicPassenger() {
		// TODO Auto-generated constructor stub
	}
	public TitanicPassenger( int m_PassengerId,String m_Survived,String m_Pclass,
				  String m_Name,String m_Sex,Double m_Age,String m_SibSp,String m_Parch,String 
				  m_Ticket,Double m_Fare,String m_Cabin,String m_Embarked) {

		PassengerId = m_PassengerId;
		Survived = m_Survived;
		Pclass = m_Pclass;
		Name = m_Name;
		Sex = m_Sex;
		Age = m_Age;
		SibSp = m_SibSp;
		Parch = m_Parch;
		Ticket = m_Ticket;
		Fare = m_Fare;
		Cabin = m_Cabin;
		Embarked = m_Embarked;
	}
	public int getPassengerId() {
		return PassengerId;
	}
	public void setPassengerId(int passengerId) {
		PassengerId = passengerId;
	}
	public String getPclass() {
		return Pclass;
	}
	public void setPclass(String pclass) {
		Pclass = pclass;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String isSurvived() {
		return Survived;
	}
	public void setSurvived(String survived) {
		Survived = survived;
	}
	public Double getAge() {
		return Age;
	}
	public void setAge(Double age) {
		Age = age;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getCabin() {
		return Cabin;
	}
	public void setCabin(String cabin) {
		Cabin = cabin;
	}
	public String getSibSp() {
		return SibSp;
	}
	public void setSibSp(String sibSp) {
		SibSp = sibSp;
	}
	public String getParch() {
		return Parch;
	}
	public void setParch(String parch) {
		Parch = parch;
	}
	public String getTicket() {
		return Ticket;
	}
	public void setTicket(String ticket) {
		Ticket = ticket;
	}
	public Double getFare() {
		return Fare;
	}
	public void setFare(Double fare) {
		Fare = fare;
	}
	public String getEmbarked() {
		return Embarked;
	}
	public void setEmbarked(String embarked) {
		Embarked = embarked;
	}
}