package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.PortfolioBean;
import com.example.demo.repository.PortfolioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PortfolioServiceImpl implements PortfolioService {

	@Autowired
	private PortfolioRepository portfolioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<PortfolioBean> findAll() {
		// TODO Auto-generated method stub
		return portfolioRepository.findAll();
	}

	@Override
	public void add(PortfolioBean portfolioBean) {
		// TODO Auto-generated method stub
		portfolioRepository.saveAndFlush(portfolioBean);
	}

}
