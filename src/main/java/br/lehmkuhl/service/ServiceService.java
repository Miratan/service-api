package br.lehmkuhl.service;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.lehmkuhl.jooq.model.tables.Service;
import br.lehmkuhl.jooq.model.tables.records.ServiceRecord;

@Component
public class ServiceService {

	@Autowired
	private DSLContext dslContext;

	public List<String> list() {
		List<String> services = new ArrayList<>();
		
		Result<ServiceRecord> records = dslContext.selectFrom(Service.SERVICE)
				.where(Service.SERVICE.ENABLED.isTrue())
				.orderBy(Service.SERVICE.NAME)
				.fetch();
		
		for(ServiceRecord record: records){
			services.add(record.getName());
		}
		return services;
	}

}
