/**
 * This class is generated by jOOQ
 */
package br.lehmkuhl.jooq.model;


import br.lehmkuhl.jooq.model.tables.Budget;
import br.lehmkuhl.jooq.model.tables.BudgetProfessional;
import br.lehmkuhl.jooq.model.tables.Contact;
import br.lehmkuhl.jooq.model.tables.Professional;
import br.lehmkuhl.jooq.model.tables.ProfessionalContact;
import br.lehmkuhl.jooq.model.tables.ProfessionalService;
import br.lehmkuhl.jooq.model.tables.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Servicofloripa extends SchemaImpl {

    private static final long serialVersionUID = -482207089;

    /**
     * The reference instance of <code>servicofloripa</code>
     */
    public static final Servicofloripa SERVICOFLORIPA = new Servicofloripa();

    /**
     * The table <code>servicofloripa.budget</code>.
     */
    public final Budget BUDGET = br.lehmkuhl.jooq.model.tables.Budget.BUDGET;

    /**
     * The table <code>servicofloripa.budget_professional</code>.
     */
    public final BudgetProfessional BUDGET_PROFESSIONAL = br.lehmkuhl.jooq.model.tables.BudgetProfessional.BUDGET_PROFESSIONAL;

    /**
     * The table <code>servicofloripa.contact</code>.
     */
    public final Contact CONTACT = br.lehmkuhl.jooq.model.tables.Contact.CONTACT;

    /**
     * The table <code>servicofloripa.professional</code>.
     */
    public final Professional PROFESSIONAL = br.lehmkuhl.jooq.model.tables.Professional.PROFESSIONAL;

    /**
     * The table <code>servicofloripa.professional_contact</code>.
     */
    public final ProfessionalContact PROFESSIONAL_CONTACT = br.lehmkuhl.jooq.model.tables.ProfessionalContact.PROFESSIONAL_CONTACT;

    /**
     * The table <code>servicofloripa.professional_service</code>.
     */
    public final ProfessionalService PROFESSIONAL_SERVICE = br.lehmkuhl.jooq.model.tables.ProfessionalService.PROFESSIONAL_SERVICE;

    /**
     * The table <code>servicofloripa.service</code>.
     */
    public final Service SERVICE = br.lehmkuhl.jooq.model.tables.Service.SERVICE;

    /**
     * No further instances allowed
     */
    private Servicofloripa() {
        super("servicofloripa", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Budget.BUDGET,
            BudgetProfessional.BUDGET_PROFESSIONAL,
            Contact.CONTACT,
            Professional.PROFESSIONAL,
            ProfessionalContact.PROFESSIONAL_CONTACT,
            ProfessionalService.PROFESSIONAL_SERVICE,
            Service.SERVICE);
    }
}
