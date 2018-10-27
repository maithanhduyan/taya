package com.taya.production.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taya.production.dao.FooDao;
import com.taya.production.model.Foo;
import com.taya.production.service.FooService;
import com.taya.utils.StringUtil;

@RestController
public class FooRestController {
	
	@SuppressWarnings(StringUtil.UNUSED)
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FooService fooService;
	
	@SuppressWarnings(StringUtil.UNUSED)
	@Autowired
	private FooDao fooDao;
	
	@RequestMapping(value = "/api/foo/getAll",
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Foo> getAll(){
		return fooService.getAll();
	}
	
	@RequestMapping(value="/api/foo", 
			method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE})
	  @ResponseBody
	  public String index() {
	    
	    // Log a simple message
	    log.debug("debug level log");
	    log.info("info level log");
	    log.error("error level log");
	    
	    // Log a formatted string with parameters
	    log.info("another info log with {}, {} and {} arguments", 1, "2", 3.0);
	    
	    return "i'm foo";
	  }

	 @RequestMapping(value = "/api/foo/{fooId}", 
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, 
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Foo getFoo(@PathVariable("fooId") Long fooId) {
	        return null;
	    }
}
