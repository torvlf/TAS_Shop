package shopping.mall.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopping.common.controller.SuperClass;

public class MallCalculateController extends SuperClass {
	@Override
	   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      super.doGet(request, response);
	      
	      String id = request.getParameter("id") ;
	      int no = Integer.parseInt(request.getParameter("no")) ;
	      
	    
	      request.setAttribute("bean", null);
	      
	      
	      String gotopage = "/mall/shopList.jsp" ;
	      super.GotoPage(gotopage);
	   }   
	   @Override
	   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      super.doPost(request, response);
	   }
}
