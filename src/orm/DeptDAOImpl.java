package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//這個類別裡面放的是JDBC的資料庫指令
// 實作DeptDAO介面的類別
public class DeptDAOImpl implements DeptDAO {
	
	public static final String INSERT_STMT = "insert into department values (?, ?, ?)";
	public static final String FIND_BY_DEPTNO= "select * from department where deptno = ?";
	public static final String GET_ALL = "select * from department order by deptno";
	
	
	static {
		try {
			Class.forName(Util.DRIVER);
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		
	}
	
	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			pstmt.executeUpdate();
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, null);
		}
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dept findByDeptno(Integer deptno) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Dept dept = null;
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO);
			
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				// 用 Dept Bean包裝查詢出來的部門資料做回傳
				dept = new Dept();
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				// 可以寫成
//				dpet.setDeptno(rs.getString("dname"));
//				dept.setLoc(rs.getString("loc"));
				dept.setDeptno(deptno);
				dept.setDname(dname);
				dept.setLoc(loc);
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, rs);
		}
		
		return dept;
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList = new ArrayList<>();
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				// 用 Dept Bean包裝查詢出來的部門資料做回傳
				Dept dept = new Dept();
				
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				// 用集合收集著包裝好的查詢結果(部門物件)
				deptList.add(dept);
				
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, rs);
		}
		
		return deptList;
	}

}
