package com.css.corp.epmo.project.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.css.corp.epmo.project.dto.ViewList;

@Repository
public class ListDaoImpl implements ListDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ViewList> getAllList() {
		Session session = this.sessionFactory.getCurrentSession();
		List<ViewList>  viewList = session.createQuery("from ViewList").list();
		return viewList;
	}

	@Override
	public ViewList getList(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		ViewList viewList = (ViewList) session.get(ViewList.class, id);
		return viewList;
	}

	@Override
	public void updateCustomer(ViewList viewList) {
		Session session = this.sessionFactory.getCurrentSession();
		Hibernate.initialize(viewList);
		session.update(viewList);
		
	}

	@Override
	public ViewList addStatus(ViewList viewList) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(viewList);
		return viewList;
	}
	@Override
	public ViewList updateStatus(ViewList viewList) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(viewList);
		return viewList;
	}

}
