/**
 * This class is generated by jOOQ
 */
package br.lehmkuhl.jooq.model.tables.records;


import br.lehmkuhl.jooq.model.tables.Professional;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ProfessionalRecord extends UpdatableRecordImpl<ProfessionalRecord> implements Record6<Long, String, String, String, Timestamp, Integer> {

    private static final long serialVersionUID = 526874606;

    /**
     * Setter for <code>servicofloripa.professional.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>servicofloripa.professional.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>servicofloripa.professional.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>servicofloripa.professional.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>servicofloripa.professional.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>servicofloripa.professional.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>servicofloripa.professional.url_image</code>.
     */
    public void setUrlImage(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>servicofloripa.professional.url_image</code>.
     */
    public String getUrlImage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>servicofloripa.professional.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>servicofloripa.professional.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>servicofloripa.professional.order</code>.
     */
    public void setOrder(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>servicofloripa.professional.order</code>.
     */
    public Integer getOrder() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, Timestamp, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, Timestamp, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Professional.PROFESSIONAL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Professional.PROFESSIONAL.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Professional.PROFESSIONAL.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Professional.PROFESSIONAL.URL_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Professional.PROFESSIONAL.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Professional.PROFESSIONAL.ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUrlImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessionalRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessionalRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessionalRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessionalRecord value4(String value) {
        setUrlImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessionalRecord value5(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessionalRecord value6(Integer value) {
        setOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessionalRecord values(Long value1, String value2, String value3, String value4, Timestamp value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProfessionalRecord
     */
    public ProfessionalRecord() {
        super(Professional.PROFESSIONAL);
    }

    /**
     * Create a detached, initialised ProfessionalRecord
     */
    public ProfessionalRecord(Long id, String email, String name, String urlImage, Timestamp createdDate, Integer order) {
        super(Professional.PROFESSIONAL);

        set(0, id);
        set(1, email);
        set(2, name);
        set(3, urlImage);
        set(4, createdDate);
        set(5, order);
    }
}
