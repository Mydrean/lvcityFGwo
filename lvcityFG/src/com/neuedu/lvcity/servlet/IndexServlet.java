package com.neuedu.lvcity.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.lvcity.model.Article;
import com.neuedu.lvcity.model.Banar;
import com.neuedu.lvcity.model.Food;
import com.neuedu.lvcity.model.Scenic;
import com.neuedu.lvcity.service.IndexService;
import com.neuedu.lvcity.service.impl.IndexServiceImpl;

public class IndexServlet extends HttpServlet{
		
	public IndexServlet(){
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().append("Served at:").append(req.getContextPath());	
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession se=req.getSession();
		
		IndexService indexService =IndexServiceImpl.getInstance();
		List<Banar> banarList=indexService.findBanar(); 
		se.setAttribute("banarList", banarList);
		
		List<Article> articleList=indexService.findIndexArticle();
		se.setAttribute("articleList", articleList);
		
		List<Scenic> scenicList=indexService.findIndexScenic();
		se.setAttribute("scenicList", scenicList);
		
		List<Food> foodList=indexService.findIndexFood();				
		se.setAttribute("foodList", foodList);
		
		resp.sendRedirect(req.getContextPath()+"/User/index.jsp");
	}
	
}
