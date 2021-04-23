package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dalyIncome;
	private Integer days;
	
	public Payment() {
		
	}

	public Payment(String name, Double dalyIncome, Integer days) {
		this.name = name;
		this.dalyIncome = dalyIncome;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDalyIncome() {
		return dalyIncome;
	}

	public void setDalyIncome(Double dalyIncome) {
		this.dalyIncome = dalyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days * dalyIncome;
	}
	
}
