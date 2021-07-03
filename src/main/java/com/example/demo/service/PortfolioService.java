package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.PortfolioBean;

public interface PortfolioService {
	List<PortfolioBean> findAll();
	void add(PortfolioBean portfolioBean);
}
