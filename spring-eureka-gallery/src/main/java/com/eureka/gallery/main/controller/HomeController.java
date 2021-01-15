package com.eureka.gallery.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.eureka.gallery.main.entity.Gallery;

public class HomeController {
	@Autowired
	private RestTemplate restTemplate; 
	
	@Autowired
	private Environment env; 
	
	@RequestMapping("/")
	public String home () {
		//
		return null; 
	}
	
	@RequestMapping("/{id}")
	public Gallery getGallery(@PathVariable final int id) {
		
		// create gallery object 
		Gallery gallery = new Gallery();
		gallery.setId(id);
		
		// get list of available images
		List<Object> images = restTemplate.getForObject("http://image-service/images/", List.class);
		gallery.setImages(images);
		
		return gallery;
	}
	
	
	// Admin area
	// This method should only be accessed by users with role of 'admin'
	public String homeAdmin() {
		return "This is the admin area of Gallery service running at port: " + env.getProperty("local.server.port");
		
	}
}
