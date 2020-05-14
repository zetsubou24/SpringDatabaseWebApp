package com.akhil.springdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.akhil.springdemo.entity.Customer;

@Controller
public class OriginController {

	@GetMapping("/")
	public String getOriginPage() {

		return "origin";
	}
}
