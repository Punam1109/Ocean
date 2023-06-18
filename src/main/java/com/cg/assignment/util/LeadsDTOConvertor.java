package com.cg.assignment.util;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.cg.assignment.dto.LeadsDTO;
import com.cg.assignment.dto.LeadsResponseDTO;
import com.cg.assignment.entity.Leads;

@Component
public class LeadsDTOConvertor {
	
	public LeadsResponseDTO convertTo(Leads leads) {
		LeadsResponseDTO dto = new LeadsResponseDTO();
		dto.setId(leads.getId());
		dto.setFirstName(leads.getFirstName());
		dto.setLastName(leads.getLastName());
	    dto.setPhoneNumber(leads.getPhoneNumber());
	    dto.setEmail(leads.getEmail());
		dto.setDob(leads.getDob());
		dto.setPincode(leads.getPincode());
		dto.setGender(leads.getGender());
		dto.setSmoker(leads.getSmoker());
		dto.setAlcoholic(leads.getAlcoholic());
		dto.setAddress(leads.getAddress());
		dto.setDependant(leads.getDependant());
		dto.setAnnualIncome(leads.getAnnualIncome());
		dto.setGovRebate(leads.getGovRebate());
		dto.setTaxRebate(leads.getTaxRebate());
		dto.setIdProof(leads.getIdProof());
		dto.setFinancialProof(leads.getFinancialProof());
		dto.setQuotationRef(leads.getQuotationRef());
		dto.setPremium(leads.getPremium());
		dto.setProduct(leads.getProduct());
		dto.setSum(leads.getSum());
		dto.setLeadStage(leads.getLeadStage());
		dto.setContacted(leads.getContacted());


		dto.setMsg("Lead Saved");
		return dto;
	}
	
	public LeadsDTO getLeadsDTO(Leads leads) {
		
		return new LeadsDTO(leads.getId(),leads.getFirstName(), leads.getLastName(), leads.getPhoneNumber(), leads.getEmail(), leads.getDob(), leads.getPincode(),
				leads.getGender(), leads.getSmoker(), leads.getAlcoholic(), leads.getAddress(), leads.getDependant(), leads.getAnnualIncome(),
				leads.getGovRebate(), leads.getTaxRebate(), leads.getIdProof(), leads.getFinancialProof(), leads.getQuotationRef(), leads.getPremium(),
				leads.getProduct(), leads.getSum(), leads.getLeadStage(), leads.getContacted());
	}



}
