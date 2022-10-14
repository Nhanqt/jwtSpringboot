package com.javainuse.controller;

import com.javainuse.dto.request.JwtRequest;
import com.javainuse.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

	@Autowired
	ResponseHandler responseHandler;

	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}


	@GetMapping("/getInformation")
	public ResponseEntity getProfile(@RequestBody JwtRequest jwtRequest){
		return responseHandler.response(200, "Get information success", jwtRequest);
	}

	@RequestMapping({ "/goodbye" })
	public String goodBye() {
		return "Goodbye World";
	}

}
