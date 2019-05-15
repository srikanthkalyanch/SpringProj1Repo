package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishService;

public class WishController extends AbstractController {
	private WishService service;
	
	public WishController(WishService service) {
	
		this.service = service;
	}

    @Override
	public ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		String wishmessage=null;
		
	   //calls service method
		wishmessage=service.getWishMessage();
	
		return new ModelAndView("wish","wishmsg",wishmessage);
	}

}
