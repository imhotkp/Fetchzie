package com.contact.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.contact.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

	@Query("select u from Contact u where u.address.zipCode=:zipcode")
	public List<Contact> findByZipcode(@Param("zipcode") String zipcode);

}
