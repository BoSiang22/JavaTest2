package orm;

import java.io.Serializable;

public class Dept implements Serializable { //這個Dept類別對應到資料庫的部門表格
	// 因為此類別創建出來的物件要拿來做為前後端的資料傳輸，所以要實作空介面Serializable
	private Integer deptno;
	// 對JDBC要做的動作
	private String dname;
	private String loc;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
}
