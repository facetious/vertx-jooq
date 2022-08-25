/*
 * This file is generated by jOOQ.
 */
package generated.mutiny.reactive.guice.tables;


import generated.mutiny.reactive.guice.Keys;
import generated.mutiny.reactive.guice.Vertx;
import generated.mutiny.reactive.guice.tables.records.SomethingwithoutjsonRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Somethingwithoutjson extends TableImpl<SomethingwithoutjsonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vertx.somethingWithoutJson</code>
     */
    public static final Somethingwithoutjson SOMETHINGWITHOUTJSON = new Somethingwithoutjson();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SomethingwithoutjsonRecord> getRecordType() {
        return SomethingwithoutjsonRecord.class;
    }

    /**
     * The column <code>vertx.somethingWithoutJson.someId</code>.
     */
    public final TableField<SomethingwithoutjsonRecord, Integer> SOMEID = createField(DSL.name("someId"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("nextval('\"somethingWithoutJson_someId_seq\"'::regclass)", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vertx.somethingWithoutJson.someString</code>.
     */
    public final TableField<SomethingwithoutjsonRecord, String> SOMESTRING = createField(DSL.name("someString"), SQLDataType.VARCHAR(45).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    private Somethingwithoutjson(Name alias, Table<SomethingwithoutjsonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Somethingwithoutjson(Name alias, Table<SomethingwithoutjsonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vertx.somethingWithoutJson</code> table reference
     */
    public Somethingwithoutjson(String alias) {
        this(DSL.name(alias), SOMETHINGWITHOUTJSON);
    }

    /**
     * Create an aliased <code>vertx.somethingWithoutJson</code> table reference
     */
    public Somethingwithoutjson(Name alias) {
        this(alias, SOMETHINGWITHOUTJSON);
    }

    /**
     * Create a <code>vertx.somethingWithoutJson</code> table reference
     */
    public Somethingwithoutjson() {
        this(DSL.name("somethingWithoutJson"), null);
    }

    public <O extends Record> Somethingwithoutjson(Table<O> child, ForeignKey<O, SomethingwithoutjsonRecord> key) {
        super(child, key, SOMETHINGWITHOUTJSON);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Vertx.VERTX;
    }

    @Override
    public UniqueKey<SomethingwithoutjsonRecord> getPrimaryKey() {
        return Keys.SOMETHINGWITHOUTJSON_PKEY;
    }

    @Override
    public Somethingwithoutjson as(String alias) {
        return new Somethingwithoutjson(DSL.name(alias), this);
    }

    @Override
    public Somethingwithoutjson as(Name alias) {
        return new Somethingwithoutjson(alias, this);
    }

    @Override
    public Somethingwithoutjson as(Table<?> alias) {
        return new Somethingwithoutjson(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingwithoutjson rename(String name) {
        return new Somethingwithoutjson(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingwithoutjson rename(Name name) {
        return new Somethingwithoutjson(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingwithoutjson rename(Table<?> name) {
        return new Somethingwithoutjson(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
