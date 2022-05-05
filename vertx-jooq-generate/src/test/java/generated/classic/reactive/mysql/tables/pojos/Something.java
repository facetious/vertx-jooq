/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.mysql.tables.pojos;


import generated.classic.reactive.mysql.enums.SomethingSomeenum;
import generated.classic.reactive.mysql.tables.interfaces.ISomething;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Something implements VertxPojo, ISomething {

    private static final long serialVersionUID = 1L;

    private Integer           someid;
    private String            somestring;
    private Long              somehugenumber;
    private Short             somesmallnumber;
    private Integer           someregularnumber;
    private Double            somedouble;
    private BigDecimal        somedecimal;
    private SomethingSomeenum someenum;
    private JsonObject        somejsonobject;
    private JsonArray         somejsonarray;
    private LocalDateTime     sometimestamp;

    public Something() {}

    public Something(ISomething value) {
        this.someid = value.getSomeid();
        this.somestring = value.getSomestring();
        this.somehugenumber = value.getSomehugenumber();
        this.somesmallnumber = value.getSomesmallnumber();
        this.someregularnumber = value.getSomeregularnumber();
        this.somedouble = value.getSomedouble();
        this.somedecimal = value.getSomedecimal();
        this.someenum = value.getSomeenum();
        this.somejsonobject = value.getSomejsonobject();
        this.somejsonarray = value.getSomejsonarray();
        this.sometimestamp = value.getSometimestamp();
    }

    public Something(
        Integer           someid,
        String            somestring,
        Long              somehugenumber,
        Short             somesmallnumber,
        Integer           someregularnumber,
        Double            somedouble,
        BigDecimal        somedecimal,
        SomethingSomeenum someenum,
        JsonObject        somejsonobject,
        JsonArray         somejsonarray,
        LocalDateTime     sometimestamp
    ) {
        this.someid = someid;
        this.somestring = somestring;
        this.somehugenumber = somehugenumber;
        this.somesmallnumber = somesmallnumber;
        this.someregularnumber = someregularnumber;
        this.somedouble = somedouble;
        this.somedecimal = somedecimal;
        this.someenum = someenum;
        this.somejsonobject = somejsonobject;
        this.somejsonarray = somejsonarray;
        this.sometimestamp = sometimestamp;
    }

        public Something(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>vertx.something.someId</code>.
     */
    @Override
    public Integer getSomeid() {
        return this.someid;
    }

    /**
     * Setter for <code>vertx.something.someId</code>.
     */
    @Override
    public Something setSomeid(Integer someid) {
        this.someid = someid;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someString</code>.
     */
    @Override
    public String getSomestring() {
        return this.somestring;
    }

    /**
     * Setter for <code>vertx.something.someString</code>.
     */
    @Override
    public Something setSomestring(String somestring) {
        this.somestring = somestring;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someHugeNumber</code>.
     */
    @Override
    public Long getSomehugenumber() {
        return this.somehugenumber;
    }

    /**
     * Setter for <code>vertx.something.someHugeNumber</code>.
     */
    @Override
    public Something setSomehugenumber(Long somehugenumber) {
        this.somehugenumber = somehugenumber;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someSmallNumber</code>.
     */
    @Override
    public Short getSomesmallnumber() {
        return this.somesmallnumber;
    }

    /**
     * Setter for <code>vertx.something.someSmallNumber</code>.
     */
    @Override
    public Something setSomesmallnumber(Short somesmallnumber) {
        this.somesmallnumber = somesmallnumber;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someRegularNumber</code>.
     */
    @Override
    public Integer getSomeregularnumber() {
        return this.someregularnumber;
    }

    /**
     * Setter for <code>vertx.something.someRegularNumber</code>.
     */
    @Override
    public Something setSomeregularnumber(Integer someregularnumber) {
        this.someregularnumber = someregularnumber;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someDouble</code>.
     */
    @Override
    public Double getSomedouble() {
        return this.somedouble;
    }

    /**
     * Setter for <code>vertx.something.someDouble</code>.
     */
    @Override
    public Something setSomedouble(Double somedouble) {
        this.somedouble = somedouble;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someDecimal</code>.
     */
    @Override
    public BigDecimal getSomedecimal() {
        return this.somedecimal;
    }

    /**
     * Setter for <code>vertx.something.someDecimal</code>.
     */
    @Override
    public Something setSomedecimal(BigDecimal somedecimal) {
        this.somedecimal = somedecimal;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someEnum</code>.
     */
    @Override
    public SomethingSomeenum getSomeenum() {
        return this.someenum;
    }

    /**
     * Setter for <code>vertx.something.someEnum</code>.
     */
    @Override
    public Something setSomeenum(SomethingSomeenum someenum) {
        this.someenum = someenum;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someJsonObject</code>.
     */
    @Override
    public JsonObject getSomejsonobject() {
        return this.somejsonobject;
    }

    /**
     * Setter for <code>vertx.something.someJsonObject</code>.
     */
    @Override
    public Something setSomejsonobject(JsonObject somejsonobject) {
        this.somejsonobject = somejsonobject;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someJsonArray</code>.
     */
    @Override
    public JsonArray getSomejsonarray() {
        return this.somejsonarray;
    }

    /**
     * Setter for <code>vertx.something.someJsonArray</code>.
     */
    @Override
    public Something setSomejsonarray(JsonArray somejsonarray) {
        this.somejsonarray = somejsonarray;
        return this;
    }

    /**
     * Getter for <code>vertx.something.someTimestamp</code>.
     */
    @Override
    public LocalDateTime getSometimestamp() {
        return this.sometimestamp;
    }

    /**
     * Setter for <code>vertx.something.someTimestamp</code>.
     */
    @Override
    public Something setSometimestamp(LocalDateTime sometimestamp) {
        this.sometimestamp = sometimestamp;
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
        final Something other = (Something) obj;
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
        if (this.somehugenumber == null) {
            if (other.somehugenumber != null)
                return false;
        }
        else if (!this.somehugenumber.equals(other.somehugenumber))
            return false;
        if (this.somesmallnumber == null) {
            if (other.somesmallnumber != null)
                return false;
        }
        else if (!this.somesmallnumber.equals(other.somesmallnumber))
            return false;
        if (this.someregularnumber == null) {
            if (other.someregularnumber != null)
                return false;
        }
        else if (!this.someregularnumber.equals(other.someregularnumber))
            return false;
        if (this.somedouble == null) {
            if (other.somedouble != null)
                return false;
        }
        else if (!this.somedouble.equals(other.somedouble))
            return false;
        if (this.somedecimal == null) {
            if (other.somedecimal != null)
                return false;
        }
        else if (!this.somedecimal.equals(other.somedecimal))
            return false;
        if (this.someenum == null) {
            if (other.someenum != null)
                return false;
        }
        else if (!this.someenum.equals(other.someenum))
            return false;
        if (this.somejsonobject == null) {
            if (other.somejsonobject != null)
                return false;
        }
        else if (!this.somejsonobject.equals(other.somejsonobject))
            return false;
        if (this.somejsonarray == null) {
            if (other.somejsonarray != null)
                return false;
        }
        else if (!this.somejsonarray.equals(other.somejsonarray))
            return false;
        if (this.sometimestamp == null) {
            if (other.sometimestamp != null)
                return false;
        }
        else if (!this.sometimestamp.equals(other.sometimestamp))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.someid == null) ? 0 : this.someid.hashCode());
        result = prime * result + ((this.somestring == null) ? 0 : this.somestring.hashCode());
        result = prime * result + ((this.somehugenumber == null) ? 0 : this.somehugenumber.hashCode());
        result = prime * result + ((this.somesmallnumber == null) ? 0 : this.somesmallnumber.hashCode());
        result = prime * result + ((this.someregularnumber == null) ? 0 : this.someregularnumber.hashCode());
        result = prime * result + ((this.somedouble == null) ? 0 : this.somedouble.hashCode());
        result = prime * result + ((this.somedecimal == null) ? 0 : this.somedecimal.hashCode());
        result = prime * result + ((this.someenum == null) ? 0 : this.someenum.hashCode());
        result = prime * result + ((this.somejsonobject == null) ? 0 : this.somejsonobject.hashCode());
        result = prime * result + ((this.somejsonarray == null) ? 0 : this.somejsonarray.hashCode());
        result = prime * result + ((this.sometimestamp == null) ? 0 : this.sometimestamp.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Something (");

        sb.append(someid);
        sb.append(", ").append(somestring);
        sb.append(", ").append(somehugenumber);
        sb.append(", ").append(somesmallnumber);
        sb.append(", ").append(someregularnumber);
        sb.append(", ").append(somedouble);
        sb.append(", ").append(somedecimal);
        sb.append(", ").append(someenum);
        sb.append(", ").append(somejsonobject);
        sb.append(", ").append(somejsonarray);
        sb.append(", ").append(sometimestamp);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISomething from) {
        setSomeid(from.getSomeid());
        setSomestring(from.getSomestring());
        setSomehugenumber(from.getSomehugenumber());
        setSomesmallnumber(from.getSomesmallnumber());
        setSomeregularnumber(from.getSomeregularnumber());
        setSomedouble(from.getSomedouble());
        setSomedecimal(from.getSomedecimal());
        setSomeenum(from.getSomeenum());
        setSomejsonobject(from.getSomejsonobject());
        setSomejsonarray(from.getSomejsonarray());
        setSometimestamp(from.getSometimestamp());
    }

    @Override
    public <E extends ISomething> E into(E into) {
        into.from(this);
        return into;
    }
}
