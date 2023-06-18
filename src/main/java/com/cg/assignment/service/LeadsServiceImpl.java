package com.cg.assignment.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.assignment.entity.Leads;
import com.cg.assignment.repository.ILeadsRepository;

@Service
public class LeadsServiceImpl implements ILeadsService{
	
	@Autowired
	ILeadsRepository leadsRepository;

	@Override
	public Leads addLead(Leads leads) throws Exception {

			return leadsRepository.save(leads);
	}

	@Override
	public List<Leads> getAllLeads() {
		// TODO Auto-generated method stub
		return leadsRepository.findAll();
	}

	
	@Override
	public List<Leads> getLeadsByProduct(String product) {
		// TODO Auto-generated method stub
		List<Leads> allLeads = leadsRepository.findAll();
		List<Leads> requiredLeads = new ArrayList<>();
		for (Leads obj : allLeads) {
		if (obj.getProduct().equalsIgnoreCase(product)) {
			requiredLeads.add(obj);
		}
		}
		return requiredLeads;

	}

	@Override
	public List<Leads> getLeadsByContact(String contacted) {
		// TODO Auto-generated method stub
		List<Leads> allLeads = leadsRepository.findAll();
		List<Leads> requiredLeads = new ArrayList<>();
		for (Leads obj : allLeads) {
		if (obj.getContacted().equalsIgnoreCase(contacted)) {
			requiredLeads.add(obj);
		}
		}
		return requiredLeads;

	}

}
