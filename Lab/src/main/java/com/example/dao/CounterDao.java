package com.example.dao;

public interface CounterDao {
	public int getNum(String type) throws Exception;
	public void updateNum(String type, int num) throws Exception;
}
