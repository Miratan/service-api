package br.lehmkuhl.service;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.lehmkuhl.jooq.model.tables.Professional;
import br.lehmkuhl.jooq.model.tables.records.ProfessionalRecord;
import br.lehmkuhl.model.ProfesionalBase;

@Component
public class ProfessionalService {

	@Autowired
	private DSLContext dslContext;

//	public List<ProfessionalRecord> searchByName(String name) {
//		Result<ProfessionalRecord> result = dslContext
//				.selectFrom(Professional.PROFESSIONAL)
//				.where(Professional.PROFESSIONAL.FIRST_NAME.likeIgnoreCase("%" + name + "%")).fetch();
//		return result;
//		return null;
//	}

	public void save(ProfesionalBase professional) {
		dslContext.insertInto(Professional.PROFESSIONAL)
				.set(Professional.PROFESSIONAL.EMAIL, professional.getEmail())
				.set(Professional.PROFESSIONAL.NAME, professional.getName())
				.execute();
	}

	public List<ProfesionalBase> list() {
		List<ProfesionalBase> professionals = new ArrayList<>();

		Result<ProfessionalRecord> records = dslContext.selectFrom(Professional.PROFESSIONAL)
				.orderBy(Professional.PROFESSIONAL.ORDER).fetch();
		for(ProfessionalRecord record: records){
			ProfesionalBase base = new ProfesionalBase();
			base.setId(record.getId());
			base.setName(record.getName());
			base.setEmail(record.getEmail());
			professionals.add(base);
		}
		return professionals;
	}

}
