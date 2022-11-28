package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String Name;
	private String Designation;
	private String emailId;
	private String Address;
	private String ReportingPerson;
	private String CompanyName;
	private String ProjectName;

	public Employee() {
		
	}
	
	public Employee(String Name, String Designation, String emailId, String Address,String ReportingPerson,
			String CompanyName,String ProjectName) {
		this.Name = Name;
		this.Designation = Designation;
		this.emailId = emailId;
		this.Address=Address;
		this.ReportingPerson=ReportingPerson;
		this.CompanyName=CompanyName;
		this.ProjectName=ProjectName;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "Name", nullable = false)
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	@Column(name = "Designation", nullable = false)
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}
	
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "Address", nullable = false)
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	@Column(name = "ReportingPerson", nullable = false)
	public String getReportingPerson() {
		return ReportingPerson;
	}

	public void setReportingPerson(String reportingPerson) {
		ReportingPerson = reportingPerson;
	}
	@Column(name = "CompanyName", nullable = false)
	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	@Column(name = "ProjectName", nullable = false)
	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Designation=" + Designation + ", emailId=" + emailId + ", "
				+ "Companyname=" + CompanyName + ",ProjectName="+ ProjectName 
				+ "]";
	}

}
