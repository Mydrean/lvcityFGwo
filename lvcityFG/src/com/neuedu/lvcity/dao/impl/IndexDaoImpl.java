package com.neuedu.lvcity.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.lvcity.common.DBUtils;
import com.neuedu.lvcity.dao.IndexDao;
import com.neuedu.lvcity.model.Article;
import com.neuedu.lvcity.model.Banar;
import com.neuedu.lvcity.model.Food;
import com.neuedu.lvcity.model.Scenic;

public class IndexDaoImpl implements  IndexDao{

	/**
	 * 数据库连接
	 */
	private Connection conn;
	
	/**
	 * 构造方法
	 * @param conn 数据库连接
	 */
	public IndexDaoImpl(Connection conn){
		this.conn=conn;
	}
	
	@Override
	public List<Banar> findBanar() {
		List<Banar> list=new ArrayList<Banar>();
		ResultSet rs=null;
		PreparedStatement pstam=null;
		try{
			pstam = conn.prepareStatement("select * from banar");		
			rs=pstam.executeQuery();
			while(rs.next()){  //处理结果集
				Banar banar=new Banar();
				banar.setBanarid(rs.getInt("banarid"));
				banar.setImage(rs.getString("image"));
				banar.setState(rs.getInt("state"));
				list.add(banar);
			}			
		} catch (SQLException e) {
			System.out.println("在查询广告大图的时候出错了，错误信息是："+e.getMessage());			
			//将异常封装成自定义异常
		}finally{
			//调用数据库工具类，关闭结果集对象和声明对象
			DBUtils.closeStatement(rs, pstam);
		}
		return list;
	}

	@Override
	public List<Article> findIndexArticle() {
		List<Article> list=new ArrayList<Article>();
		ResultSet rs=null;
		PreparedStatement pstam=null;
		try{
			pstam = conn.prepareStatement("select aid,content,image,articlename from article where atid=1 ORDER BY aid desc limit 3");		
			rs=pstam.executeQuery();
			while(rs.next()){  //处理结果集
				Article article=new Article();
				article.setAid(rs.getInt("aid"));
				article.setContent(rs.getString("content"));
				article.setImage(rs.getString("image"));
				article.setArticlename(rs.getString("articlename"));
				list.add(article);
			}			
		} catch (SQLException e) {
			System.out.println("在查询首页文章的时候出错了，错误信息是："+e.getMessage());			
			//将异常封装成自定义异常
		}finally{
			//调用数据库工具类，关闭结果集对象和声明对象
			DBUtils.closeStatement(rs, pstam);
		}
		return list;
	}

	@Override
	public List<Scenic> findIndexScenic() {
		List<Scenic> list=new ArrayList<Scenic>();
		ResultSet rs=null;
		PreparedStatement pstam=null;
		try{
			pstam = conn.prepareStatement("select * from scenic where sid>ROUND((RAND()*(select max(sid) from scenic where lx='景点'))-3.5,0) LIMIT 7");		
			rs=pstam.executeQuery();
			while(rs.next()){  //处理结果集
				Scenic scenic=new Scenic();
				scenic.setSid(rs.getInt("sid"));
				scenic.setStid(rs.getInt("stid"));
				scenic.setSname(rs.getString("sname"));
				scenic.setImage(rs.getString("image"));
				scenic.setAid(rs.getInt("aid"));				
				scenic.setLx(rs.getString("lx"));
				list.add(scenic);
			}			
		} catch (SQLException e) {
			System.out.println("在查询首页风景图片的时候出错了，错误信息是："+e.getMessage());			
			//将异常封装成自定义异常
		}finally{
			//调用数据库工具类，关闭结果集对象和声明对象
			DBUtils.closeStatement(rs, pstam);
		}
		return list;
	}

	@Override
	public List<Food> findIndexFood() {
		List<Food> list=new ArrayList<Food>();
		ResultSet rs=null;
		PreparedStatement pstam=null;
		try{
			pstam = conn.prepareStatement("select fid,fname,aid,image from  food order by fid desc limit 6"); 	
			rs=pstam.executeQuery();
			while(rs.next()){  //处理结果集
				Food food=new Food();
				food.setFid(rs.getInt("fid"));
				food.setFname(rs.getString("fname"));
				food.setAid(rs.getInt("aid"));
				food.setImage(rs.getString("image"));
				list.add(food);
			}			
		} catch (SQLException e) {
			System.out.println("在查询首页美食图片的时候出错了，错误信息是："+e.getMessage());			
			//将异常封装成自定义异常
		}finally{
			//调用数据库工具类，关闭结果集对象和声明对象
			DBUtils.closeStatement(rs, pstam);
		}
		return list;
	}

}
