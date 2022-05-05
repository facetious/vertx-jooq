/*
 * This file is generated by jOOQ.
 */
package generated.rx.reactive.regular.tables.pojos;


import generated.rx.reactive.regular.tables.interfaces.ISomethingwithoutjson;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Somethingwithoutjson implements VertxPojo, ISomethingwithoutjson {

    private static final long serialVersionUID = 1L;

    private Integer someid;
    private String  somestring;

    public Somethingwithoutjson() {}

    public Somethingwithoutjson(ISomethingwithoutjson value) {
        this.someid = value.getSomeid();
        this.somestring = value.getSomestring();
    }

    public Somethingwithoutjson(
        Integer someid,
        String  somestring
    ) {
        this.someid = someid;
        this.somestring = somestring;
    }

        public Somethingwithoutjson(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>vertx.somethingWithoutJson.someId</code>.
     */
    @Override
    public Integer getSomeid() {
        return this.someid;
    }

    /**
     * Setter for <code>vertx.somethingWithoutJson.someId</code>.
     */
    @Override
    public Somethingwithoutjson setSomeid(Integer someid) {
        this.someid = someid;
        return this;
    }

    /**
     * Getter for <code>vertx.somethingWithoutJson.someString</code>.
     */
    @Override
    public String getSomestring() {
        return this.somestring;
    }

    /**
     * Setter for <code>vertx.somethingWithoutJson.someString</code>.
     */
    @Override
    public Somethingwithoutjson setSomestring(String somestring) {
        this.somestring = somestring;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Somethingwithoutjson other = (Somethingwithoutjson) obj;
        if (this.someid == null) {
            if (other.someid != null)
                return false;
        }
        else if (!this.someid.equals(other.someid))
            return false;
        if (this.somestring == null) {
            if (other.somestring != null)
                return false;
        }
        else if (!this.somestring.equals(other.somestring))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.someid == null) ? 0 : this.someid.hashCode());
        result = prime * result + ((this.somestring == null) ? 0 : this.somestring.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Somethingwithoutjson (");

        sb.append(someid);
        sb.append(", ").append(somestring);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISomethingwithoutjson from) {
        setSomeid(from.getSomeid());
        setSomestring(from.getSomestring());
    }

    @Override
    public <E extends ISomethingwithoutjson> E into(E into) {
        into.from(this);
        return into;
    }
}
