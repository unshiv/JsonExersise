package trng.json.domain;

 
public class Student {
 
    private int number;
    private String name;
    private Address home = new Address();
    private Marks marks= new Marks();
    //private Address communication;
 

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*public Address getCommunication() {
		return communication;
	}
	public void setCommunication(Address communication) {
		this.communication = communication;
	}*/
	
	public Address getHome() {
		return home;
	}
	public void setHome(Address home) {
		this.home = home;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", home=" + home + ", marks=" + marks + "]";
	}
	
}

