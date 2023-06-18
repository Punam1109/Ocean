package com.cg.assignment.controller;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.assignment.dto.LeadsDTO;
import com.cg.assignment.entity.Leads;
import com.cg.assignment.service.ILeadsService;
import com.cg.assignment.util.LeadsDTOConvertor;

@RestController
@RequestMapping("/leads")
@CrossOrigin(origins = {"http://localhost:4200","htttp://localhost:9090"},allowedHeaders = "*")

public class LeadsController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ILeadsService leadsService;
	
	@Autowired
	private LeadsDTOConvertor leadsDTOConvertor;

	
	public LeadsController() {

		System.err.println("-------------------------LeadsController Controller Called--------------------------");
	}
	
	@PostMapping("/addlead")
	public ResponseEntity<Leads> addLead(@RequestBody Leads leads) throws Exception {
		return new ResponseEntity<Leads>(leadsService.addLead(leads), HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<LeadsDTO>> getAllLeadsDTO() {
		List<Leads> allLeads = leadsService.getAllLeads();
		List<LeadsDTO> allLeadsDTO = new ArrayList<>();
		for (Leads leads : allLeads) {
			allLeadsDTO.add(leadsDTOConvertor.getLeadsDTO(leads));
		}
		return new ResponseEntity<List<LeadsDTO>>(allLeadsDTO, HttpStatus.OK);

	}
	
	@GetMapping("/product/{product}")
	public ResponseEntity<List<LeadsDTO>> getLeadsByProduct(@PathVariable String product) {
		List<Leads> allLeads = leadsService.getLeadsByProduct(product);
		List<LeadsDTO> allLeadsDTO = new ArrayList<>();

		for (Leads leads : allLeads) 
			allLeadsDTO.add(leadsDTOConvertor.getLeadsDTO(leads));
				return new ResponseEntity<List<LeadsDTO>>(allLeadsDTO, HttpStatus.OK);
		
	}

	@GetMapping("/contact/{contacted}")
	public ResponseEntity<List<LeadsDTO>> getLeadsByContact(@PathVariable String contacted) {
		List<Leads> allLeads = leadsService.getLeadsByContact(contacted);
		List<LeadsDTO> allLeadsDTO = new ArrayList<>();

		for (Leads leads : allLeads) 
			allLeadsDTO.add(leadsDTOConvertor.getLeadsDTO(leads));
				return new ResponseEntity<List<LeadsDTO>>(allLeadsDTO, HttpStatus.OK);
		
	}


}
