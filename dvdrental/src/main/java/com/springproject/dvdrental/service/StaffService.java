package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Staff;

public interface StaffService {
	List<Staff> getAllStaff();
	Staff saveStaff(Staff staff);
	Staff getStaffById(int id);
	void deleteStaff(int id);
}
