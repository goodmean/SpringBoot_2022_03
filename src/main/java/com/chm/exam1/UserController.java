package com.chm.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {
	@RequestMapping("")
	@ResponseBody
	public String users(){
		return "유저 여러명";
	}

	@RequestMapping("1")
	@ResponseBody
	public String user(){
		return "유저 한명";
	}
}
