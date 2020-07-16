package sq.entity;
// Generated 2019-1-4 14:33:52 by Hibernate Tools 5.2.3.Final

/**
 * 
 */
public class Floor implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer floorid;
	private String floornum;
	private String floorname;
	private String floorinfo;
	private String floorremark;
	private String floora;
	private String floorb;
	private String floorc;
	private String floord;
	private String floore;

	public Floor() {
	}

	public Floor(String floornum, String floorname, String floorinfo, String floorremark, String floora, String floorb,
			String floorc, String floord, String floore) {
		this.floornum = floornum;
		this.floorname = floorname;
		this.floorinfo = floorinfo;
		this.floorremark = floorremark;
		this.floora = floora;
		this.floorb = floorb;
		this.floorc = floorc;
		this.floord = floord;
		this.floore = floore;
	}

	public Integer getFloorid() {
		return this.floorid;
	}

	public void setFloorid(Integer floorid) {
		this.floorid = floorid;
	}

	public String getFloornum() {
		return this.floornum;
	}

	public void setFloornum(String floornum) {
		this.floornum = floornum;
	}

	public String getFloorname() {
		return this.floorname;
	}

	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}

	public String getFloorinfo() {
		return this.floorinfo;
	}

	public void setFloorinfo(String floorinfo) {
		this.floorinfo = floorinfo;
	}

	public String getFloorremark() {
		return this.floorremark;
	}

	public void setFloorremark(String floorremark) {
		this.floorremark = floorremark;
	}

	public String getFloora() {
		return this.floora;
	}

	public void setFloora(String floora) {
		this.floora = floora;
	}

	public String getFloorb() {
		return this.floorb;
	}

	public void setFloorb(String floorb) {
		this.floorb = floorb;
	}

	public String getFloorc() {
		return this.floorc;
	}

	public void setFloorc(String floorc) {
		this.floorc = floorc;
	}

	public String getFloord() {
		return this.floord;
	}

	public void setFloord(String floord) {
		this.floord = floord;
	}

	public String getFloore() {
		return this.floore;
	}

	public void setFloore(String floore) {
		this.floore = floore;
	}

}
