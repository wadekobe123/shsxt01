package com.shsxt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shsxt.dao.AccountDao;
import com.shsxt.service.AccountService;
@Service
public class ServiceImpl implements AccountService {

	@Resource
	private  AccountDao accountDao;
	
	
	public int AccountTransfer(Integer souAid, Integer tarAid, Double money) {
		
		int result =0;
		try {
			if(accountDao.outAccount(souAid, money)>0&&accountDao.inAccount(tarAid, money)>0){
				result=1;
			}
			
			int a=1/0;
			
		} catch (Exception e) {
			result=0;
			e.printStackTrace();
			throw new RuntimeException();  // spring 只捕捉运行时异常
		}
		
		
		
		return result;
	}

}
