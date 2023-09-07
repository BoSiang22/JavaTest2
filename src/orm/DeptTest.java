package orm;

import java.util.List;
import java.util.Scanner;

public class DeptTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("要新增(或要查詢)的編號");
//		int deptno = sc.nextInt();
//		System.out.println("要新增的名稱");
//		String dname = sc.next();
//		System.out.println("要新增的所在地");
//		String loc = sc.next();
		
//		sc.close();
		
		// 用Dept Bean包裝要新增的資料
		
//		Dept dept = new Dept(deptno,dname,loc);
//		// 透過DAO物件呼叫方法完成新增部門資料，也就是剛剛寫好的實作類別物件，來呼叫剛剛寫好的方法
//		DeptDAO dao = new DeptDAOImpl();
//		dao.save(dept);
//		System.out.println("成功新增一筆資料到資料庫的department表格裡");
		
		
		// 透過dao物件呼叫方法完成新增部門資訊
//		DeptDAO dao = new DeptDAOImpl();
//		Dept dept = dao.findByDeptno(deptno);
//		System.out.println(dept);
		
		DeptDAO dao = new DeptDAOImpl();
		List<Dept> deptList = dao.getAll();
		for (Dept dept : deptList) {
			System.out.println(dept);
		}
					
	}
}
