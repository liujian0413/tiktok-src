package com.google.gson;

public enum LongSerializationPolicy {
    DEFAULT {
        public final C6709k serialize(Long l) {
            return new C6712o((Number) l);
        }
    },
    STRING {
        public final C6709k serialize(Long l) {
            return new C6712o(String.valueOf(l));
        }
    };

    public abstract C6709k serialize(Long l);
}
