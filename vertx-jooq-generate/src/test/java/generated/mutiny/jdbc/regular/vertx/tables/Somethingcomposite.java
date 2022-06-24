/*
 * This file is generated by jOOQ.
 */
package generated.mutiny.jdbc.regular.vertx.tables;


import generated.mutiny.jdbc.regular.vertx.Keys;
import generated.mutiny.jdbc.regular.vertx.Vertx;
import generated.mutiny.jdbc.regular.vertx.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.JsonObjectConverter;
import io.vertx.core.json.JsonObject;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
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
     * The reference instance of <code>VERTX.SOMETHINGCOMPOSITE</code>
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
     * The column <code>VERTX.SOMETHINGCOMPOSITE.SOMEID</code>.
     */
    public final TableField<SomethingcompositeRecord, Integer> SOMEID = createField(DSL.name("SOMEID"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VERTX.SOMETHINGCOMPOSITE.SOMESECONDID</code>.
     */
    public final TableField<SomethingcompositeRecord, Integer> SOMESECONDID = createField(DSL.name("SOMESECONDID"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VERTX.SOMETHINGCOMPOSITE.SOMEJSONOBJECT</code>.
     */
    public final TableField<SomethingcompositeRecord, JsonObject> SOMEJSONOBJECT = createField(DSL.name("SOMEJSONOBJECT"), SQLDataType.VARCHAR(512), this, "", new JsonObjectConverter());

    private Somethingcomposite(Name alias, Table<SomethingcompositeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Somethingcomposite(Name alias, Table<SomethingcompositeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>VERTX.SOMETHINGCOMPOSITE</code> table reference
     */
    public Somethingcomposite(String alias) {
        this(DSL.name(alias), SOMETHINGCOMPOSITE);
    }

    /**
     * Create an aliased <code>VERTX.SOMETHINGCOMPOSITE</code> table reference
     */
    public Somethingcomposite(Name alias) {
        this(alias, SOMETHINGCOMPOSITE);
    }

    /**
     * Create a <code>VERTX.SOMETHINGCOMPOSITE</code> table reference
     */
    public Somethingcomposite() {
        this(DSL.name("SOMETHINGCOMPOSITE"), null);
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
        return Keys.SYS_PK_10782;
    }

    @Override
    public Somethingcomposite as(String alias) {
        return new Somethingcomposite(DSL.name(alias), this);
    }

    @Override
    public Somethingcomposite as(Name alias) {
        return new Somethingcomposite(alias, this);
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

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, JsonObject> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
