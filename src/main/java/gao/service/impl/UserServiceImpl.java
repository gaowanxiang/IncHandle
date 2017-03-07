package gao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import gao.base.BaseDaoImpl;
import gao.dao.UserDao;
import gao.domain.PageBean;
import gao.domain.User;
import gao.service.UserService;


@Service
@Transactional
public class   UserServiceImpl extends BaseDaoImpl<User> implements UserService{

	@Resource
	private UserDao userDao;

	public List<User> getResult(String string, Object[] objects) {
		return userDao.getResult(string, objects);
	}

	public void save(User user) {
		userDao.save(user);
	}

	public void update(User user) {
		userDao.update(user);
		
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public PageBean getPageBean(int i, int j, String string, List<Object> parameters) {
		return userDao.getPageBean(i, j, string, parameters);
	}



}
