package com.example.blogtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //스프링이 com.example.blog패키지 이하를 스캔해서
//특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IOC)스프링컨테이너에 관리
public class Blog_Controller_Test {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello</h1>";
	}
}
