package net.roseindia.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id; 

@Entity (name = "Test_Table") 
public class TestTable {
	
	private int id;
	private String firstName,lastName;
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="firstname")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="lastname")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	 

	
}
  

















// more: http://mrbool.com/how-to-create-database-table-using-hibernate/28269#ixzz66yhuuvwT