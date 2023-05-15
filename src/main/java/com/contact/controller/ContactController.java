package com.contact.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.dao.ContactRepository;
import com.contact.entity.Contact;

@RestController
public class ContactController {
	Logger logger = LoggerFactory.getLogger(ContactController.class);

	@Autowired
	private ContactRepository contactRepository;

	@PostMapping("/contacts")
	public String createContact(@RequestBody Contact contact) {
		this.contactRepository.save(contact);
		logger.info("Contact Created");
		return "contact saved";
	}

	@GetMapping("/contacts")
	public List<Contact> getall() {
		return this.contactRepository.findAll();
	}

	@GetMapping("/contacts/{zip}")
	public List<Contact> getContactByZipcode(@PathVariable String zip) {
		return this.contactRepository.findByZipcode(zip);
	}

}
