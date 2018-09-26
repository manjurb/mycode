package com.css.corp.epmo.project.dao;

import java.util.List;

import com.css.corp.epmo.project.dto.ViewList;


public interface ListDao {
	
	public List<ViewList> getAllList();
	public ViewList getList(int id);
	public void updateCustomer(ViewList viewList) ;
	public ViewList addStatus(ViewList viewList);
	public ViewList updateStatus(ViewList viewList);
	

}
