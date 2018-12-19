package by.htp.xml.entity;

public class Mother {

	private String name;

	private String surname;
	private String maidName;
	private int age;
	public Mother() {
		
	}
	public Mother(String name, String surname, String maidName, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.maidName = maidName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMaidName() {
		return maidName;
	}

	public void setMaidName(String maidName) {
		this.maidName = maidName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Mother [name=" + name + ", surname=" + surname + ", maidName=" + maidName + ", age=" + age + "]";
	}

	
}
