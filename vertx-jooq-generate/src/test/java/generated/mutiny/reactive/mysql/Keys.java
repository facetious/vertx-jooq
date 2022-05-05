/*
 * This file is generated by jOOQ.
 */
package generated.mutiny.reactive.mysql;


import generated.mutiny.reactive.mysql.tables.Something;
import generated.mutiny.reactive.mysql.tables.Somethingcomposite;
import generated.mutiny.reactive.mysql.tables.Somethingwithoutjson;
import generated.mutiny.reactive.mysql.tables.records.SomethingRecord;
import generated.mutiny.reactive.mysql.tables.records.SomethingcompositeRecord;
import generated.mutiny.reactive.mysql.tables.records.SomethingwithoutjsonRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * vertx.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SomethingRecord> KEY_SOMETHING_PRIMARY = Internal.createUniqueKey(Something.SOMETHING, DSL.name("KEY_something_PRIMARY"), new TableField[] { Something.SOMETHING.SOMEID }, true);
    public static final UniqueKey<SomethingcompositeRecord> KEY_SOMETHINGCOMPOSITE_PRIMARY = Internal.createUniqueKey(Somethingcomposite.SOMETHINGCOMPOSITE, DSL.name("KEY_somethingComposite_PRIMARY"), new TableField[] { Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID }, true);
    public static final UniqueKey<SomethingwithoutjsonRecord> KEY_SOMETHINGWITHOUTJSON_PRIMARY = Internal.createUniqueKey(Somethingwithoutjson.SOMETHINGWITHOUTJSON, DSL.name("KEY_somethingWithoutJson_PRIMARY"), new TableField[] { Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID }, true);
}
