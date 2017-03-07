package gao.action;

import java.io.File;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import gao.domain.User;
import gao.service.UserService;

@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User>{

	@Resource
	private UserService userService;


	private String page;
    private File s;
    private String sFileName;
    private String sContentType;
    
	private User model = new User();
	
	public User getModel() {
		return model;
	}
	
	protected int pageNum = 1; // 当前页

	protected int pageSize = 10; // 每页显示多少条记录
	
	public String test() throws Exception{
		User user = new User();
		user.setUserId(1);
		user.setUserName("Gao");
		user.setUserType("A");
		user.setCompanyId(0);
		userService.save(user);
		return "test";
	}

	
	public int getPageNum() {

	return pageNum;

	}

	public void setPageNum(int pageNum) {

	this.pageNum = pageNum;

	}

	public int getPageSize() {

	return pageSize;

	}

	public void setPageSize(int pageSize) {

	this.pageSize = pageSize;

	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public File getS() {
		return s;
	}

	public void setS(File s) {
		this.s = s;
	}

	public String getSFileName() {
		return sFileName;
	}

	public void setSFileName(String sFileName) {
		this.sFileName = sFileName;
	}

	public String getSContentType() {
		return sContentType;
	}

	public void setSContentType(String sContentType) {
		this.sContentType = sContentType;
	}


}
	