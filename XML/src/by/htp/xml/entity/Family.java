package by.htp.xml.entity;

public class Family {
	private String adress;
	private Mother mother;
	private Father father;

	public Family() {

	}

	public Family(String adress, Mother mother) {
		super();
		this.adress = adress;
		this.mother = mother;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	@Override
	public String toString() {
		return "Family [adress=" + adress + ", mother=" + mother + "]";
	}

}
