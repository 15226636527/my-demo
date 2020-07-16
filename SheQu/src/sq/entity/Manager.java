package sq.entity;
// Generated 2019-1-4 14:33:52 by Hibernate Tools 5.2.3.Final

/**
 *管理员
 */
public class Manager implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer managerid;
	private String account; //管理员账号
	private String pws;//管理员密码
	private String managername;//管理员名称
	private String createtime;//创建时间
	private String managersex;//管理员性别
	private String managerage;//管理员年龄
	private String managernich;//管理员昵称
	private String managerjob;//管理员职务
	private String managerphone;//手机号

	public Manager() {
	}

	public Manager(String account, String pws, String managername, String createtime, String managersex,
			String managerage, String managernich, String managerjob, String managerphone) {
		this.account = account;
		this.pws = pws;
		this.managername = managername;
		this.createtime = createtime;
		this.managersex = managersex;
		this.managerage = managerage;
		this.managernich = managernich;
		this.managerjob = managerjob;
		this.managerphone = managerphone;
	}

	public Integer getManagerid() {
		return this.managerid;
	}

	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPws() {
		return this.pws;
	}

	public void setPws(String pws) {
		this.pws = pws;
	}

	public String getManagername() {
		return this.managername;
	}

	public void setManagername(String managername) {
		this.managername = managername;
	}

	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getManagersex() {
		return this.managersex;
	}

	public void setManagersex(String managersex) {
		this.managersex = managersex;
	}

	public String getManagerage() {
		return this.managerage;
	}

	public void setManagerage(String managerage) {
		this.managerage = managerage;
	}

	public String getManagernich() {
		return this.managernich;
	}

	public void setManagernich(String managernich) {
		this.managernich = managernich;
	}

	public String getManagerjob() {
		return this.managerjob;
	}

	public void setManagerjob(String managerjob) {
		this.managerjob = managerjob;
	}

	public String getManagerphone() {
		return this.managerphone;
	}

	public void setManagerphone(String managerphone) {
		this.managerphone = managerphone;
	}

}
