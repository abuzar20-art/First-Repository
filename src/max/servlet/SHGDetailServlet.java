package max.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import max.bean.SGHMemberBEan;
import max.bean.SHGBean;
import max.bo.SHGDetailBO;

/**
 * Servlet implementation class SHGDetailServlet
 */
@WebServlet("/SHGDetailServlet")
public class SHGDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi");
		PrintWriter out = response.getWriter();
		String gname = request.getParameter("gname");
		String createdDate = request.getParameter("createdDate");
		String accountNo = request.getParameter("accountNo");
		String stateCode = request.getParameter("stateCode");
		String[] cname = request.getParameterValues("cname");
		String[] age = request.getParameterValues("age");
		String[] cadhar = request.getParameterValues("cadhar");
		System.out.println("in"+gname);
		
		SHGBean sHGBean=new SHGBean();
		sHGBean.setGname(gname);
		sHGBean.setCreatedDate(createdDate);
		sHGBean.setAccountNo(accountNo);
		sHGBean.setStateCode(stateCode);
		
		SGHMemberBEan sGHMemberBEan=	new SGHMemberBEan();
		sGHMemberBEan.setAge(age);
		sGHMemberBEan.setCadhar(cadhar);
		sGHMemberBEan.setCname(cname);
		
		SHGDetailBO sHGDetailBO=new SHGDetailBO();
		  if(sHGDetailBO.getSHGDetails(sHGBean, sGHMemberBEan))
		  {
			  out.println("successful inserted");
		  }
		  else
		  {
			 out.println("fail");
		  }
	}

}
