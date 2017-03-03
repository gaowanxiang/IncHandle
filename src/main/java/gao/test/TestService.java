package gao.test;

import javax.annotation.Resource;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testService")
public class TestService {
	
	@Resource
	private SessionFactory sessionFactory;
	
	@Transactional
	public void saveTwoUsers(){

		System.out.println("--->TestService.execute()");

	
	}
}
