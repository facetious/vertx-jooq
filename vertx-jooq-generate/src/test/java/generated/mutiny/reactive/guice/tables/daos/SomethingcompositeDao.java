/*
 * This file is generated by jOOQ.
 */
package generated.mutiny.reactive.guice.tables.daos;


import generated.mutiny.reactive.guice.tables.Somethingcomposite;
import generated.mutiny.reactive.guice.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.vertx.core.json.JsonObject;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.smallrye.mutiny.Uni;
import io.github.jklingsporn.vertx.jooq.mutiny.reactive.ReactiveMutinyQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.inject.Singleton
public class SomethingcompositeDao extends AbstractReactiveVertxDAO<SomethingcompositeRecord, generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite, Record2<Integer, Integer>, Uni<List<generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite>>, Uni<generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite>, Uni<Integer>, Uni<Record2<Integer, Integer>>> implements io.github.jklingsporn.vertx.jooq.mutiny.VertxDAO<SomethingcompositeRecord,generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> {
        @javax.inject.Inject

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public SomethingcompositeDao(Configuration configuration, io.vertx.mutiny.sqlclient.SqlClient delegate) {
                super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite.class, new ReactiveMutinyQueryExecutor<SomethingcompositeRecord,generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>(configuration,delegate,generated.mutiny.reactive.guice.tables.mappers.RowMappers.getSomethingcompositeMapper()));
        }

        @Override
        protected Record2<Integer, Integer> getId(generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite object) {
                return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
        }

        /**
     * Find records that have <code>someSecondId IN (values)</code>
     * asynchronously
     */
        public Uni<List<generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite>> findManyBySomesecondid(Collection<Integer> values) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values));
        }

        /**
     * Find records that have <code>someSecondId IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Uni<List<generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite>> findManyBySomesecondid(Collection<Integer> values, int limit) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values),limit);
        }

        /**
     * Find records that have <code>someJsonObject IN (values)</code>
     * asynchronously
     */
        public Uni<List<generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(Collection<JsonObject> values) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values));
        }

        /**
     * Find records that have <code>someJsonObject IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Uni<List<generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(Collection<JsonObject> values, int limit) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values),limit);
        }

        @Override
        public ReactiveMutinyQueryExecutor<SomethingcompositeRecord,generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> queryExecutor(){
                return (ReactiveMutinyQueryExecutor<SomethingcompositeRecord,generated.mutiny.reactive.guice.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>) super.queryExecutor();
        }
}
