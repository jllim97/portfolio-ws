package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.PortfolioBean;
import com.example.demo.entities.PortfolioModel;
import com.example.demo.repository.PortfolioRepository;
import com.example.demo.repository.ResponseModel;
import com.example.demo.service.PortfolioService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/portfolio")
@RequiredArgsConstructor
@Slf4j
public class PortfolioController {
	
	@Autowired
	private PortfolioService portfolioService;
	
	@GetMapping("/all")
	public ResponseModel<List<PortfolioBean>> findAll() {
		List<PortfolioBean> portfolioBeans = portfolioService.findAll();		
		return new ResponseModel<List<PortfolioBean>>().success(portfolioBeans);
	}
	
	@PostMapping("/create")
	public ResponseModel<String> addPortfolio(@RequestBody PortfolioModel portfolioModel) {
		PortfolioBean portfolioBean = new PortfolioBean(portfolioModel);
		portfolioService.add(portfolioBean);
		return new ResponseModel<String>().success("portfolio added");
	}
}
