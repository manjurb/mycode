package com.css.corp.epmo.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.css.corp.epmo.project.dao.ListDao;
import com.css.corp.epmo.project.dto.ViewList;

@Service("listService")
public class ListService {
	
	@Autowired
	ListDao listDao;
	
	@Transactional
	public List<ViewList> getAllList() {
		return listDao.getAllList();
	}
	
	@Transactional
	public ViewList getList(int id) {
		return listDao.getList(id);
	}
	
	@Transactional
	public void updateCustomer(ViewList viewList) {
		listDao.updateCustomer(viewList);
	}
	
	@Transactional
	public void addStatus(ViewList viewList) {
		listDao.addStatus(viewList);
	}
	
	

}
