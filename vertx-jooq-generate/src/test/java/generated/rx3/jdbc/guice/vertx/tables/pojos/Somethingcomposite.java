/*
 * This file is generated by jOOQ.
 */
package generated.rx3.jdbc.guice.vertx.tables.pojos;


import generated.rx3.jdbc.guice.vertx.tables.interfaces.ISomethingcomposite;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonObject;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Somethingcomposite implements VertxPojo, ISomethingcomposite {

    private static final long serialVersionUID = 1L;

    private Integer someid;
    private Integer somesecondid;
    private JsonObject somejsonobject;

    public Somethingcomposite() {}

    public Somethingcomposite(ISomethingcomposite value) {
        this.someid = value.getSomeid();
        this.somesecondid = value.getSomesecondid();
        this.somejsonobject = value.getSomejsonobject();
    }

    public Somethingcomposite(
        Integer someid,
        Integer somesecondid,
        JsonObject somejsonobject
    ) {
        this.someid = someid;
        this.somesecondid = somesecondid;
        this.somejsonobject = somejsonobject;
    }

        public Somethingcomposite(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>VERTX.SOMETHINGCOMPOSITE.SOMEID</code>.
     */
    @Override
    public Integer getSomeid() {
        return this.someid;
    }

    /**
     * Setter for <code>VERTX.SOMETHINGCOMPOSITE.SOMEID</code>.
     */
    @Override
    public Somethingcomposite setSomeid(Integer someid) {
        this.someid = someid;
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHINGCOMPOSITE.SOMESECONDID</code>.
     */
    @Override
    public Integer getSomesecondid() {
        return this.somesecondid;
    }

    /**
     * Setter for <code>VERTX.SOMETHINGCOMPOSITE.SOMESECONDID</code>.
     */
    @Override
    public Somethingcomposite setSomesecondid(Integer somesecondid) {
        this.somesecondid = somesecondid;
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHINGCOMPOSITE.SOMEJSONOBJECT</code>.
     */
    @Override
    public JsonObject getSomejsonobject() {
        return this.somejsonobject;
    }

    /**
     * Setter for <code>VERTX.SOMETHINGCOMPOSITE.SOMEJSONOBJECT</code>.
     */
    @Override
    public Somethingcomposite setSomejsonobject(JsonObject somejsonobject) {
        this.somejsonobject = somejsonobject;
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
        final Somethingcomposite other = (Somethingcomposite) obj;
        if (this.someid == null) {
            if (other.someid != null)
                return false;
        }
        else if (!this.someid.equals(other.someid))
            return false;
        if (this.somesecondid == null) {
            if (other.somesecondid != null)
                return false;
        }
        else if (!this.somesecondid.equals(other.somesecondid))
            return false;
        if (this.somejsonobject == null) {
            if (other.somejsonobject != null)
                return false;
        }
        else if (!this.somejsonobject.equals(other.somejsonobject))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.someid == null) ? 0 : this.someid.hashCode());
        result = prime * result + ((this.somesecondid == null) ? 0 : this.somesecondid.hashCode());
        result = prime * result + ((this.somejsonobject == null) ? 0 : this.somejsonobject.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Somethingcomposite (");

        sb.append(someid);
        sb.append(", ").append(somesecondid);
        sb.append(", ").append(somejsonobject);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISomethingcomposite from) {
        setSomeid(from.getSomeid());
        setSomesecondid(from.getSomesecondid());
        setSomejsonobject(from.getSomejsonobject());
    }

    @Override
    public <E extends ISomethingcomposite> E into(E into) {
        into.from(this);
        return into;
    }
}
