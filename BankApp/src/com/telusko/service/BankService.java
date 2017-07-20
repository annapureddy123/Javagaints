package com.telusko.service;

import com.telusko.BankInfo;
import com.telusko.dao.BankDao;

public class BankService
{

		public void getBankService(BankInfo b) throws Exception
		{
			BankDao dao=new BankDao();
			dao.getBankDao(b);
		}

	

}
