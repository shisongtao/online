package dao;

import entity.User;

public interface UserDao {
	/**
	 * 保存用户
	 * @param user
	 * @return
	 */
	public void save(User user);
}
