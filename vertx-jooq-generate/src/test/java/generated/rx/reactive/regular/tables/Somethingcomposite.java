/*
 * This file is generated by jOOQ.
 */
package generated.rx.reactive.regular.tables;


import generated.rx.reactive.regular.Keys;
import generated.rx.reactive.regular.Vertx;
import generated.rx.reactive.regular.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.JsonObjectConverter;
import io.vertx.core.json.JsonObject;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
public class Somethingcomposite extends TableImpl<SomethingcompositeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vertx.somethingComposite</code>
     */
    public static final Somethingcomposite SOMETHINGCOMPOSITE = new Somethingcomposite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SomethingcompositeRecord> getRecordType() {
        return SomethingcompositeRecord.class;
    }

    /**
     * The column <code>vertx.somethingComposite.someId</code>.
     */
    public final TableField<SomethingcompositeRecord, Integer> SOMEID = createField(DSL.name("someId"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vertx.somethingComposite.someSecondId</code>.
     */
    public final TableField<SomethingcompositeRecord, Integer> SOMESECONDID = createField(DSL.name("someSecondId"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vertx.somethingComposite.someJsonObject</code>.
     */
    public final TableField<SomethingcompositeRecord, JsonObject> SOMEJSONOBJECT = createField(DSL.name("someJsonObject"), SQLDataType.VARCHAR(512), this, "", new JsonObjectConverter());

    private Somethingcomposite(Name alias, Table<SomethingcompositeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Somethingcomposite(Name alias, Table<SomethingcompositeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vertx.somethingComposite</code> table reference
     */
    public Somethingcomposite(String alias) {
        this(DSL.name(alias), SOMETHINGCOMPOSITE);
    }

    /**
     * Create an aliased <code>vertx.somethingComposite</code> table reference
     */
    public Somethingcomposite(Name alias) {
        this(alias, SOMETHINGCOMPOSITE);
    }

    /**
     * Create a <code>vertx.somethingComposite</code> table reference
     */
    public Somethingcomposite() {
        this(DSL.name("somethingComposite"), null);
    }

    public <O extends Record> Somethingcomposite(Table<O> child, ForeignKey<O, SomethingcompositeRecord> key) {
        super(child, key, SOMETHINGCOMPOSITE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Vertx.VERTX;
    }

    @Override
    public UniqueKey<SomethingcompositeRecord> getPrimaryKey() {
        return Keys.SOMETHINGCOMPOSITE_PKEY;
    }

    @Override
    public Somethingcomposite as(String alias) {
        return new Somethingcomposite(DSL.name(alias), this);
    }

    @Override
    public Somethingcomposite as(Name alias) {
        return new Somethingcomposite(alias, this);
    }

    @Override
    public Somethingcomposite as(Table<?> alias) {
        return new Somethingcomposite(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingcomposite rename(String name) {
        return new Somethingcomposite(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingcomposite rename(Name name) {
        return new Somethingcomposite(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Somethingcomposite rename(Table<?> name) {
        return new Somethingcomposite(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, JsonObject> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super Integer, ? super JsonObject, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super Integer, ? super JsonObject, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
