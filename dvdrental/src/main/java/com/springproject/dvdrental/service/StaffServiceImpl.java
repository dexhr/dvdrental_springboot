package com.springproject.dvdrental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Staff;
import com.springproject.dvdrental.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService{
	
	@Autowired
	private StaffRepository staffRepository;
	
	@Override
	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		return staffRepository.findAll();
	}

	@Override
	public Staff saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		return staffRepository.save(staff);
	}

	@Override
	public Staff getStaffById(int id) {
		// TODO Auto-generated method stub
		Optional<Staff> optional = staffRepository.findById(id);
		Staff staff = null;
		if(optional.isPresent()) {
			staff = optional.get();
		}
		return staff;
	}

	@Override
	public void deleteStaff(int id) {
		// TODO Auto-generated method stub
		staffRepository.delete(getStaffById(id));
	}

}
