/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.mysql.tables.pojos;


import generated.classic.reactive.mysql.tables.interfaces.IStringkey;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Stringkey implements VertxPojo, IStringkey {

    private static final long serialVersionUID = 1L;

    private String key;
    private Integer value;

    public Stringkey() {}

    public Stringkey(IStringkey value) {
        this.key = value.getKey();
        this.value = value.getValue();
    }

    public Stringkey(
        String key,
        Integer value
    ) {
        this.key = key;
        this.value = value;
    }

        public Stringkey(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>vertx.stringKey.key</code>.
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>vertx.stringKey.key</code>.
     */
    @Override
    public Stringkey setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>vertx.stringKey.value</code>.
     */
    @Override
    public Integer getValue() {
        return this.value;
    }

    /**
     * Setter for <code>vertx.stringKey.value</code>.
     */
    @Override
    public Stringkey setValue(Integer value) {
        this.value = value;
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
        final Stringkey other = (Stringkey) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.value == null) {
            if (other.value != null)
                return false;
        }
        else if (!this.value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stringkey (");

        sb.append(key);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IStringkey from) {
        setKey(from.getKey());
        setValue(from.getValue());
    }

    @Override
    public <E extends IStringkey> E into(E into) {
        into.from(this);
        return into;
    }
}
