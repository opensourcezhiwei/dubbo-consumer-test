package com.ds.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.common.rpc.TransferService;

@RestController
public class TransferController {

	@Resource(name = "transferService")
	private TransferService transferService;

	@RequestMapping("/transfer")
	public String transfer(String name) {
		return transferService.transfer(name);
	}

}
