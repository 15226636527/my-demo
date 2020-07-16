package sq.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;
import sq.entity.Community;
import sq.service.CommunityService;

/**
 * 社区控制层
 * @author admin
 *
 */
public class CommunityAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private CommunityService communityService;//社区业务层接口
	public void setCommunityService(CommunityService communityService) {
		this.communityService = communityService;
	}
	private Community community;//社区实体	
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}




	/**
	 * 添加社区
	 * @return
	 */
	public String addCom(){
		//HttpServletRequest request = ServletActionContext.getRequest(); 
		String msg = "success";	
		communityService.addCom(community);
		return msg;
	}
	
	/**
	 * ajax添加社区
	 */
	public void ajaxAddCom(){
		//HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();  
		response.setCharacterEncoding("UTF-8");  
		response.setContentType("text/html; charset=utf-8"); 
		PrintWriter out;
		String msg = "";
		
		communityService.addCom(community);//保存社区
		msg = "success";
		try {
			out = response.getWriter();
			JSONObject json = new JSONObject();  
			json.accumulate("msg", msg);  
			out.println(json.toString()); 
			out.flush();  
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	
	
	/**
	 * 进入首页
	 * @return
	 */
	public String goIndex() {
		String msg = "success";	
		return msg;
	}
	/**
	 * 查询全部社区
	 * @return
	 */
	public String getAllCom() {
		HttpServletRequest request = ServletActionContext.getRequest(); 
		String msg = "success";	
		List<Community> comList = communityService.findAllCom();
		request.setAttribute("comList", comList);
		return msg;
	}
	/**
	 *  ajax查询全部社区
	 */
	public void ajaxGetAllCom(){
		HttpServletResponse response = ServletActionContext.getResponse(); 
		//HttpServletRequest request = ServletActionContext.getRequest(); 
		response.setCharacterEncoding("UTF-8");  
		response.setContentType("text/html; charset=utf-8"); 
		PrintWriter out;
		String msg = "success";		
		List<Community> comList = communityService.findAllCom();		
		try {
			out = response.getWriter();
			JSONObject json = new JSONObject();  
			json.accumulate("msg", msg);  
			json.accumulate("comList", comList);  
			out.println(json.toString()); 
			out.flush();  
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	
}
