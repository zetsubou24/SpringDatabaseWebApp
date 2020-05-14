package com.akhil.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.akhil.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> query = currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> customers = query.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		Customer customer = session.get(Customer.class, id);
		
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
Session session = sessionFactory.getCurrentSession();
		
		Customer customer = session.get(Customer.class, id);
		
		session.delete(customer);
	}

}
