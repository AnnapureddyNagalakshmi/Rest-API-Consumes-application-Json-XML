package com.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.binding.Book;

@RestController
public class BookRestController {
	@PostMapping(value="/book",
			consumes= {"application/xml","application/json"})
	public ResponseEntity<String> addBook(@RequestBody Book book){
		System.out.println(book);
		//logic to store in DB	
		String msg="Book Added Successfully";
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
}
