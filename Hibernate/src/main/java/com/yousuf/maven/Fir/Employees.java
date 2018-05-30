package com.yousuf.maven.Fir;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "emp_hibern")
public class Employees {
	@Id
private int empId;
@Column(name="emp_name")
private String empName;
@Column(name="emp_sal")
private int empSal;


public Employees(int empId,String empName, int empSal){
     super();
     this.empId = empId;
     this.empName = empName;
     this.empSal = empSal;
}
}
