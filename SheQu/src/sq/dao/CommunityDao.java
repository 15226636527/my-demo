package sq.dao;

import java.util.List;

import sq.entity.Community;

/**
 * 社区 dao层接口
 * @author admin
 *
 */
public interface CommunityDao {

	/**
	 *  添加社区
	 * @param community 社区实体
	 */
	public void addCom(Community community);
	
	/**
	 * 根据社区id删除社区
	 * @param comid  社区id
	 */
	public void deleteCom(int comid);
	

	/**
	 * 修改社区
	 * @param community 社区实体
	 */
	public void updateCom(Community community);
	
	/**
	 * 查询全部社区。根据名称排序
	 * @return
	 */
	public List<Community> findAllCom();
	
	/**
	 * 根据id查询 社区
	 * @param comid  社区id
	 * @return
	 */
	public Community findComById(int comid);
	
	/**
	 * 根据社区名称 模糊查询
	 * @param name 社区名称
	 * @return
	 */
	public List<Community> findComByName(String name);
	
	
	
}
