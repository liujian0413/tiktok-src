package org.msgpack.template.builder;

import java.lang.reflect.Type;
import org.msgpack.template.FieldOption;

public abstract class FieldEntry {
    public FieldOption option;

    public abstract Object get(Object obj);

    public abstract Type getGenericType();

    public abstract String getName();

    public abstract Class<?> getType();

    public abstract void set(Object obj, Object obj2);

    public FieldEntry() {
        this(FieldOption.IGNORE);
    }

    public boolean isAvailable() {
        if (this.option != FieldOption.IGNORE) {
            return true;
        }
        return false;
    }

    public boolean isNotNullable() {
        if (this.option == FieldOption.NOTNULLABLE) {
            return true;
        }
        return false;
    }

    public boolean isOptional() {
        if (this.option == FieldOption.OPTIONAL) {
            return true;
        }
        return false;
    }

    public FieldEntry(FieldOption fieldOption) {
        this.option = fieldOption;
    }
}
