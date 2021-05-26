package com.technoelevate.encpasulation;

public class Encapsulation {
	
	String ename;
	int sal;
	String dept;
	

	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		if(sal>0)
		{
			this.sal = sal;
		}
		else {
			System.out.println("sal should be more than 0");
		}
		
	}

}
