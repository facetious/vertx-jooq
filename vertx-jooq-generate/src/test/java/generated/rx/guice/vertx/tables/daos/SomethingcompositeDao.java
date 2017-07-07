/*
 * This file is generated by jOOQ.
*/
package generated.rx.guice.vertx.tables.daos;


import generated.rx.guice.vertx.tables.Somethingcomposite;
import generated.rx.guice.vertx.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.rx.VertxDAO;
import io.vertx.core.json.JsonObject;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


import rx.Completable;
import rx.Observable;
import rx.Single;
import io.github.jklingsporn.vertx.jooq.rx.util.RXTool;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingcompositeDao extends DAOImpl<SomethingcompositeRecord, generated.rx.guice.vertx.tables.pojos.Somethingcomposite, Record2<Integer, Integer>> implements VertxDAO<generated.rx.guice.vertx.tables.records.SomethingcompositeRecord,generated.rx.guice.vertx.tables.pojos.Somethingcomposite,org.jooq.Record2<java.lang.Integer, java.lang.Integer>> {

    /**
     * Create a new SomethingcompositeDao without any configuration
     */
    public SomethingcompositeDao() {
        super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.rx.guice.vertx.tables.pojos.Somethingcomposite.class);
    }

    /**
     * Create a new SomethingcompositeDao with an attached configuration
     */
    public SomethingcompositeDao(Configuration configuration) {
        super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.rx.guice.vertx.tables.pojos.Somethingcomposite.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(generated.rx.guice.vertx.tables.pojos.Somethingcomposite object) {
        return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
    }

    /**
     * Fetch records that have <code>SOMEID IN (values)</code>
     */
    public List<generated.rx.guice.vertx.tables.pojos.Somethingcomposite> fetchBySomeid(Integer... values) {
        return fetch(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, values);
    }

    /**
     * Fetch records that have <code>SOMESECONDID IN (values)</code>
     */
    public List<generated.rx.guice.vertx.tables.pojos.Somethingcomposite> fetchBySomesecondid(Integer... values) {
        return fetch(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID, values);
    }

    /**
     * Fetch records that have <code>SOMEJSONOBJECT IN (values)</code>
     */
    public List<generated.rx.guice.vertx.tables.pojos.Somethingcomposite> fetchBySomejsonobject(JsonObject... values) {
        return fetch(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT, values);
    }

    /**
     * Fetch records that have <code>SOMEID IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.guice.vertx.tables.pojos.Somethingcomposite>> fetchBySomeidAsync(List<Integer> values) {
        return fetchAsync(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID,values);
    }

    /**
     * Fetch records that have <code>SOMEID IN (values)</code> asynchronously
     */
    public Observable<generated.rx.guice.vertx.tables.pojos.Somethingcomposite> fetchBySomeidObservable(List<Integer> values) {
        return fetchObservable(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID,values);
    }

    /**
     * Fetch records that have <code>SOMESECONDID IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.guice.vertx.tables.pojos.Somethingcomposite>> fetchBySomesecondidAsync(List<Integer> values) {
        return fetchAsync(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID,values);
    }

    /**
     * Fetch records that have <code>SOMESECONDID IN (values)</code> asynchronously
     */
    public Observable<generated.rx.guice.vertx.tables.pojos.Somethingcomposite> fetchBySomesecondidObservable(List<Integer> values) {
        return fetchObservable(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID,values);
    }

    /**
     * Fetch records that have <code>SOMEJSONOBJECT IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.guice.vertx.tables.pojos.Somethingcomposite>> fetchBySomejsonobjectAsync(List<JsonObject> values) {
        return fetchAsync(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT,values);
    }

    /**
     * Fetch records that have <code>SOMEJSONOBJECT IN (values)</code> asynchronously
     */
    public Observable<generated.rx.guice.vertx.tables.pojos.Somethingcomposite> fetchBySomejsonobjectObservable(List<JsonObject> values) {
        return fetchObservable(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT,values);
    }

    private io.vertx.rxjava.core.Vertx vertx;

    @javax.inject.Inject
    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = new io.vertx.rxjava.core.Vertx(vertx);
    }

    @Override
    public void setVertx(io.vertx.rxjava.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.rxjava.core.Vertx vertx() {
        return this.vertx;
    }


    @javax.inject.Inject
    @Override
    public void setConfiguration(Configuration configuration) {
        super.setConfiguration(configuration);
    }

}
