package com.telusko;

import java.sql.SQLException;
import java.util.List;

public class PersonalService {
	public void addPersonalService(Personal p) throws Exception {
		PersonalDao dao = new PersonalDao();
		dao.addPersonalDao(p);
		System.out.println("personal service started  " + p.getfirstname());
	}

	public Personal getPersonalInfo(String fname) throws SQLException {
		PersonalDao d = new PersonalDao();
		return d.getPersonalDao(fname);
	}

	public List<Personal> getAll() {
		// TODO Auto-generated method stub
		return new PersonalDao().getAllDao();
	}
}
