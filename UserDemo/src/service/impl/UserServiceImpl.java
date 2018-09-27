package service.impl;

import service.UserService;
import dao.UserDao;
import entity.User;


public class UserServiceImpl implements UserService {
	//
	
	private UserDao dao;
	
	public UserServiceImpl() {
		
	}
	
	public UserServiceImpl(UserDao dao) {
		this.dao = dao;
	}
	//
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

}
