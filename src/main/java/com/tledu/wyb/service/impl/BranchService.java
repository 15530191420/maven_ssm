package com.tledu.wyb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tledu.wyb.dao.IBranchDao;
import com.tledu.wyb.model.Branch;
import com.tledu.wyb.service.IBranchService;

@Service
public class BranchService implements IBranchService {
	@Autowired
	private IBranchDao branchDao;
	
	@Override
	public List<Branch> list() {
		return branchDao.list();
	}
}
