/*
 * This file is generated by jOOQ.
 */
package generated.rx3.reactive.regular.tables.daos;


import generated.rx3.reactive.regular.tables.Somethingcomposite;
import generated.rx3.reactive.regular.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.vertx.core.json.JsonObject;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.reactivex.rxjava3.core.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx3.reactivepg.ReactiveRXQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingcompositeDao extends AbstractReactiveVertxDAO<SomethingcompositeRecord, generated.rx3.reactive.regular.tables.pojos.Somethingcomposite, Record2<Integer, Integer>, Single<List<generated.rx3.reactive.regular.tables.pojos.Somethingcomposite>>, Single<Optional<generated.rx3.reactive.regular.tables.pojos.Somethingcomposite>>, Single<Integer>, Single<Record2<Integer, Integer>>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<SomethingcompositeRecord,generated.rx3.reactive.regular.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public SomethingcompositeDao(Configuration configuration, io.vertx.rxjava3.sqlclient.SqlClient delegate) {
                super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.rx3.reactive.regular.tables.pojos.Somethingcomposite.class, new ReactiveRXQueryExecutor<SomethingcompositeRecord,generated.rx3.reactive.regular.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>(configuration,delegate,generated.rx3.reactive.regular.tables.mappers.RowMappers.getSomethingcompositeMapper()));
        }

        @Override
        protected Record2<Integer, Integer> getId(generated.rx3.reactive.regular.tables.pojos.Somethingcomposite object) {
                return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
        }

        /**
     * Find records that have <code>someSecondId IN (values)</code>
     * asynchronously
     */
        public Single<List<generated.rx3.reactive.regular.tables.pojos.Somethingcomposite>> findManyBySomesecondid(Collection<Integer> values) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values));
        }

        /**
     * Find records that have <code>someSecondId IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Single<List<generated.rx3.reactive.regular.tables.pojos.Somethingcomposite>> findManyBySomesecondid(Collection<Integer> values, int limit) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values),limit);
        }

        /**
     * Find records that have <code>someJsonObject IN (values)</code>
     * asynchronously
     */
        public Single<List<generated.rx3.reactive.regular.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(Collection<JsonObject> values) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values));
        }

        /**
     * Find records that have <code>someJsonObject IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Single<List<generated.rx3.reactive.regular.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(Collection<JsonObject> values, int limit) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values),limit);
        }

        @Override
        public ReactiveRXQueryExecutor<SomethingcompositeRecord,generated.rx3.reactive.regular.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> queryExecutor(){
                return (ReactiveRXQueryExecutor<SomethingcompositeRecord,generated.rx3.reactive.regular.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>) super.queryExecutor();
        }
}
