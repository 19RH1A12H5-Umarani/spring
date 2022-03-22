package com.motivity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="Employer")
@Entity
public class Employer {
	@Id
	@Column(name="employer_id")
	private int employer_id;
	@Column(name="employer_name")
	private String employer_name;
	@Column(name="department")
	private String department;
	@Column(name="mobile")
	private long mobile;
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Employee.class,cascade=CascadeType.ALL)
	@JoinColumn(name="fkeid",referencedColumnName="employer_id")
	private Set<Employee> employee;
	public int getEmployer_id() {
		return employer_id;
	}
	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}
	public String getEmployer_name() {
		return employer_name;
	}
	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	

}
