package com.eureka.image.main.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.image.main.entity.Image;


@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private Environment env; 
	
	
	@RequestMapping("/")
	public String home() {
		return null;
		//This is useful for debugging
	}
	
	@RequestMapping("/images")
	public List<Image> getImages(){
		List<Image> images = Arrays.asList(
			new Image(1, "Tree of Horse", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"), 
			new Image(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272 "), 
			new Image(3, "The Flower", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112")
				);
		return images;	
	}
}
