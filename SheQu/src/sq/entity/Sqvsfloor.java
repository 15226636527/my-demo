package sq.entity;
// Generated 2019-1-4 14:33:52 by Hibernate Tools 5.2.3.Final

/**
 * 社区楼层关系 实体类
 */
public class Sqvsfloor implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer sfid; //
	private String sfnum;//编号
	private String sfname;//名称
	private Integer sfSqid;//社区id
	private String sfSqname;//社区名称
	private String sfSqnum;//社区编号
	private Integer sfFloorid;//楼层id
	private String sfFloorname;//楼层名称
	private String sfFloornum;//楼层编号
	private String sfcreatetime;//创建时间
	private String sfcreateperson;//创建人
	private String sfshow;//楼层描述 ,varchar(500)
	private String sfremark;//备注
	private String sfimageaccess;//图片访问地址楼层描述 ,varchar(200)
	private String sfimagesave;//图片存储地址
	private String sfimagename;//图片名称
	private Integer sfpicid;//图片id
	private String sfa;//
	private String sfb;//
	private String sfc;//

	public Sqvsfloor() {
	}

	public Sqvsfloor(String sfnum, String sfname, Integer sfSqid, String sfSqname, String sfSqnum, Integer sfFloorid,
			String sfFloorname, String sfFloornum, String sfcreatetime, String sfcreateperson, String sfshow,
			String sfremark, String sfimageaccess, String sfimagesave, String sfimagename, Integer sfpicid, String sfa,
			String sfb, String sfc) {
		this.sfnum = sfnum;
		this.sfname = sfname;
		this.sfSqid = sfSqid;
		this.sfSqname = sfSqname;
		this.sfSqnum = sfSqnum;
		this.sfFloorid = sfFloorid;
		this.sfFloorname = sfFloorname;
		this.sfFloornum = sfFloornum;
		this.sfcreatetime = sfcreatetime;
		this.sfcreateperson = sfcreateperson;
		this.sfshow = sfshow;
		this.sfremark = sfremark;
		this.sfimageaccess = sfimageaccess;
		this.sfimagesave = sfimagesave;
		this.sfimagename = sfimagename;
		this.sfpicid = sfpicid;
		this.sfa = sfa;
		this.sfb = sfb;
		this.sfc = sfc;
	}

	public Integer getSfid() {
		return this.sfid;
	}

	public void setSfid(Integer sfid) {
		this.sfid = sfid;
	}

	public String getSfnum() {
		return this.sfnum;
	}

	public void setSfnum(String sfnum) {
		this.sfnum = sfnum;
	}

	public String getSfname() {
		return this.sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	public Integer getSfSqid() {
		return this.sfSqid;
	}

	public void setSfSqid(Integer sfSqid) {
		this.sfSqid = sfSqid;
	}

	public String getSfSqname() {
		return this.sfSqname;
	}

	public void setSfSqname(String sfSqname) {
		this.sfSqname = sfSqname;
	}

	public String getSfSqnum() {
		return this.sfSqnum;
	}

	public void setSfSqnum(String sfSqnum) {
		this.sfSqnum = sfSqnum;
	}

	public Integer getSfFloorid() {
		return this.sfFloorid;
	}

	public void setSfFloorid(Integer sfFloorid) {
		this.sfFloorid = sfFloorid;
	}

	public String getSfFloorname() {
		return this.sfFloorname;
	}

	public void setSfFloorname(String sfFloorname) {
		this.sfFloorname = sfFloorname;
	}

	public String getSfFloornum() {
		return this.sfFloornum;
	}

	public void setSfFloornum(String sfFloornum) {
		this.sfFloornum = sfFloornum;
	}

	public String getSfcreatetime() {
		return this.sfcreatetime;
	}

	public void setSfcreatetime(String sfcreatetime) {
		this.sfcreatetime = sfcreatetime;
	}

	public String getSfcreateperson() {
		return this.sfcreateperson;
	}

	public void setSfcreateperson(String sfcreateperson) {
		this.sfcreateperson = sfcreateperson;
	}

	public String getSfshow() {
		return this.sfshow;
	}

	public void setSfshow(String sfshow) {
		this.sfshow = sfshow;
	}

	public String getSfremark() {
		return this.sfremark;
	}

	public void setSfremark(String sfremark) {
		this.sfremark = sfremark;
	}

	public String getSfimageaccess() {
		return this.sfimageaccess;
	}

	public void setSfimageaccess(String sfimageaccess) {
		this.sfimageaccess = sfimageaccess;
	}

	public String getSfimagesave() {
		return this.sfimagesave;
	}

	public void setSfimagesave(String sfimagesave) {
		this.sfimagesave = sfimagesave;
	}

	public String getSfimagename() {
		return this.sfimagename;
	}

	public void setSfimagename(String sfimagename) {
		this.sfimagename = sfimagename;
	}

	public Integer getSfpicid() {
		return this.sfpicid;
	}

	public void setSfpicid(Integer sfpicid) {
		this.sfpicid = sfpicid;
	}

	public String getSfa() {
		return this.sfa;
	}

	public void setSfa(String sfa) {
		this.sfa = sfa;
	}

	public String getSfb() {
		return this.sfb;
	}

	public void setSfb(String sfb) {
		this.sfb = sfb;
	}

	public String getSfc() {
		return this.sfc;
	}

	public void setSfc(String sfc) {
		this.sfc = sfc;
	}

}
