package orm;

import java.util.List;

public interface DeptDAO {
	// 新增一筆部門資料
	void save(Dept dept);
	void update(Dept dept);
	// 透過部門編號刪除一筆部門的資料
	void delete(Integer deptno);
	
	// 回傳型別為Dept部門型別
	Dept findByDeptno(Integer deptno);
	
	// 使用集合拿取多筆資料,如果getAll方法裡面有order by指令，集合就會是排序好的狀態了
	// 泛型為Dept
	List<Dept> getAll();
	
}
