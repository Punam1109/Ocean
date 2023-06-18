package com.cg.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.assignment.entity.Leads;

@Service
public interface ILeadsService {
	
	public Leads addLead(Leads leads) throws Exception;

	public List<Leads> getAllLeads();

	public List<Leads> getLeadsByProduct(String product);

	public List<Leads> getLeadsByContact(String contacted);


}
