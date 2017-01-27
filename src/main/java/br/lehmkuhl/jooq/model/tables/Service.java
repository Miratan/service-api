/**
 * This class is generated by jOOQ
 */
package br.lehmkuhl.jooq.model.tables;


import br.lehmkuhl.jooq.model.Keys;
import br.lehmkuhl.jooq.model.Servicofloripa;
import br.lehmkuhl.jooq.model.tables.records.ServiceRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class Service extends TableImpl<ServiceRecord> {

    private static final long serialVersionUID = -2104731677;

    /**
     * The reference instance of <code>servicofloripa.service</code>
     */
    public static final Service SERVICE = new Service();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServiceRecord> getRecordType() {
        return ServiceRecord.class;
    }

    /**
     * The column <code>servicofloripa.service.id</code>.
     */
    public final TableField<ServiceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>servicofloripa.service.name</code>.
     */
    public final TableField<ServiceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>servicofloripa.service.enabled</code>.
     */
    public final TableField<ServiceRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>servicofloripa.service.created_date</code>.
     */
    public final TableField<ServiceRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>servicofloripa.service</code> table reference
     */
    public Service() {
        this("service", null);
    }

    /**
     * Create an aliased <code>servicofloripa.service</code> table reference
     */
    public Service(String alias) {
        this(alias, SERVICE);
    }

    private Service(String alias, Table<ServiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Service(String alias, Table<ServiceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ServiceRecord, Long> getIdentity() {
        return Keys.IDENTITY_SERVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServiceRecord> getPrimaryKey() {
        return Keys.KEY_SERVICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServiceRecord>> getKeys() {
        return Arrays.<UniqueKey<ServiceRecord>>asList(Keys.KEY_SERVICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Service as(String alias) {
        return new Service(alias, this);
    }

    /**
     * Rename this table
     */
    public Service rename(String name) {
        return new Service(name, null);
    }
}