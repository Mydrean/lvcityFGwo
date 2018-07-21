package com.neuedu.lvcity.service.impl;


import java.sql.Connection;
import java.util.List;





import com.neuedu.lvcity.common.DBUtils;
import com.neuedu.lvcity.common.ServiceException;
import com.neuedu.lvcity.dao.IndexDao;
import com.neuedu.lvcity.dao.impl.IndexDaoImpl;
import com.neuedu.lvcity.model.Article;
import com.neuedu.lvcity.model.Banar;
import com.neuedu.lvcity.model.Food;
import com.neuedu.lvcity.model.Scenic;
import com.neuedu.lvcity.service.IndexService;

public class IndexServiceImpl implements IndexService{
	/**
	 * 用户service类实例
	 */
	private static IndexService instance = new IndexServiceImpl();
	/**
	 * 构造方法
	 */
	private IndexServiceImpl(){
		
	}
	/**
	 * 取得用户service实例
	 * @return 实例对象
	 */
	public static IndexService getInstance(){		
		return instance;
	}
	
	/**
	 * 广告大图
	 */
	@Override
	public List<Banar> findBanar() {
		Connection conn = null;
		List<Banar> banars =null;
		try{
		conn=DBUtils.getConnection();
		IndexDao indexDao =new IndexDaoImpl(conn);
		banars=indexDao.findBanar();
		}catch (Exception e){
			throw new ServiceException("查询所有banar出错",e);
		}finally{
			DBUtils.closeConnection(conn);
		}
		return banars;
		
	}

	@Override
	public List<Article> findIndexArticle() {
		Connection conn = null;
		List<Article> article =null;
		try{
		conn=DBUtils.getConnection();
		IndexDao indexDao =new IndexDaoImpl(conn);
		article=indexDao.findIndexArticle();
		}catch (Exception e){
			throw new ServiceException("查询所有article出错",e);
		}finally{
			DBUtils.closeConnection(conn);
		}
		return article;
	}

	@Override
	public List<Scenic> findIndexScenic() {
		Connection conn = null;
		List<Scenic> scenic =null;
		try{
		conn=DBUtils.getConnection();
		IndexDao indexDao =new IndexDaoImpl(conn);
		scenic=indexDao.findIndexScenic();
		}catch (Exception e){
			throw new ServiceException("查询所有scenic出错",e);
		}finally{
			DBUtils.closeConnection(conn);
		}
		return scenic;
	}

	@Override
	public List<Food> findIndexFood() {
		Connection conn = null;
		List<Food> food =null;
		try{
		conn=DBUtils.getConnection();
		IndexDao indexDao =new IndexDaoImpl(conn);
		food=indexDao.findIndexFood();				
		}catch (Exception e){
			throw new ServiceException("查询所有food出错",e);
		}finally{
			DBUtils.closeConnection(conn);
		}
		return food;
	}
	

}
