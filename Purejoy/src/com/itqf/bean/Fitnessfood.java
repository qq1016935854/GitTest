package com.itqf.bean;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Fitnessfood {
	private final static Logger LOG = LogManager.getLogger(Fitnessfood.class);

	private Integer id;
	private String fitnessfood_name;
	private String fitnessfood_type;
	private Double fitnessfood_price;
	private String fitnessfood_img;
	private String fitnessfood_cycle;
	private String fitnessfood_description;
	private Integer fitnessfood_count;
	private String fitnessfood_status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFitnessfood_name() {
		return fitnessfood_name;
	}

	public void setFitnessfood_name(String fitnessfood_name) {
		this.fitnessfood_name = fitnessfood_name;
	}

	public String getFitnessfood_type() {
		return fitnessfood_type;
	}

	public void setFitnessfood_type(String fitnessfood_type) {
		this.fitnessfood_type = fitnessfood_type;
	}

	public Double getFitnessfood_price() {
		return fitnessfood_price;
	}

	public void setFitnessfood_price(Double fitnessfood_price) {
		this.fitnessfood_price = fitnessfood_price;
	}

	public String getFitnessfood_img() {
		return fitnessfood_img;
	}

	public void setFitnessfood_img(String fitnessfood_img) {
		this.fitnessfood_img = fitnessfood_img;
	}

	public String getFitnessfood_cycle() {
		return fitnessfood_cycle;
	}

	public void setFitnessfood_cycle(String fitnessfood_cycle) {
		this.fitnessfood_cycle = fitnessfood_cycle;
	}

	public String getFitnessfood_description() {
		return fitnessfood_description;
	}

	public void setFitnessfood_description(String fitnessfood_description) {
		this.fitnessfood_description = fitnessfood_description;
	}

	public Integer getFitnessfood_count() {
		return fitnessfood_count;
	}

	public void setFitnessfood_count(Integer fitnessfood_count) {
		this.fitnessfood_count = fitnessfood_count;
	}

	public String getFitnessfood_status() {
		return fitnessfood_status;
	}

	public void setFitnessfood_status(String fitnessfood_status) {
		this.fitnessfood_status = fitnessfood_status;
	}

}
