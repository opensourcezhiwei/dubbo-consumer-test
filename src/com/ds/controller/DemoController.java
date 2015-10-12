package com.ds.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.common.rpc.DubboDemo;

@RestController
public class DemoController {

	@Resource(name = "dubboDemo")
	private DubboDemo dubboDemo;

	@RequestMapping("/dubbo")
	public String dubboDemo() {
		long start = System.currentTimeMillis();
		String sayHello = dubboDemo.sayHello("philippines");
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms : " + sayHello);
		return sayHello;
	}

}
