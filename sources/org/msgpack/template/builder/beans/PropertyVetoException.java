package org.msgpack.template.builder.beans;

public class PropertyVetoException extends Exception {
    private static final long serialVersionUID = 129596057694162164L;
    private final PropertyChangeEvent evt;

    public PropertyChangeEvent getPropertyChangeEvent() {
        return this.evt;
    }

    public PropertyVetoException(String str, PropertyChangeEvent propertyChangeEvent) {
        super(str);
        this.evt = propertyChangeEvent;
    }
}
