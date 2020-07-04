package org.aspectj.lang.reflect;

public interface DeclareAnnotation {

    public enum Kind {
        Field,
        Method,
        Constructor,
        Type
    }
}
