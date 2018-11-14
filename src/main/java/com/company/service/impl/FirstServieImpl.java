package com.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.FirstDao;
import com.company.service.FirstService;
import com.company.vo.FirstVO;
@Service
public class FirstServieImpl implements FirstService{
	@Autowired FirstDao dao;

	@Override
	public FirstVO getValue() {
		return dao.getValue();
	}

}
