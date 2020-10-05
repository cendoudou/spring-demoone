package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @vlog:
 * @description:
 * @author: Rocky
 * @createDate: 2020/10/5 21:46
 */
@RestController
public class Hello {
	@RequestMapping("/hello")
	public String aa(){
		return "heelo world";
	}
}
