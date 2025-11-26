package com.k7it.calci.controller;

import com.k7it.calci.service.CalciService;
import com.k7it.calci.service.impl.CalciServiceImpl;

public class CalciController {

	CalciService calciService = new CalciServiceImpl();

	public long add(int n1, int n2) {

		return calciService.add(n1, n2);

	}

	public long sub(int n1, int n2) {
		//CalciService calciService = new CalciServiceImpl();
		return calciService.sub(n1, n2);
	}

	public long mul(int n1, int n2) {
		//CalciService calciService = new CalciServiceImpl();
		return calciService.mul(n1, n2);
	}

	public long div(int n1, int n2) {
		//CalciService calciService = new CalciServiceImpl();
		return calciService.div(n1, n2);
	}

	public long mod(int n1, int n2) {
		//CalciService calciService = new CalciServiceImpl();
		return calciService.mod(n1, n2);
	}

	
