package sq.entity;
// Generated 2019-1-4 14:32:30 by Hibernate Tools 5.2.3.Final

/**
 * 社区
 */
public class Community implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer sqid;//社区id ,int,主键递增
	private String sqnum;//社区编号varchar(50)
	private String sqname;//社区名称varchar(50)
	private String sqaddress;//社区地址varchar(50)
	private String sqprovince;//社区地址（省）varchar(50)
	private String sqcity;//社区地址（市）varchar(50)
	private String sqcounty;//社区地址（县）varchar(50)
	private String sqarea;//社区地址（区、乡镇）varchar(50)
	private String sqvillage;//社区地址（村、街道）varchar(50)
	private String sqremark;//社区备注varchar(100)
	private String sqa;// 备用字段，varchar(500)
	private String sqb;// 备用字段varchar(100)
	private String sqc;// 备用字段varchar(100)
	private String sqd;// 备用字段varchar(100)
	private String sde;// 备用字段varchar(100)
	private String sqf;// 备用字段varchar(100)
	private String sqg;// 备用字段varchar(100)

	public Community() {
	}

	public Community(String sqnum, String sqname, String sqaddress, String sqprovince, String sqcity, String sqcounty,
			String sqarea, String sqvillage, String sqremark, String sqa, String sqb, String sqc, String sqd,
			String sde, String sqf, String sqg) {
		this.sqnum = sqnum;
		this.sqname = sqname;
		this.sqaddress = sqaddress;
		this.sqprovince = sqprovince;
		this.sqcity = sqcity;
		this.sqcounty = sqcounty;
		this.sqarea = sqarea;
		this.sqvillage = sqvillage;
		this.sqremark = sqremark;
		this.sqa = sqa;
		this.sqb = sqb;
		this.sqc = sqc;
		this.sqd = sqd;
		this.sde = sde;
		this.sqf = sqf;
		this.sqg = sqg;
	}

	public Integer getSqid() {
		return this.sqid;
	}

	public void setSqid(Integer sqid) {
		this.sqid = sqid;
	}

	public String getSqnum() {
		return this.sqnum;
	}

	public void setSqnum(String sqnum) {
		this.sqnum = sqnum;
	}

	public String getSqname() {
		return this.sqname;
	}

	public void setSqname(String sqname) {
		this.sqname = sqname;
	}

	public String getSqaddress() {
		return this.sqaddress;
	}

	public void setSqaddress(String sqaddress) {
		this.sqaddress = sqaddress;
	}

	public String getSqprovince() {
		return this.sqprovince;
	}

	public void setSqprovince(String sqprovince) {
		this.sqprovince = sqprovince;
	}

	public String getSqcity() {
		return this.sqcity;
	}

	public void setSqcity(String sqcity) {
		this.sqcity = sqcity;
	}

	public String getSqcounty() {
		return this.sqcounty;
	}

	public void setSqcounty(String sqcounty) {
		this.sqcounty = sqcounty;
	}

	public String getSqarea() {
		return this.sqarea;
	}

	public void setSqarea(String sqarea) {
		this.sqarea = sqarea;
	}

	public String getSqvillage() {
		return this.sqvillage;
	}

	public void setSqvillage(String sqvillage) {
		this.sqvillage = sqvillage;
	}

	public String getSqremark() {
		return this.sqremark;
	}

	public void setSqremark(String sqremark) {
		this.sqremark = sqremark;
	}

	public String getSqa() {
		return this.sqa;
	}

	public void setSqa(String sqa) {
		this.sqa = sqa;
	}

	public String getSqb() {
		return this.sqb;
	}

	public void setSqb(String sqb) {
		this.sqb = sqb;
	}

	public String getSqc() {
		return this.sqc;
	}

	public void setSqc(String sqc) {
		this.sqc = sqc;
	}

	public String getSqd() {
		return this.sqd;
	}

	public void setSqd(String sqd) {
		this.sqd = sqd;
	}

	public String getSde() {
		return this.sde;
	}

	public void setSde(String sde) {
		this.sde = sde;
	}

	public String getSqf() {
		return this.sqf;
	}

	public void setSqf(String sqf) {
		this.sqf = sqf;
	}

	public String getSqg() {
		return this.sqg;
	}

	public void setSqg(String sqg) {
		this.sqg = sqg;
	}

}
