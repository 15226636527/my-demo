package sq.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sq.entity.Community;
/**
 * 社区 dao层接口实现类
 * @author admin
 *
 */
public class CommunityDaoImpl implements CommunityDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	} 
	@Override
	public void addCom(Community community) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();// 获取Session
			tx = session.beginTransaction();// 开启事务
			session.save(community);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			tx.commit();
			session.close();
		}		
	}

	@Override
	public void deleteCom(int comid) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();// 获取Session
			tx = session.beginTransaction();// 开启事务
			Community com = (Community) session.get(Community.class, comid);
			if(null != com){
				session.delete(com);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			tx.commit();
			session.close();
		}		
	}

	@Override
	public void updateCom(Community community) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();// 获取Session
			tx = session.beginTransaction();// 开启事务
			session.saveOrUpdate(community);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			tx.commit();
			session.close();
		}		
	}

	@Override
	public List<Community> findAllCom() {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();// 获取Session
			tx = session.beginTransaction();// 开启事务
			String hql = "from Community order by sqname";
			Query query = session.createQuery(hql);
			List<Community> comList =  query.list();
			return comList;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			tx.commit();
			session.close();
		}		
	}

	@Override
	public Community findComById(int comid) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();// 获取Session
			tx = session.beginTransaction();// 开启事务
			String hql = "from Community where sqid=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, comid);
			Community com = (Community) query.uniqueResult();
			return com;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			tx.commit();
			session.close();
		}		
	}

	@Override
	public List<Community> findComByName(String name) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();// 获取Session
			tx = session.beginTransaction();// 开启事务
			String hql = "from Community where sqname like ?";
			Query query = session.createQuery(hql);
			query.setParameter(0, "'%"+name+"%'");
			List<Community> comList =  query.list();
			return comList;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			tx.commit();
			session.close();
		}		
	}

}
