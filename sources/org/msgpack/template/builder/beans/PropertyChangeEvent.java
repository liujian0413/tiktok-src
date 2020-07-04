package org.msgpack.template.builder.beans;

import java.util.EventObject;

public class PropertyChangeEvent extends EventObject {
    private static final long serialVersionUID = 7042693688939648123L;
    Object newValue;
    Object oldValue;
    Object propagationId;
    String propertyName;

    public Object getNewValue() {
        return this.newValue;
    }

    public Object getOldValue() {
        return this.oldValue;
    }

    public Object getPropagationId() {
        return this.propagationId;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

    public void setPropagationId(Object obj) {
        this.propagationId = obj;
    }

    public PropertyChangeEvent(Object obj, String str, Object obj2, Object obj3) {
        super(obj);
        this.propertyName = str;
        this.oldValue = obj2;
        this.newValue = obj3;
    }
}
