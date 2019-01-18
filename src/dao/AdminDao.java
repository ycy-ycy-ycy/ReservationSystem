package dao;

import java.sql.SQLException;
import entity.Admin;
/**
 * 管理员Dao接口
 * @author 我的袜子都是洞
 * @date: 2019-01-18
 */
public interface AdminDao {
	/**
	 * 创建管理员
	 * @param 管理员对象
	 * @return 创建结果
	 */
	boolean saveAdmin (Admin admin) throws SQLException;
	/**
	 * 删除管理员
	 * @param admin
	 * @return
	 */
	boolean delAdmin (int id) throws SQLException;
	/**
	 * 更新管理员信息
	 * @param 管理员对象
	 * @return
	 */
	boolean updateAdmin(Admin admin) throws SQLException;
	/**
	 * 获得管理员
	 * @return 管理员对象
	 */
	Admin getAdmin (int id) throws SQLException;
	/**
	 * 获得所有管理员
	 * @return 管理员对象数组
	 */
	Admin[] listAdmin() throws SQLException;
}
