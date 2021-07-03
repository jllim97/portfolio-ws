package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PORTFOLIO")
public class PortfolioBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8554058658403672762L;
	public static final String ID = "ID";
	public static final String PORTFOLIO_NAME = "PORTFOLIO_NAME";
	public static final String PORTFOLIO_GITHUB_LINK = "PORTFOLIO_GITHUB_LINK";
	public static final String PORTFOLIO_URL = "PORTFOLIO_URL";
	public static final String PORTFOLIO_DESCRIPTION = "PORTFOLIO_DESCRIPTION";
	public static final String PORTFOLIO_STATUS = "PORTFOLIO_STATUS";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ID)
	private Long id;
	
	@Column(name = PORTFOLIO_NAME)
	private String portfolioName;
	
	@Column(name = PORTFOLIO_GITHUB_LINK)
	private String portfolioGithubLink;
	
	@Column(name = PORTFOLIO_URL)
	private String portfolioUrl;
	
	@Column(name = PORTFOLIO_DESCRIPTION)
	private String portfolioDescription;
	
	@Column(name = PORTFOLIO_STATUS)
	private String portfolioStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	public String getPortfolioGithubLink() {
		return portfolioGithubLink;
	}

	public void setPortfolioGithubLink(String portfolioGithubLink) {
		this.portfolioGithubLink = portfolioGithubLink;
	}

	public String getPortfolioUrl() {
		return portfolioUrl;
	}

	public void setPortfolioUrl(String portfolioUrl) {
		this.portfolioUrl = portfolioUrl;
	}

	public String getPortfolioDescription() {
		return portfolioDescription;
	}

	public void setPortfolioDescription(String portfolioDescription) {
		this.portfolioDescription = portfolioDescription;
	}
	
	public PortfolioBean(PortfolioModel portfolioModel) {
		this.portfolioName = portfolioModel.portfolioName();
		this.portfolioDescription = portfolioModel.portfolioDescription();
		this.portfolioGithubLink = portfolioModel.portfolioGithubLink();
		this.portfolioUrl = portfolioModel.portfolioUrl();
	}
	
	public PortfolioBean() {}
}
