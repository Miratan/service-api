/**
 * This class is generated by jOOQ
 */
package br.lehmkuhl.jooq.model.tables;


import br.lehmkuhl.jooq.model.Keys;
import br.lehmkuhl.jooq.model.Servicofloripa;
import br.lehmkuhl.jooq.model.tables.records.BudgetProfessionalRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class BudgetProfessional extends TableImpl<BudgetProfessionalRecord> {

    private static final long serialVersionUID = -1619327629;

    /**
     * The reference instance of <code>servicofloripa.budget_professional</code>
     */
    public static final BudgetProfessional BUDGET_PROFESSIONAL = new BudgetProfessional();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BudgetProfessionalRecord> getRecordType() {
        return BudgetProfessionalRecord.class;
    }

    /**
     * The column <code>servicofloripa.budget_professional.budget_id</code>.
     */
    public final TableField<BudgetProfessionalRecord, Long> BUDGET_ID = createField("budget_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>servicofloripa.budget_professional.professional_id</code>.
     */
    public final TableField<BudgetProfessionalRecord, Long> PROFESSIONAL_ID = createField("professional_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>servicofloripa.budget_professional</code> table reference
     */
    public BudgetProfessional() {
        this("budget_professional", null);
    }

    /**
     * Create an aliased <code>servicofloripa.budget_professional</code> table reference
     */
    public BudgetProfessional(String alias) {
        this(alias, BUDGET_PROFESSIONAL);
    }

    private BudgetProfessional(String alias, Table<BudgetProfessionalRecord> aliased) {
        this(alias, aliased, null);
    }

    private BudgetProfessional(String alias, Table<BudgetProfessionalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Servicofloripa.SERVICOFLORIPA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BudgetProfessionalRecord> getPrimaryKey() {
        return Keys.KEY_BUDGET_PROFESSIONAL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BudgetProfessionalRecord>> getKeys() {
        return Arrays.<UniqueKey<BudgetProfessionalRecord>>asList(Keys.KEY_BUDGET_PROFESSIONAL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BudgetProfessionalRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BudgetProfessionalRecord, ?>>asList(Keys.FK_BUDGET_HAS_PROFESSIONAL_BUDGET1, Keys.FK_BUDGET_HAS_PROFESSIONAL_PROFESSIONAL1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetProfessional as(String alias) {
        return new BudgetProfessional(alias, this);
    }

    /**
     * Rename this table
     */
    public BudgetProfessional rename(String name) {
        return new BudgetProfessional(name, null);
    }
}
