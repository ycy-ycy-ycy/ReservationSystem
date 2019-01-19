package manage;

import entity.User;
import exception.UserException;

/**
 * @Description: 用户管理接口
 * @author: 我的袜子都是洞
 * @date: 2019-01-19 14:00
 */
public interface UserManage {
	/**
	 * 用户登陆验证
	 * @param loginname
	 * @return 验证结果
	 */
	boolean loginUser (String loginname, String password1,String password2) throws UserException;
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	boolean registerUser (String loginname, String password1,String password2) throws UserException;
}
