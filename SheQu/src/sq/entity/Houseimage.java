package sq.entity;
/**
 * 户型图实体类
 */
public class Houseimage implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer houseid; //户型id
	private String housename;//户型名称varchar(50)
	private String housenum;//户型编号
	private String houseinfo;//户型简介
	private String housecreatetime;//创建时间
	private String housecreateperson;//创建人
	private String houseaccess;//访问地址,varchar(200)
	private String housestorage;//存放地址varchar(200)
	private Integer houseSfid;//对应社区id
	private Integer houseFloorid;//对应楼层id
	private String houserremark;//户型备注,varchar(100)
	private String housea;//备用字段)
	private String houseb;//备用字段)
	private String housec;//备用字段)
	private String housed;//备用字段)
	private String housee;//备用字段)
	private String housef;//备用字段)
	private String houseg;//备用字段)

	public Houseimage() {
	}

	public Houseimage(String housename, String housenum, String houseinfo, String housecreatetime,
			String housecreateperson, String houseaccess, String housestorage, Integer houseSfid, Integer houseFloorid,
			String houserremark, String housea, String houseb, String housec, String housed, String housee,
			String housef, String houseg) {
		this.housename = housename;
		this.housenum = housenum;
		this.houseinfo = houseinfo;
		this.housecreatetime = housecreatetime;
		this.housecreateperson = housecreateperson;
		this.houseaccess = houseaccess;
		this.housestorage = housestorage;
		this.houseSfid = houseSfid;
		this.houseFloorid = houseFloorid;
		this.houserremark = houserremark;
		this.housea = housea;
		this.houseb = houseb;
		this.housec = housec;
		this.housed = housed;
		this.housee = housee;
		this.housef = housef;
		this.houseg = houseg;
	}

	public Integer getHouseid() {
		return this.houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public String getHousename() {
		return this.housename;
	}

	public void setHousename(String housename) {
		this.housename = housename;
	}

	public String getHousenum() {
		return this.housenum;
	}

	public void setHousenum(String housenum) {
		this.housenum = housenum;
	}

	public String getHouseinfo() {
		return this.houseinfo;
	}

	public void setHouseinfo(String houseinfo) {
		this.houseinfo = houseinfo;
	}

	public String getHousecreatetime() {
		return this.housecreatetime;
	}

	public void setHousecreatetime(String housecreatetime) {
		this.housecreatetime = housecreatetime;
	}

	public String getHousecreateperson() {
		return this.housecreateperson;
	}

	public void setHousecreateperson(String housecreateperson) {
		this.housecreateperson = housecreateperson;
	}

	public String getHouseaccess() {
		return this.houseaccess;
	}

	public void setHouseaccess(String houseaccess) {
		this.houseaccess = houseaccess;
	}

	public String getHousestorage() {
		return this.housestorage;
	}

	public void setHousestorage(String housestorage) {
		this.housestorage = housestorage;
	}

	public Integer getHouseSfid() {
		return this.houseSfid;
	}

	public void setHouseSfid(Integer houseSfid) {
		this.houseSfid = houseSfid;
	}

	public Integer getHouseFloorid() {
		return this.houseFloorid;
	}

	public void setHouseFloorid(Integer houseFloorid) {
		this.houseFloorid = houseFloorid;
	}

	public String getHouserremark() {
		return this.houserremark;
	}

	public void setHouserremark(String houserremark) {
		this.houserremark = houserremark;
	}

	public String getHousea() {
		return this.housea;
	}

	public void setHousea(String housea) {
		this.housea = housea;
	}

	public String getHouseb() {
		return this.houseb;
	}

	public void setHouseb(String houseb) {
		this.houseb = houseb;
	}

	public String getHousec() {
		return this.housec;
	}

	public void setHousec(String housec) {
		this.housec = housec;
	}

	public String getHoused() {
		return this.housed;
	}

	public void setHoused(String housed) {
		this.housed = housed;
	}

	public String getHousee() {
		return this.housee;
	}

	public void setHousee(String housee) {
		this.housee = housee;
	}

	public String getHousef() {
		return this.housef;
	}

	public void setHousef(String housef) {
		this.housef = housef;
	}

	public String getHouseg() {
		return this.houseg;
	}

	public void setHouseg(String houseg) {
		this.houseg = houseg;
	}

}
