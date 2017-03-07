package gao.base;

import java.util.List;

import gao.domain.PageBean;

public interface BaseDao<T> {
	/**
	 * 保存实体
	 * 
	 * @param entity
	 */
	void save(T entity);

	/**
	 * 删除实体
	 * 
	 * @param id
	 */
	void delete(Long id);

	/**
	 * 更新实体
	 * 
	 * @param entity
	 */
	void update(T entity);

	/**
	 * 按id查询
	 * 
	 * @param id
	 * @return
	 */
	T getById(Long id);

	/**
	 * 按id查询
	 * 
	 * @param ids
	 * @return
	 */
	List<T> getByIds(Long[] ids);

	
	/**
	 * 按status查询
	 * 
	 * @param ids
	 * @return
	 */
	public List<T> getByStatus(String status);
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * 用语句查询
	 * 
	 * @return
	 */
	public List<T> getResult(String hql, Object[] parameters);
	
	PageBean getPageBean(int pageNum, int pageSize, String hql, List<Object> parameters);
}
