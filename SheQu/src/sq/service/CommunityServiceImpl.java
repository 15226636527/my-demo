package sq.service;

import java.util.List;

import sq.dao.CommunityDao;
import sq.entity.Community;

public class CommunityServiceImpl implements CommunityService {

	private CommunityDao communityDao;
	public void setCommunityDao(CommunityDao communityDao) {
		this.communityDao = communityDao;
	}
	@Override
	public void addCom(Community community) {
		communityDao.addCom(community);
	}

	@Override
	public void deleteCom(int comid) {
		communityDao.deleteCom(comid);
	}

	@Override
	public void updateCom(Community community) {
		communityDao.updateCom(community);
	}

	@Override
	public List<Community> findAllCom() {
		List<Community> comList = communityDao.findAllCom();
		return comList;
	}

	@Override
	public Community findComById(int comid) {
		Community com = communityDao.findComById(comid);
		return com;
	}

	@Override
	public List<Community> findComByName(String name) {
		List<Community> comList = communityDao.findComByName(name);
		return comList;
	}

}
