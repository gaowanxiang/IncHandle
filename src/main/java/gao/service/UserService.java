package gao.service;


import java.util.List;

import gao.domain.PageBean;
import gao.domain.User;


public interface UserService extends gao.base.BaseDao<User>{

	List<User> getResult(String string, Object[] objects);

	void save(User user);

	void update(User user);

	List<User> findAll();

	PageBean getPageBean(int i, int j, String string,  List<Object> parameters);
}