//package com.example.service.bean;
//
//import com.example.dao.CounterDao;
//import org.springframework.beans.factory.annotation.Autowired;
//
//
//
//public class CounterServiceBean implements CounterService {
//
//
//	@Autowired
//	private CounterDao counterDao;
//
//	public CounterDao getCounterDao() {
//		return counterDao;
//	}
//
//	public void setCounterDao(CounterDao counterDao) {
//		this.counterDao = counterDao;
//	}
//
//	@Override
//	public int getCustNum() throws Exception {
//		// TODO Auto-generated method stub
//		return counterDao.getNum("cust_num");
//	}
//
//	@Override
//	public int getUserNum() throws Exception {
//		// TODO Auto-generated method stub
//		return counterDao.getNum("user_num");
//	}
//
//	@Override
//	public void updateCustNum(int num) throws Exception {
//		// TODO Auto-generated method stub
//		counterDao.updateNum("cust_num", num);
//	}
//
//	@Override
//	public void updateUserNum(int num) throws Exception {
//		// TODO Auto-generated method stub
//		counterDao.updateNum("user_num", num);
//	}
//
//}
