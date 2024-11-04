package org.bookbug.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() { return "index"; }
	
	@RequestMapping(value = "/support", method = RequestMethod.GET)
	public String support() { return "support"; }
	
	@RequestMapping(value = "/ebook", method = RequestMethod.GET)
	public String ebook() { return "ebook"; }
	
	@RequestMapping(value = "/culture", method = RequestMethod.GET)
	public String culture() { return "culture"; }
	
	
	
}



















