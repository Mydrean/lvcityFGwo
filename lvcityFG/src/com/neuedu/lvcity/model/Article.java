package com.neuedu.lvcity.model;

import java.util.Date;

import junit.framework.Test;

public class Article {
	private int aid;
	private int atid;
	private int publisher;
	private Date releasetime;
	private String content;
	private String image;
	private String articlename;
	
	public Article(){
		super();
	}
	public Article(int aid,int atid,int publisher,Date releasetime,String content,String image,String articlename){
		super();
		this.aid=aid;
		this.atid=atid;
		this.publisher=publisher;
		this.releasetime=releasetime;
		this.content=content;
		this.image=image;
		this.articlename=articlename;
	}
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getAtid() {
		return atid;
	}
	public void setAtid(int atid) {
		this.atid = atid;
	}
	public int getPublisher() {
		return publisher;
	}
	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}
	public Date getReleasetime() {
		return releasetime;
	}
	public void setReleasetime(Date releasetime) {
		this.releasetime = releasetime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getArticlename() {
		return articlename;
	}
	public void setArticlename(String articlename) {
		this.articlename = articlename;
	}

}
